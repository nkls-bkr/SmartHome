package com.smarthome.application.rest.mapper.location;

import com.smarthome.application.rest.dto.location.LocationDto;
import com.smarthome.application.rest.dto.location.LocationDtoBuilder;
import com.smarthome.domain.model.location.Location;
import com.smarthome.domain.model.location.LocationBuilder;
import org.springframework.stereotype.Component;

@Component
public class LocationDtoMapperImpl implements LocationDtoMapper {

    @Override
    public Location toModel(LocationDto locationDto) {
        return new LocationBuilder()
                .setId(locationDto.getId())
                .setName(locationDto.getName())
                .createLocation();
    }

    @Override
    public LocationDto toDto(Location location) {
        return new LocationDtoBuilder()
                .setId(location.getId())
                .setName(location.getName())
                .createLocationDto();
    }
}
