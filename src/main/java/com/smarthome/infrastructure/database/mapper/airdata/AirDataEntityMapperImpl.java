package com.smarthome.infrastructure.database.mapper.airdata;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.infrastructure.database.entities.AirDataJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class AirDataEntityMapperImpl implements AirDataEntityMapper {
  @Override
  public AirData toModel(AirDataJpaEntity airDataJpaEntity) {
    return null;
  }

  @Override
  public AirDataJpaEntity toJpaEntity(AirData airData) {
    return null;
  }
}
