package com.smarthome.config;

import com.smarthome.domain.ports.driven.AirDataRepositoryPort;
import com.smarthome.domain.ports.driven.LocationRepositoryPort;
import com.smarthome.domain.ports.driving.airdata.FindAirDataByIdUseCase;
import com.smarthome.domain.ports.driving.airdata.SaveAirDataUseCase;
import com.smarthome.domain.ports.driving.location.FindLocationByIdUseCase;
import com.smarthome.domain.ports.driving.location.SaveLocationUseCase;
import com.smarthome.domain.usecase.airdata.FindAirDataByIdUseCaseDefault;
import com.smarthome.domain.usecase.airdata.SaveAirDataUseCaseDefault;
import com.smarthome.domain.usecase.location.FindLocationByIdUseCaseDefault;
import com.smarthome.domain.usecase.location.SaveLocationUseCaseDefault;
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
        return new SaveAirDataUseCaseDefault(airDataRepositoryPort, locationRepositoryPort);
    }

    @Bean
    FindLocationByIdUseCase findLocationByIdUseCase() {
        return new FindLocationByIdUseCaseDefault(locationRepositoryPort);
    }

    @Bean
    SaveLocationUseCase saveLocationUseCase() {
        return new SaveLocationUseCaseDefault(locationRepositoryPort);
    }
}
