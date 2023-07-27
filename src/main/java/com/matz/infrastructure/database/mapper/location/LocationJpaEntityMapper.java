package com.matz.infrastructure.database.mapper.location;

import com.matz.domain.model.location.Location;
import com.matz.infrastructure.database.entities.location.LocationJpaEntity;

public interface LocationJpaEntityMapper {
    LocationJpaEntity toJpaEntity(Location model);

    Location toDomainModel(LocationJpaEntity entity);
}
