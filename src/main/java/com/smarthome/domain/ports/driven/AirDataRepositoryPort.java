package com.smarthome.domain.ports.driven;

import com.smarthome.domain.model.airdata.AirData;

import java.util.List;
import java.util.Optional;

public interface AirDataRepositoryPort {
    List<AirData> findAll();

    AirData save(AirData airData);

    Optional<AirData> findById(Long id);
}
