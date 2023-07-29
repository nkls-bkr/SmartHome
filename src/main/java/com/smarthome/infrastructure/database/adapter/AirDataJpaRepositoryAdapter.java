package com.smarthome.infrastructure.database.adapter;

import com.smarthome.infrastructure.database.mapper.airdata.AirDataJpaEntityMapper;
import com.smarthome.infrastructure.database.entities.AirDataJpaEntity;
import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.ports.driven.AirDataRepositoryPort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents an adapter class that implements the {@link AirDataRepositoryPort} interface.
 * It provides the implementation for accessing and manipulating air data entities
 * using the {@link AirDataJpaRepository} and {@link AirDataJpaEntityMapper}.
 */

@Repository
public class AirDataJpaRepositoryAdapter implements AirDataRepositoryPort {
    private final AirDataJpaRepository airDataJpaRepository;

    private final AirDataJpaEntityMapper airDataJpaEntityMapper;

    public AirDataJpaRepositoryAdapter(AirDataJpaRepository airDataJpaRepository, AirDataJpaEntityMapper airDataJpaEntityMapper) {
        this.airDataJpaRepository = Objects.requireNonNull(airDataJpaRepository,
                "The air data jpa repository must not be null");
        this.airDataJpaEntityMapper = Objects.requireNonNull(airDataJpaEntityMapper,
                "The air data entity mapper must not be null");
    }

    @Override
    public List<AirData> findAll()
    {
        List<AirDataJpaEntity> airDataEntities = airDataJpaRepository.findAll();

        return airDataEntities.stream()
                .map(airDataJpaEntityMapper::toModel)
                .toList();
    }

    @Override
    public AirData save(AirData airData)
    {
        AirDataJpaEntity airDataJpaEntityToSave = airDataJpaEntityMapper.toJpaEntity(airData);

        return airDataJpaEntityMapper.toModel(airDataJpaRepository.save(airDataJpaEntityToSave));
    }

    @Override
    public Optional<AirData> findById(Long id)
    {
        Optional<AirDataJpaEntity> airDataEntityToSearchFor = airDataJpaRepository.findById(id);

        return airDataEntityToSearchFor.map(airDataJpaEntityMapper::toModel);
    }
}
