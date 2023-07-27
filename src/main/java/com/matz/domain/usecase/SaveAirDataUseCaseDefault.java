package com.matz.domain.usecase;

import com.matz.domain.model.airdata.AirData;
import com.matz.domain.ports.driven.AirDataRepositoryPort;
import com.matz.domain.ports.driving.SaveAirDataUseCase;
import org.springframework.stereotype.Service;

@Service
public class SaveAirDataUseCaseDefault implements SaveAirDataUseCase {
    private final AirDataRepositoryPort airDataRepositoryPort;

    public SaveAirDataUseCaseDefault(AirDataRepositoryPort airDataRepositoryPort) {
        this.airDataRepositoryPort = airDataRepositoryPort;
    }

    @Override
    public AirData execute(AirData airData) {
        return airDataRepositoryPort.save(airData);
    }
}
