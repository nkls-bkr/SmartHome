package com.smarthome.infrastructure.database.mapper.airdata;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.infrastructure.database.entities.AirDataJpaEntity;

public interface AirDataEntityMapper {
    AirData toModel(AirDataJpaEntity airDataJpaEntity);

    AirDataJpaEntity toJpaEntity(AirData airData);
}
