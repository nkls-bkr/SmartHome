package com.matz.location.repository;

import com.matz.location.Location;

import java.util.List;
import java.util.Optional;

public interface LocationRepositoryPort {
    List<Location> findAll();

    Location save(Location location);

    Optional<Location> findById(int id);
}
