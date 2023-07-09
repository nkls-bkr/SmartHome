package com.containertest.demo.airdata.service;

import com.containertest.demo.airdata.AirData;

import java.util.Optional;

public interface AirDataService {
    AirData save(AirData airData);

    Optional<AirData> findById(Long id);
}
