package com.smarthome.domain.usecase.airdata;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.model.airdata.AirDataBuilder;
import com.smarthome.domain.ports.driven.AirDataRepositoryPort;
import com.smarthome.domain.ports.driving.airdata.SaveAirDataUseCase;

import java.time.LocalDateTime;
import java.util.Objects;

public class SaveAirDataUseCaseDefault implements SaveAirDataUseCase {
  private final AirDataRepositoryPort airDataRepositoryPort;

  public SaveAirDataUseCaseDefault(AirDataRepositoryPort airDataRepositoryPort) {
    this.airDataRepositoryPort =
        Objects.requireNonNull(
            airDataRepositoryPort, "The air data repository port must not be null");
  }

  @Override
  public AirData execute(AirData airData) {
    AirData airDataToSave = new AirDataBuilder()
            .setId(airData.getId())
            .setTemperature(airData.getTemperature())
            .setHumidity(airData.getHumidity())
            .setLocalDateTime(LocalDateTime.now())
            .createAirData();

    return airDataRepositoryPort.save(airDataToSave);
  }
}
