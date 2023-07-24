package com.matz.airdata.controller;

import com.matz.airdata.AirData;
import com.matz.airdata.repository.AirDataJpaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AirDataDtoMapper {
    AirData AirDataDtoToAirData(AirDataDto airDataDto);

    AirDataDto AirDataToAirDataDto(AirData airData);
}
