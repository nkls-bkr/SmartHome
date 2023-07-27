package com.smarthome.domain.ports.driving;

import com.smarthome.domain.model.airdata.AirData;

import java.util.Optional;

public interface AirDataService {
    AirData save(AirData airData);

    Optional<AirData> findById(Long id);
}
