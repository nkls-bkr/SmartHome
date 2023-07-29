package com.smarthome.application.rest.mapper.location;

import com.smarthome.application.rest.dto.location.LocationDto;
import com.smarthome.domain.model.location.Location;

public interface LocationDtoMapper {
    Location toModel(LocationDto locationDto);

    LocationDto toDto(Location location);
}
