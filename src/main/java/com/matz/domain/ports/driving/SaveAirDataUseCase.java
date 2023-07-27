package com.matz.domain.ports.driving;

import com.matz.domain.model.airdata.AirData;

public interface SaveAirDataUseCase {
    AirData execute(AirData airData);
}
