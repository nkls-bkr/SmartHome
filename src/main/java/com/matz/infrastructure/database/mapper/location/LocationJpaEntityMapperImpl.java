package com.matz.infrastructure.database.mapper.location;

import com.matz.domain.model.location.Location;
import com.matz.domain.model.location.LocationBuilder;
import com.matz.infrastructure.database.entities.location.LocationJpaEntity;
import com.matz.infrastructure.database.entities.location.LocationJpaEntityBuilder;
import org.springframework.stereotype.Component;

@Component
public class LocationJpaEntityMapperImpl implements LocationJpaEntityMapper {
  @Override
  public LocationJpaEntity toJpaEntity(Location model) {
    return new LocationJpaEntityBuilder()
        .setId(model.getId())
        .setName(model.getName())
        .createLocationJpaEntity();
  }

  @Override
  public Location toDomainModel(LocationJpaEntity entity) {
    return new LocationBuilder()
            .setId(entity.getId())
            .setName(entity.getName())
            .createLocation();
  }
}
