package com.smarthome.config;

import com.smarthome.domain.ports.driven.AirDataRepositoryPort;
import com.smarthome.domain.ports.driven.LocationRepositoryPort;
import com.smarthome.domain.ports.driving.FindAirDataByIdUseCase;
import com.smarthome.domain.ports.driving.SaveAirDataUseCase;
import com.smarthome.domain.usecase.FindAirDataByIdUseCaseDefault;
import com.smarthome.domain.usecase.SaveAirDataUseCaseDefault;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

  private final AirDataRepositoryPort airDataRepositoryPort;

  private final LocationRepositoryPort locationRepositoryPort;

  public ApplicationConfig(
      AirDataRepositoryPort airDataRepositoryPort, LocationRepositoryPort locationRepositoryPort) {
    this.airDataRepositoryPort = airDataRepositoryPort;
    this.locationRepositoryPort = locationRepositoryPort;
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
