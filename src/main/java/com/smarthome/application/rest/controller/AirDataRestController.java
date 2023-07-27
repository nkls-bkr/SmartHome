package com.smarthome.application.rest.controller;

import com.smarthome.domain.model.airdata.AirData;
import com.smarthome.application.rest.dto.AirDataDto;
import com.smarthome.application.rest.mapper.AirDataDtoMapper;
import com.smarthome.domain.ports.driving.AirDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/v1/airdata")
public class AirDataRestController {
  private final AirDataService airDataService;

  private final AirDataDtoMapper airDataDtoMapper;

  public AirDataRestController(AirDataService airDataService, AirDataDtoMapper airDataDtoMapper) {
    this.airDataService =
        Objects.requireNonNull(airDataService, "The air data service must not be null");
    this.airDataDtoMapper =
        Objects.requireNonNull(airDataDtoMapper, "The air data dto mapper must not be null");
  }

  @PostMapping
  @ResponseBody
  public ResponseEntity<?> postAirData(@RequestBody AirDataDto airDataDto) {
    AirData airDataToSave = airDataDtoMapper.AirDataDtoToAirData(airDataDto);

    AirData savedAirData = airDataService.save(airDataToSave);

    return ResponseEntity.status(HttpStatus.OK).body(savedAirData);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getAirDataById(@PathVariable Long id) {
    Optional<AirData> airDataSearchingFor = airDataService.findById(id);

    if (airDataSearchingFor.isEmpty()) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    return ResponseEntity.status(HttpStatus.OK).body(airDataSearchingFor.get());
  }
}
