package com.smarthome.application.rest.controller;

import com.smarthome.application.rest.dto.location.LocationDto;
import com.smarthome.application.rest.mapper.location.LocationDtoMapper;
import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.application.rest.dto.airdata.AirDataDto;
import com.smarthome.domain.model.location.Location;
import com.smarthome.domain.ports.driving.location.FindLocationByIdUseCase;
import com.smarthome.domain.ports.driving.location.SaveLocationUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/v1/location")
public class LocationRestController {
    private final FindLocationByIdUseCase findLocationByIdUseCase;
    private final SaveLocationUseCase saveLocationUseCase;
    private final LocationDtoMapper locationDtoMapper;

    public LocationRestController(
            FindLocationByIdUseCase findLocationByIdUseCase,
            SaveLocationUseCase saveLocationUseCase,
            LocationDtoMapper locationDtoMapper) {
        this.findLocationByIdUseCase =
                Objects.requireNonNull(
                        findLocationByIdUseCase, "The find location by id use case must not be null");
        this.saveLocationUseCase =
                Objects.requireNonNull(saveLocationUseCase, "The save location use case must not be null");
        this.locationDtoMapper =
                Objects.requireNonNull(locationDtoMapper, "The location dto mapper must not be null");
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<?> postLocation(@RequestBody LocationDto locationDto) {
        Location locationToSave = locationDtoMapper.toModel(locationDto);

        Location savedLocation = saveLocationUseCase.execute(locationToSave);

        return ResponseEntity.status(HttpStatus.OK).body(locationDtoMapper.toDto(savedLocation));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getLocationById(@PathVariable Long id) {
        Location locationToSearchFor = findLocationByIdUseCase.execute(id);

        return ResponseEntity.status(HttpStatus.OK).body(locationDtoMapper.toDto(locationToSearchFor));
    }
}
