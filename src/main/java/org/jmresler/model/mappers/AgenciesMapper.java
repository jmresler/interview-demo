package org.jmresler.model.mappers;

import org.jmresler.model.Agencies;
import org.jmresler.model.dtos.AgenciesDTO;
import org.mapstruct.Mapper;

@Mapper
public interface AgenciesMapper {

    AgenciesDTO agenciesToAgenciesDTO(Agencies agencies);
    Agencies agenciesDTOToAgencies(AgenciesDTO agenciesDTO);
}
