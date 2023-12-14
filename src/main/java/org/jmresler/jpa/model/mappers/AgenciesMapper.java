package org.jmresler.jpa.model.mappers;

import org.jmresler.jpa.model.Agencies;
import org.jmresler.jpa.model.dtos.AgenciesDTO;
import org.mapstruct.Mapper;

@Mapper
public interface AgenciesMapper {

    AgenciesDTO agenciesToAgenciesDTO(Agencies agencies);
}
