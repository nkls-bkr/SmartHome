package com.smarthome.infrastructure.database.mapper.airdata;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.model.airdata.AirDataBuilder;
import com.smarthome.infrastructure.database.entities.airdata.AirDataJpaEntity;
import com.smarthome.infrastructure.database.entities.airdata.AirDataJpaEntityBuilder;
import com.smarthome.infrastructure.database.mapper.location.LocationJpaEntityMapper;
import org.springframework.stereotype.Component;

@Component
public class AirDataJpaEntityMapperImpl implements AirDataJpaEntityMapper {

    private final LocationJpaEntityMapper locationJpaEntityMapper;

    public AirDataJpaEntityMapperImpl(LocationJpaEntityMapper locationJpaEntityMapper) {
        this.locationJpaEntityMapper = locationJpaEntityMapper;
    }

    @Override
    public AirData toModel(AirDataJpaEntity airDataJpaEntity) {
        return new AirDataBuilder()
                .setId(airDataJpaEntity.getId())
                .setHumidity(airDataJpaEntity.getHumidity())
                .setTemperature(airDataJpaEntity.getTemperature())
                .setLocalDateTime(airDataJpaEntity.getTimestamp())
                .setLocation(locationJpaEntityMapper.toDomainModel(airDataJpaEntity.getLocationJpaEntity()))
                .createAirData();
    }

    @Override
    public AirDataJpaEntity toJpaEntity(AirData airData) {
        return new AirDataJpaEntityBuilder()
                .setId(airData.getId())
                .setTemperature(airData.getTemperature())
                .setHumidity(airData.getHumidity())
                .setLocalDateTime(airData.getLocalDateTime())
                .setLocationJpaEntity(locationJpaEntityMapper.toJpaEntity(airData.getLocation()))
                .createAirDataJpaEntity();
    }
}
