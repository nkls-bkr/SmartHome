package com.smarthome.domain.ports.driving;

import com.smarthome.domain.model.airdata.AirData;

import java.util.Optional;

public interface FindAirDataByIdUseCase {
    Optional<AirData> execute(Long id);
}
