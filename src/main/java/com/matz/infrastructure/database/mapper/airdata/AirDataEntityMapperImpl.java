package com.matz.infrastructure.database.mapper.airdata;

import com.matz.domain.model.airdata.AirData;
import com.matz.infrastructure.database.entities.AirDataJpaEntity;
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
