package com.smarthome.domain.usecase.location;

import com.smarthome.domain.exception.ResourceDoesNotExistException;
import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.model.location.Location;
import com.smarthome.domain.ports.driven.LocationRepositoryPort;
import com.smarthome.domain.ports.driving.location.FindLocationByIdUseCase;

import java.util.Objects;
import java.util.Optional;

import static java.lang.String.format;

public class FindLocationByIdUseCaseDefault implements FindLocationByIdUseCase {
    public FindLocationByIdUseCaseDefault(LocationRepositoryPort locationRepositoryPort) {
        this.locationRepositoryPort = Objects.requireNonNull(locationRepositoryPort,
        "The location repository must not be null");
    }

    private final LocationRepositoryPort locationRepositoryPort;

    @Override
    public Location execute(Long id) {
        Optional<Location> locationOptional = locationRepositoryPort.findById(id);

        if(locationOptional.isEmpty())
        {
            throw new ResourceDoesNotExistException(format("A location with the id %d does not exist", id));
        }

        return locationOptional.get();
    }
}
