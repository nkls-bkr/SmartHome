package com.containertest.demo.airdata.service.usecases;

import com.containertest.demo.airdata.AirData;
import com.containertest.demo.airdata.repository.AirDataRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FindAirDataById {
    private final AirDataRepositoryPort airDataRepositoryPort;

    public Optional<AirData> execute(Long id) {
        return airDataRepositoryPort.findById(id);
    }
}
