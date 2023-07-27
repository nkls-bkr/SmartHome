package com.smarthome.domain.usecase;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.ports.driven.AirDataRepositoryPort;
import com.smarthome.domain.ports.driving.SaveAirDataUseCase;
import org.springframework.stereotype.Service;

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
    return airDataRepositoryPort.save(airData);
  }
}
