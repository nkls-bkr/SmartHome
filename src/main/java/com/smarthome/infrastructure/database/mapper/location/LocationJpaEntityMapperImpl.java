package com.smarthome.infrastructure.database.mapper.location;

import com.smarthome.domain.model.location.Location;
import com.smarthome.domain.model.location.LocationBuilder;
import com.smarthome.infrastructure.database.entities.location.LocationJpaEntity;
import com.smarthome.infrastructure.database.entities.location.LocationJpaEntityBuilder;
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
