package com.smarthome.domain.usecase.location;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.model.location.Location;
import com.smarthome.domain.ports.driven.AirDataRepositoryPort;
import com.smarthome.domain.ports.driven.LocationRepositoryPort;
import com.smarthome.domain.ports.driving.location.SaveLocationUseCase;

import java.util.Objects;

public class SaveLocationUseCaseDefault implements SaveLocationUseCase {
  private final LocationRepositoryPort locationRepositoryPort;

  public SaveLocationUseCaseDefault(LocationRepositoryPort locationRepositoryPort) {
    this.locationRepositoryPort =
        Objects.requireNonNull(
                locationRepositoryPort, "The location repository port must not be null");
  }

  @Override
  public Location execute(Location airData) {
    return locationRepositoryPort.save(airData);
  }
}
