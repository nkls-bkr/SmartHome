package com.smarthome.infrastructure.database.adapter;

import com.smarthome.domain.model.location.Location;
import com.smarthome.infrastructure.database.entities.location.LocationJpaEntity;
import com.smarthome.infrastructure.database.mapper.location.LocationJpaEntityMapper;
import com.smarthome.domain.ports.driven.LocationRepositoryPort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * The LocationJpaRepositoryAdapter class is an implementation of the LocationRepositoryPort
 * interface that interacts with the LocationJpaRepository and LocationJpaEntityMapper. It provides
 * methods for finding all locations, saving a location, and finding a location by ID.
 */
@Repository
public class LocationJpaRepositoryAdapter implements LocationRepositoryPort {
  private final LocationJpaRepository locationJpaRepository;

  private final LocationJpaEntityMapper locationJpaEntityMapper;

  public LocationJpaRepositoryAdapter(
      LocationJpaRepository locationJpaRepository,
      LocationJpaEntityMapper locationJpaEntityMapper) {
    this.locationJpaRepository =
        Objects.requireNonNull(
            locationJpaRepository, "The location jpa repository must not be null");
    this.locationJpaEntityMapper =
        Objects.requireNonNull(
            locationJpaEntityMapper, "The location jpa entity mapper must not be null");
  }

  /**
   * Retrieves all locations from the database.
   *
   * @return the list of all locations
   */
  @Override
  public List<Location> findAll() {
    List<LocationJpaEntity> locationJpaEntities = locationJpaRepository.findAll();

    return locationJpaEntities.stream().map(locationJpaEntityMapper::toDomainModel).toList();
  }

  /**
   * Saves a location to the database.
   *
   * @param locationToSave the location to save
   * @return the saved location
   */
  @Override
  public Location save(Location locationToSave) {
    LocationJpaEntity locationJpaEntity = locationJpaEntityMapper.toJpaEntity(locationToSave);

    return locationJpaEntityMapper.toDomainModel(locationJpaRepository.save(locationJpaEntity));
  }

  /**
   * Finds a location by its ID in the database.
   *
   * @param id the ID of the location to find
   * @return an optional containing the found location, or an empty optional if the location was not
   *     found
   */
  @Override
  public Optional<Location> findById(Long id) {
    Optional<LocationJpaEntity> airDataEntityToSearchFor = locationJpaRepository.findById(id);

    return airDataEntityToSearchFor.map(locationJpaEntityMapper::toDomainModel);
  }
}
