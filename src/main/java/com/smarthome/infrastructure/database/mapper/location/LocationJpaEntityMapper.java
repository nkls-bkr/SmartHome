package com.smarthome.infrastructure.database.mapper.location;

import com.smarthome.domain.model.location.Location;
import com.smarthome.infrastructure.database.entities.location.LocationJpaEntity;

public interface LocationJpaEntityMapper {
    LocationJpaEntity toJpaEntity(Location model);

    Location toDomainModel(LocationJpaEntity entity);
}
