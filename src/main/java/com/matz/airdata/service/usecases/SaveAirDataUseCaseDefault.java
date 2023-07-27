package com.matz.airdata.service.usecases;

import com.matz.airdata.AirData;
import com.matz.airdata.repository.AirDataRepositoryPort;
import com.matz.airdata.service.usecases.api.SaveAirDataUseCase;
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
