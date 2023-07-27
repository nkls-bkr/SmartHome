package com.matz.domain.ports.driven;

import com.matz.domain.model.Location;

import java.util.List;
import java.util.Optional;

public interface LocationRepositoryPort {
    List<Location> findAll();

    Location save(Location location);

    Optional<Location> findById(int id);
}
