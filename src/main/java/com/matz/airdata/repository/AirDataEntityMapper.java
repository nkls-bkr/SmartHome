package com.matz.airdata.repository;

import com.matz.airdata.AirData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AirDataEntityMapper {
    AirData AirDataEntityToAirData(AirDataJpaEntity airDataJpaEntity);

    AirDataJpaEntity AirDataToAirDataEntity(AirData airData);
}
