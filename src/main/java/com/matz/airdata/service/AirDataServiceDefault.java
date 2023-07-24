package com.matz.airdata.service;

import com.matz.airdata.AirData;
import com.matz.airdata.service.usecases.FindAirDataByIdUseCaseDefault;
import com.matz.airdata.service.usecases.api.SaveAirDataUseCase;
import com.matz.airdata.service.usecases.SaveAirDataUseCaseDefault;

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
