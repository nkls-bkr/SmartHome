package com.smarthome.application.rest.mapper.airdata;

import com.smarthome.application.rest.dto.airdata.AirDataDto;
import com.smarthome.application.rest.dto.airdata.AirDataDtoBuilder;
import com.smarthome.application.rest.mapper.location.LocationDtoMapper;
import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.model.airdata.AirDataBuilder;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AirDataDtoMapperImpl implements AirDataDtoMapper {

    private final LocationDtoMapper locationDtoMapper;

    public AirDataDtoMapperImpl(LocationDtoMapper locationDtoMapper) {
        this.locationDtoMapper = Objects.requireNonNull(
                locationDtoMapper,
                "The location dto mapper must not be null");
    }

    @Override
    public AirData toModel(AirDataDto airDataDto) {
        return new AirDataBuilder()
                .setId(airDataDto.getId())
                .setTemperature(airDataDto.getTemperature())
                .setHumidity(airDataDto.getHumidity())
                .setLocalDateTime(airDataDto.getLocalDateTime())
                .setLocation(locationDtoMapper.toModel(airDataDto.getLocation()))
                .createAirData();
    }

    @Override
    public AirDataDto toDto(AirData airData) {
        return new AirDataDtoBuilder()
                .setId(airData.getId())
                .setTemperature(airData.getTemperature())
                .setHumidity(airData.getHumidity())
                .setLocalDateTime(airData.getLocalDateTime())
                .setLocationDto(locationDtoMapper.toDto(airData.getLocation()))
                .createAirDataDto();
    }
}
