package com.matz.config;

import com.matz.airdata.repository.AirDataEntityMapper;
import com.matz.airdata.repository.AirDataJpaRepositoryAdapter;
import com.matz.airdata.repository.AirDataRepositoryPort;
import com.matz.airdata.service.AirDataService;
import com.matz.airdata.service.AirDataServiceDefault;
import com.matz.airdata.service.usecases.FindAirDataByIdUseCaseDefault;
import com.matz.airdata.service.usecases.SaveAirDataUseCaseDefault;
import com.matz.airdata.service.usecases.api.FindAirDataByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    AirDataService airDataService()
    {
        return new AirDataServiceDefault();
    }

    @Bean
    SaveAirDataUseCaseDefault saveAirDataUseCaseDefault()
    {
        return new SaveAirDataUseCaseDefault();
    }

    @Bean
    FindAirDataByIdUseCase findAirDataByIdUseCase()
    {
        return new FindAirDataByIdUseCaseDefault();
    }

    @Bean
    AirDataRepositoryPort airDataRepositoryPort()
    {
        return new AirDataJpaRepositoryAdapter(, AirDataEntityMapper.class)
    }
}
