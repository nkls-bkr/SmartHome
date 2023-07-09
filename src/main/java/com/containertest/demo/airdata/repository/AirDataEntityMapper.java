package com.containertest.demo.airdata.repository;

import com.containertest.demo.airdata.AirData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AirDataEntityMapper {
    AirData AirDataEntityToAirData(AirDataEntity airDataEntity);

    AirDataEntity AirDataToAirDataEntity(AirData airData);
}
