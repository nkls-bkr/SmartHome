package com.smarthome.application.rest.mapper;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.application.rest.dto.AirDataDto;

public interface AirDataDtoMapper {
    AirData AirDataDtoToAirData(AirDataDto airDataDto);

    AirDataDto AirDataToAirDataDto(AirData airData);
}
