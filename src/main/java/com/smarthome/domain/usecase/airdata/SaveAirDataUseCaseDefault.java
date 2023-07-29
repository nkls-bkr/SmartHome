package com.smarthome.domain.usecase.airdata;

import com.smarthome.domain.exception.ResourceDoesNotExistException;
import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.domain.model.airdata.AirDataBuilder;
import com.smarthome.domain.model.location.Location;
import com.smarthome.domain.ports.driven.AirDataRepositoryPort;
import com.smarthome.domain.ports.driven.LocationRepositoryPort;
import com.smarthome.domain.ports.driving.airdata.SaveAirDataUseCase;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

public class SaveAirDataUseCaseDefault implements SaveAirDataUseCase {
  private final AirDataRepositoryPort airDataRepositoryPort;

    private final LocationRepositoryPort locationRepositoryPort;

    public SaveAirDataUseCaseDefault(AirDataRepositoryPort airDataRepositoryPort, LocationRepositoryPort locationRepositoryPort) {
    this.airDataRepositoryPort =
        Objects.requireNonNull(
            airDataRepositoryPort, "The air data repository port must not be null");
        this.locationRepositoryPort =
                Objects.requireNonNull(
                        locationRepositoryPort,
                        "The location repository port must not be null");
  }

  @Override
  public AirData execute(AirData airData) {
      Optional<Location> location = locationRepositoryPort.findById((long) airData.getLocation().getId());

      if (location.isEmpty()) {
          throw new ResourceDoesNotExistException("The location does not exist");
      }

    AirData airDataToSave = new AirDataBuilder()
            .setId(airData.getId())
            .setTemperature(airData.getTemperature())
            .setHumidity(airData.getHumidity())
            .setLocalDateTime(LocalDateTime.now())
            .setLocation(location.get())
            .createAirData();

    return airDataRepositoryPort.save(airDataToSave);
  }
}
