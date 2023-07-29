package com.smarthome.domain.ports.driven;

import com.smarthome.domain.model.location.Location;

import java.util.List;
import java.util.Optional;

public interface LocationRepositoryPort {
    List<Location> findAll();

    Location save(Location location);

    Optional<Location> findById(Long id);
}
