package com.matz.location.repository;

import com.matz.location.Location;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LocationJpaEntityMapper {
    Location LocationJpaEntityToLocation(LocationJpaEntity locationJpaEntity);

    LocationJpaEntity LocationToLocationJpaEntity(Location location);
}
