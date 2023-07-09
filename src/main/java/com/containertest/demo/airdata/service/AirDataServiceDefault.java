package com.containertest.demo.airdata.service;

import com.containertest.demo.airdata.AirData;
import com.containertest.demo.airdata.service.usecases.FindAirDataById;
import com.containertest.demo.airdata.service.usecases.SaveAirData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

@RequiredArgsConstructor
public class AirDataServiceDefault implements AirDataService {
    private final SaveAirData saveAirData;
    private final FindAirDataById findAirDataById;
    @Override
    public AirData save(AirData airData) {
        return saveAirData.execute(airData);
    }

    @Override
    public Optional<AirData> findById(Long id) {
        return findAirDataById.execute(id);
    }
}
