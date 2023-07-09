package com.containertest.demo.airdata.repository;

import com.containertest.demo.airdata.AirData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Simple JpaRepository Adapter for CRUD operations relating to AirData.
 */

@RequiredArgsConstructor
@Repository
public class AirDataJpaRepositoryAdapter implements AirDataRepositoryPort {
    private final AirDataJpaRepository airDataJpaRepository;

    private final AirDataEntityMapper airDataEntityMapper;

    @Override
    public List<AirData> findAll()
    {
        List<AirDataEntity> airDataEntities = airDataJpaRepository.findAll();

        return airDataEntities.stream()
                .map(airDataEntityMapper::AirDataEntityToAirData)
                .toList();
    }

    @Override
    public AirData save(AirData airData)
    {
        AirDataEntity airDataEntityToSave = airDataEntityMapper.AirDataToAirDataEntity(airData);

        return airDataEntityMapper.AirDataEntityToAirData(airDataJpaRepository.save(airDataEntityToSave));
    }

    @Override
    public Optional<AirData> findById(Long id)
    {
        Optional<AirDataEntity> airDataEntityToSearchFor = airDataJpaRepository.findById(id);

        return airDataEntityToSearchFor.map(airDataEntityMapper::AirDataEntityToAirData);
    }
}
