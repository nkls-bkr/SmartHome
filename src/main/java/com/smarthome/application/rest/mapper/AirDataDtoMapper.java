package com.smarthome.application.rest.mapper;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.application.rest.dto.AirDataDto;

public interface AirDataDtoMapper {
    AirData toModel(AirDataDto airDataDto);

    AirDataDto toDto(AirData airData);
}
