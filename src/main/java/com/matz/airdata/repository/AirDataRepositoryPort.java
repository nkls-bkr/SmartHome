package com.matz.airdata.repository;

import com.matz.airdata.AirData;

import java.util.List;
import java.util.Optional;

public interface AirDataRepositoryPort {
    List<AirData> findAll();

    AirData save(AirData airData);

    Optional<AirData> findById(Long id);
}
