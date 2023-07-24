package com.matz.airdata.service.usecases.api;

import com.matz.airdata.AirData;

public interface SaveAirDataUseCase {
    AirData execute(AirData airData);
}
