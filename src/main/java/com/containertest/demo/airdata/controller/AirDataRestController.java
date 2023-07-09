package com.containertest.demo.airdata.controller;

import com.containertest.demo.airdata.AirData;
import com.containertest.demo.airdata.service.AirDataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/airdata")

@RequiredArgsConstructor
@Slf4j
public class AirDataRestController {
    private final AirDataService airDataService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<?> postAirData(@RequestBody AirData airData) {
        AirData airDataToSave = airData.withLocalDateTime(LocalDateTime.now());

        log.info(String.format("Air data received: %s", airDataToSave));

        AirData savedAirData = airDataService.save(airDataToSave);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(savedAirData);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAirDataById(@PathVariable Long id)
    {
        Optional<AirData> airDataSearchingFor = airDataService.findById(id);

        if(airDataSearchingFor.isEmpty())
        {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .build();
        }

        log.info(String.format("Air data found: %s", airDataSearchingFor.get()));

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(airDataSearchingFor.get());
    }
}
