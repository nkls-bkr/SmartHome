package com.matz.application.rest.mapper;

import com.matz.domain.model.AirData;
import com.matz.application.rest.dto.AirDataDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AirDataDtoMapper {
    AirData AirDataDtoToAirData(AirDataDto airDataDto);

    AirDataDto AirDataToAirDataDto(AirData airData);
}
