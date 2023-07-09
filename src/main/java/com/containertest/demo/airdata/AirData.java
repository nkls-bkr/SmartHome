package com.containertest.demo.airdata;

import lombok.Builder;
import lombok.With;

import java.time.LocalDateTime;

@With
@Builder
public record AirData(
        double temperature,
        double humidity,
        LocalDateTime localDateTime) {
}
