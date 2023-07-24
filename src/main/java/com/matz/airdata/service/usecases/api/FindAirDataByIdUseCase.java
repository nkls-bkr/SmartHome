package com.matz.airdata.service.usecases.api;

import com.matz.airdata.AirData;

import java.util.Optional;

public interface FindAirDataByIdUseCase {
    Optional<AirData> execute(Long id);
}
