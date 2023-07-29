package com.smarthome.domain.ports.driving.location;

import com.smarthome.domain.model.location.Location;

public interface SaveLocationUseCase {
    Location execute(Location location);
}
