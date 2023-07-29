package com.smarthome.domain.ports.driving.airdata;

import com.smarthome.domain.model.airdata.AirData;

public interface SaveAirDataUseCase {
    AirData execute(AirData airData);
}
