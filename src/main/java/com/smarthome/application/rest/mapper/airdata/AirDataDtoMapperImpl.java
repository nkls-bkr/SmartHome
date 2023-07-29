package com.smarthome.application.rest.mapper.airdata;

import com.smarthome.application.rest.dto.airdata.AirDataDto;
import com.smarthome.application.rest.dto.airdata.AirDataDtoBuilder;
import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.model.airdata.AirDataBuilder;
import org.springframework.stereotype.Component;

@Component
public class AirDataDtoMapperImpl implements AirDataDtoMapper {
  @Override
  public AirData toModel(AirDataDto airDataDto) {
    return new AirDataBuilder()
        .setId(airDataDto.getId())
        .setTemperature(airDataDto.getTemperature())
        .setHumidity(airDataDto.getHumidity())
        .setLocalDateTime(airDataDto.getLocalDateTime())
        .createAirData();
  }

  @Override
  public AirDataDto toDto(AirData airData) {
    return new AirDataDtoBuilder()
        .setId(airData.getId())
        .setTemperature(airData.getTemperature())
        .setHumidity(airData.getHumidity())
        .setLocalDateTime(airData.getLocalDateTime())
        .createAirDataDto();
  }
}
