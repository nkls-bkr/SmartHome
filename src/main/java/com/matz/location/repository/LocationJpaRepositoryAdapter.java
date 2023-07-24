package com.matz.location.repository;

import com.matz.location.Location;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * The LocationJpaRepositoryAdapter class is an implementation of the LocationRepositoryPort interface
 * that interacts with the LocationJpaRepository and LocationJpaEntityMapper.
 * It provides methods for finding all locations, saving a location, and finding a location by ID.
 */

public class LocationJpaRepositoryAdapter implements LocationRepositoryPort {
    private final LocationJpaRepository locationJpaRepository;

    private final LocationJpaEntityMapper locationJpaEntityMapper;

    public LocationJpaRepositoryAdapter(LocationJpaRepository locationJpaRepository,
                                        LocationJpaEntityMapper locationJpaEntityMapper) {
        this.locationJpaRepository = Objects.requireNonNull(locationJpaRepository,
                "The location jpa repository must not be null");
        this.locationJpaEntityMapper = Objects.requireNonNull(locationJpaEntityMapper,
                "The location jpa entity mapper must not be null");
    }

    /**
     * Retrieves all locations from the database.
     *
     * @return the list of all locations
     */
    @Override
    public List<Location> findAll() {
        List<LocationJpaEntity> locationJpaEntities = locationJpaRepository.findAll();

        return locationJpaEntities.stream()
                .map(locationJpaEntityMapper::LocationJpaEntityToLocation)
                .toList();
    }

    /**
     * Saves a location to the database.
     *
     * @param locationToSave the location to save
     * @return the saved location
     */
    @Override
    public Location save(Location locationToSave) {
        LocationJpaEntity locationJpaEntity = locationJpaEntityMapper
                .LocationToLocationJpaEntity(locationToSave);

        return locationJpaEntityMapper
                .LocationJpaEntityToLocation(locationJpaRepository.save(locationJpaEntity));
    }

    /**
     * Finds a location by its ID in the database.
     *
     * @param id the ID of the location to find
     * @return an optional containing the found location, or an empty optional if the location was not found
     */
    @Override
    public Optional<Location> findById(int id) {
        Optional<LocationJpaEntity> airDataEntityToSearchFor = locationJpaRepository.findById(id);

        return airDataEntityToSearchFor.map(locationJpaEntityMapper::LocationJpaEntityToLocation);
    }
}
