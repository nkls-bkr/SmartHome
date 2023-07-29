package com.smarthome.infrastructure.database.mapper.airdata;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.model.airdata.AirDataBuilder;
import com.smarthome.infrastructure.database.entities.airdata.AirDataJpaEntity;
import com.smarthome.infrastructure.database.entities.airdata.AirDataJpaEntityBuilder;
import org.springframework.stereotype.Component;

@Component
public class AirDataJpaEntityMapperImpl implements AirDataJpaEntityMapper {
  @Override
  public AirData toModel(AirDataJpaEntity airDataJpaEntity) {
    return new AirDataBuilder()
        .setHumidity(airDataJpaEntity.getHumidity())
        .setTemperature(airDataJpaEntity.getTemperature())
        .setLocalDateTime(airDataJpaEntity.getTimestamp())
        .createAirData();
  }

  @Override
  public AirDataJpaEntity toJpaEntity(AirData airData) {
    return new AirDataJpaEntityBuilder()
            .setId(airData.getId())
            .setTemperature(airData.getTemperature())
            .setHumidity(airData.getHumidity())
            .setLocalDateTime(airData.getLocalDateTime())
            .createAirDataJpaEntity();
  }
}
