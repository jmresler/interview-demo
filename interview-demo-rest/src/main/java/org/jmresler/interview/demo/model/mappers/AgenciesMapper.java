package org.jmresler.interview.demo.model.mappers;

import org.jmresler.interview.demo.model.Agencies;
import org.jmresler.interview.demo.model.dtos.AgenciesDTO;
import org.mapstruct.Mapper;

@Mapper
public interface AgenciesMapper {

    AgenciesDTO agenciesToAgenciesDTO(Agencies agencies);
    Agencies agenciesDTOToAgencies(AgenciesDTO agenciesDTO);
}
