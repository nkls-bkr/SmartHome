package com.smarthome.domain.usecase;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.ports.driven.AirDataRepositoryPort;
import com.smarthome.domain.ports.driving.SaveAirDataUseCase;
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
