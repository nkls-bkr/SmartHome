package com.smarthome.domain.usecase;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.ports.driven.AirDataRepositoryPort;
import com.smarthome.domain.ports.driving.FindAirDataByIdUseCase;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class FindAirDataByIdUseCaseDefault implements FindAirDataByIdUseCase {
    public FindAirDataByIdUseCaseDefault(AirDataRepositoryPort airDataRepositoryPort) {
        this.airDataRepositoryPort = Objects.requireNonNull(airDataRepositoryPort,
        "The air data repository must not be null");
    }

    private final AirDataRepositoryPort airDataRepositoryPort;

    @Override
    public Optional<AirData> execute(Long id) {
        return airDataRepositoryPort.findById(id);
    }
}