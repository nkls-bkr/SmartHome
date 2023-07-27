package com.matz.application.rest.mapper;

import com.matz.domain.model.airdata.AirData;
import com.matz.application.rest.dto.AirDataDto;

public interface AirDataDtoMapper {
    AirData AirDataDtoToAirData(AirDataDto airDataDto);

    AirDataDto AirDataToAirDataDto(AirData airData);
}
