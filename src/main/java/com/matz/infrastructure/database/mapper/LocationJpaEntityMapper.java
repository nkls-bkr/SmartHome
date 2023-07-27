package com.matz.infrastructure.database.mapper;

import com.matz.domain.model.Location;
import com.matz.infrastructure.database.entities.LocationJpaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LocationJpaEntityMapper {
    Location LocationJpaEntityToLocation(LocationJpaEntity locationJpaEntity);

    LocationJpaEntity LocationToLocationJpaEntity(Location location);
}
