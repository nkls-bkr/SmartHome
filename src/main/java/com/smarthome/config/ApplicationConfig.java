package com.smarthome.config;

import com.smarthome.domain.ports.driven.AirDataRepositoryPort;
import com.smarthome.domain.ports.driven.LocationRepositoryPort;
import com.smarthome.domain.ports.driving.FindAirDataByIdUseCase;
import com.smarthome.domain.ports.driving.SaveAirDataUseCase;
import com.smarthome.domain.usecase.FindAirDataByIdUseCaseDefault;
import com.smarthome.domain.usecase.SaveAirDataUseCaseDefault;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Configuration
public class ApplicationConfig {

  private final AirDataRepositoryPort airDataRepositoryPort;

  private final LocationRepositoryPort locationRepositoryPort;

  public ApplicationConfig(
      final AirDataRepositoryPort airDataRepositoryPort,
      final LocationRepositoryPort locationRepositoryPort) {
    this.airDataRepositoryPort =
        Objects.requireNonNull(
            airDataRepositoryPort, "The air data repository port must not be null");
    this.locationRepositoryPort =
        Objects.requireNonNull(
            locationRepositoryPort, "The location repository port must not be null");
  }

  @Bean
  FindAirDataByIdUseCase findAirDataByIdUseCase() {
    return new FindAirDataByIdUseCaseDefault(airDataRepositoryPort);
  }

  @Bean
  SaveAirDataUseCase saveAirDataUseCase() {
    return new SaveAirDataUseCaseDefault(airDataRepositoryPort);
  }
}
