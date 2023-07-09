package com.containertest.demo.airdata.service.usecases;

import com.containertest.demo.airdata.AirData;
import com.containertest.demo.airdata.repository.AirDataRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveAirData {
    private final AirDataRepositoryPort airDataRepositoryPort;

    public AirData execute(AirData airData) {
        return airDataRepositoryPort.save(airData);
    }
}
