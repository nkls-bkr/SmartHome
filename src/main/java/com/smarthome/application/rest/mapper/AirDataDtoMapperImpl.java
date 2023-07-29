package com.smarthome.application.rest.mapper;

import com.smarthome.application.rest.dto.AirDataDto;
import com.smarthome.application.rest.dto.AirDataDtoBuilder;
import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.model.airdata.AirDataBuilder;
import org.springframework.stereotype.Component;

@Component
public class AirDataDtoMapperImpl implements AirDataDtoMapper {
  @Override
  public AirData AirDataDtoToAirData(AirDataDto airDataDto) {
    return new AirDataBuilder()
        .setId(airDataDto.getId())
        .setTemperature(airDataDto.getTemperature())
        .setHumidity(airDataDto.getHumidity())
        .setLocalDateTime(airDataDto.getLocalDateTime())
        .createAirData();
  }

  @Override
  public AirDataDto AirDataToAirDataDto(AirData airData) {
    return new AirDataDtoBuilder()
        .setId(airData.getId())
        .setTemperature(airData.getTemperature())
        .setHumidity(airData.getHumidity())
        .setLocalDateTime(airData.getLocalDateTime())
        .createAirDataDto();
  }
}
