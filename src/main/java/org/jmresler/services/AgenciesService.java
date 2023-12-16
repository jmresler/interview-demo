package org.jmresler.services;

import lombok.extern.slf4j.Slf4j;
import org.jmresler.exceptions.AgenciesNotFoundException;
import org.jmresler.model.dtos.AgenciesDTO;
import org.jmresler.model.mappers.AgenciesMapper;
import org.jmresler.model.Agencies;
import org.jmresler.model.dao.AgenciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class AgenciesService {

    protected AgenciesRepository repository;
    protected AgenciesMapper mapper;

    @Autowired
    public AgenciesService(
            AgenciesRepository repository,
            AgenciesMapper mapper
    ) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Agencies findAgenciesById(final Integer id) throws AgenciesNotFoundException {
        return repository.findById(id).orElseThrow(AgenciesNotFoundException::new);
    }

    @Transactional
    public List<AgenciesDTO> findAgenciesByOri(final String ori) throws AgenciesNotFoundException {
        // we use the mapping to DTO's to eliminate any DB interactions
        // which would happen if we passed an entity.
        // this also allows connections to be closed quickly
        var agenciesDtosList = new ArrayList<AgenciesDTO>();
        var agenciesList = repository.findByOri(ori);

        if (agenciesList.size() == 1 && agenciesList.getFirst().getAgencyId() == -1)
            throw new AgenciesNotFoundException();
        else {
            agenciesList.forEach(agencies -> {
                agenciesDtosList.add(mapper.agenciesToAgenciesDTO(agencies));
            });
        }

        agenciesDtosList.forEach(agency -> log.debug(agency.toString()));

        return agenciesDtosList;
    }

}
