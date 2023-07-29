package com.smarthome.domain.ports.driving;

import com.smarthome.domain.model.airdata.AirData;

public interface FindAirDataByIdUseCase {
    AirData execute(Long id);
}
