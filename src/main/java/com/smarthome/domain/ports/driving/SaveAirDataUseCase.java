package com.smarthome.domain.ports.driving;

import com.smarthome.domain.model.airdata.AirData;

public interface SaveAirDataUseCase {
    AirData execute(AirData airData);
}
