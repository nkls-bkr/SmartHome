package com.smarthome.infrastructure.database.mapper.airdata;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.infrastructure.database.entities.airdata.AirDataJpaEntity;

public interface AirDataJpaEntityMapper {
    AirData toModel(AirDataJpaEntity airDataJpaEntity);

    AirDataJpaEntity toJpaEntity(AirData airData);
}
