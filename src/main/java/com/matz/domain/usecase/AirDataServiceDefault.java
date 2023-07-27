package com.matz.domain.usecase;

import com.matz.domain.model.AirData;
import com.matz.domain.ports.driving.AirDataService;
import com.matz.domain.ports.driving.SaveAirDataUseCase;

import java.util.Optional;

public class AirDataServiceDefault implements AirDataService {
    private final SaveAirDataUseCase saveAirDataUseCase;
    private final FindAirDataByIdUseCaseDefault findAirDataByIdUseCaseDefault;

    public AirDataServiceDefault(SaveAirDataUseCaseDefault saveAirDataUseCase, FindAirDataByIdUseCaseDefault findAirDataByIdUseCaseDefault) {
        this.saveAirDataUseCase = saveAirDataUseCase;
        this.findAirDataByIdUseCaseDefault = findAirDataByIdUseCaseDefault;
    }

    @Override
    public AirData save(AirData airData) {
        return saveAirDataUseCase.execute(airData);
    }

    @Override
    public Optional<AirData> findById(Long id) {
        return findAirDataByIdUseCaseDefault.execute(id);
    }
}
