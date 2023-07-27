package com.matz.infrastructure.database.mapper;

import com.matz.domain.model.AirData;
import com.matz.infrastructure.database.entities.AirDataJpaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AirDataEntityMapper {
    AirData AirDataEntityToAirData(AirDataJpaEntity airDataJpaEntity);

    AirDataJpaEntity AirDataToAirDataEntity(AirData airData);
}
