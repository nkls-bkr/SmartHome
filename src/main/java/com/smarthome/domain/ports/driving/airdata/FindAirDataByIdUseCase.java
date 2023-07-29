package com.smarthome.domain.ports.driving.airdata;

import com.smarthome.domain.model.airdata.AirData;

public interface FindAirDataByIdUseCase {
    AirData execute(Long id);
}
