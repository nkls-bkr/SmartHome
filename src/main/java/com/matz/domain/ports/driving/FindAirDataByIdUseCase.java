package com.matz.domain.ports.driving;

import com.matz.domain.model.airdata.AirData;

import java.util.Optional;

public interface FindAirDataByIdUseCase {
    Optional<AirData> execute(Long id);
}
