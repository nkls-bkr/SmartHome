package com.smarthome.application.rest.mapper;

import com.smarthome.application.rest.dto.AirDataDto;
import com.smarthome.domain.model.airdata.AirData;
import org.springframework.stereotype.Component;

@Component
public class AirDataDtoMapperImpl implements AirDataDtoMapper {
  @Override
  public AirData AirDataDtoToAirData(AirDataDto airDataDto) {
    return null;
  }

  @Override
  public AirDataDto AirDataToAirDataDto(AirData airData) {
    return null;
  }
}
