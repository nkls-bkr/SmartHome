package com.matz.domain.ports.driving;

import com.matz.domain.model.airdata.AirData;

import java.util.Optional;

public interface AirDataService {
    AirData save(AirData airData);

    Optional<AirData> findById(Long id);
}
