package com.matz.airdata.repository;

import com.matz.airdata.AirData;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents an adapter class that implements the {@link AirDataRepositoryPort} interface.
 * It provides the implementation for accessing and manipulating air data entities
 * using the {@link AirDataJpaRepository} and {@link AirDataEntityMapper}.
 */

@Repository
public class AirDataJpaRepositoryAdapter implements AirDataRepositoryPort {
    private final AirDataJpaRepository airDataJpaRepository;

    private final AirDataEntityMapper airDataEntityMapper;

    public AirDataJpaRepositoryAdapter(AirDataJpaRepository airDataJpaRepository, AirDataEntityMapper airDataEntityMapper) {
        this.airDataJpaRepository = Objects.requireNonNull(airDataJpaRepository,
                "The air data jpa repository must not be null");
        this.airDataEntityMapper = Objects.requireNonNull(airDataEntityMapper,
                "The air data entity mapper must not be null");
    }

    @Override
    public List<AirData> findAll()
    {
        List<AirDataJpaEntity> airDataEntities = airDataJpaRepository.findAll();

        return airDataEntities.stream()
                .map(airDataEntityMapper::AirDataEntityToAirData)
                .toList();
    }

    @Override
    public AirData save(AirData airData)
    {
        AirDataJpaEntity airDataJpaEntityToSave = airDataEntityMapper.AirDataToAirDataEntity(airData);

        return airDataEntityMapper.AirDataEntityToAirData(airDataJpaRepository.save(airDataJpaEntityToSave));
    }

    @Override
    public Optional<AirData> findById(Long id)
    {
        Optional<AirDataJpaEntity> airDataEntityToSearchFor = airDataJpaRepository.findById(id);

        return airDataEntityToSearchFor.map(airDataEntityMapper::AirDataEntityToAirData);
    }
}
