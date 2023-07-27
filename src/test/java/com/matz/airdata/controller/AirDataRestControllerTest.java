package com.matz.airdata.controller;

import com.matz.airdata.AirData;
import com.matz.airdata.service.AirDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AirDataRestControllerTest {

    @Mock
    private AirDataService airDataService;

    @Mock
    private AirDataDtoMapper airDataDtoMapper;

    @InjectMocks
    private AirDataRestController airDataRestController;

    private AirData airData;
    private AirDataDto airDataDto;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
        airData = new AirData.Builder()
                .withTemperature(20.20)
                .withHumidity(20.20)
                .atTime(LocalDateTime.of(LocalDate.of(2023,2,2),
                        LocalTime.of(23,20,20)))
                .build();
        airDataDto = new AirDataDto.Builder().withTemperature(20.20)
                .withHumidity(20.20)
                .atTime(LocalDateTime.of(LocalDate.of(2023,2,2),
                        LocalTime.of(23,20,19)))
                .build();
    }

    @Test
    void postAirDataTest() {
        when(airDataDtoMapper.AirDataDtoToAirData(airDataDto)).thenReturn(airData);
        when(airDataService.save(any(AirData.class))).thenReturn(airData);

        ResponseEntity<?> responseEntity = airDataRestController.postAirData(airDataDto);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(airData, responseEntity.getBody());
    }

    @Test
    void getAirDataByIdTest_when_id_exists() {
        final Long id = 1L;
        when(airDataService.findById(id)).thenReturn(Optional.of(airData));

        ResponseEntity<?> responseEntity = airDataRestController.getAirDataById(id);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(airData, responseEntity.getBody());
    }

    @Test
    void getAirDataByIdTest_when_id_does_not_exist() {
        final Long id = 1L;
        when(airDataService.findById(id)).thenReturn(Optional.empty());

        ResponseEntity<?> responseEntity = airDataRestController.getAirDataById(id);

        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
    }
}