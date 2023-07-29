package com.smarthome.domain.usecase;

import com.smarthome.domain.exception.ResourceDoesNotExistException;
import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.ports.driven.AirDataRepositoryPort;
import com.smarthome.domain.ports.driving.FindAirDataByIdUseCase;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

import static java.lang.String.*;

public class FindAirDataByIdUseCaseDefault implements FindAirDataByIdUseCase {
    public FindAirDataByIdUseCaseDefault(AirDataRepositoryPort airDataRepositoryPort) {
        this.airDataRepositoryPort = Objects.requireNonNull(airDataRepositoryPort,
        "The air data repository must not be null");
    }

    private final AirDataRepositoryPort airDataRepositoryPort;

    @Override
    public AirData execute(Long id) {
        Optional<AirData> airDataOptional = airDataRepositoryPort.findById(id);

        if(airDataOptional.isEmpty())
        {
            throw new ResourceDoesNotExistException(format("A air data with the id %d does not exist", id));
        }

        return airDataOptional.get();
    }
}
