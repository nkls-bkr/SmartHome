package com.matz.airdata.service;

import com.matz.airdata.AirData;

import java.util.Optional;

public interface AirDataService {
    AirData save(AirData airData);

    Optional<AirData> findById(Long id);
}
