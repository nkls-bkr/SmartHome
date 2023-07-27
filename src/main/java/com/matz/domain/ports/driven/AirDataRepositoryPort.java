package com.matz.domain.ports.driven;

import com.matz.domain.model.AirData;

import java.util.List;
import java.util.Optional;

public interface AirDataRepositoryPort {
    List<AirData> findAll();

    AirData save(AirData airData);

    Optional<AirData> findById(Long id);
}
