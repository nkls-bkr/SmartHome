package com.matz.airdata.service.usecases;

import com.matz.airdata.AirData;
import com.matz.airdata.repository.AirDataRepositoryPort;
import com.matz.airdata.service.usecases.api.FindAirDataByIdUseCase;
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
