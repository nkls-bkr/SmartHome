package com.matz.infrastructure.database.mapper.airdata;

import com.matz.domain.model.airdata.AirData;
import com.matz.infrastructure.database.entities.AirDataJpaEntity;

public interface AirDataEntityMapper {
    AirData toModel(AirDataJpaEntity airDataJpaEntity);

    AirDataJpaEntity toJpaEntity(AirData airData);
}
