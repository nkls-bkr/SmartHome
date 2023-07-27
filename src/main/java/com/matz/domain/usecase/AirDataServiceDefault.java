package com.matz.domain.usecase;

import com.matz.domain.model.airdata.AirData;
import com.matz.domain.ports.driving.AirDataService;
import com.matz.domain.ports.driving.SaveAirDataUseCase;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AirDataServiceDefault implements AirDataService {
  private final SaveAirDataUseCase saveAirDataUseCase;
  private final FindAirDataByIdUseCaseDefault findAirDataByIdUseCaseDefault;

  public AirDataServiceDefault(
      SaveAirDataUseCaseDefault saveAirDataUseCase,
      FindAirDataByIdUseCaseDefault findAirDataByIdUseCaseDefault) {
    this.saveAirDataUseCase = saveAirDataUseCase;
    this.findAirDataByIdUseCaseDefault = findAirDataByIdUseCaseDefault;
  }

  @Override
  public AirData save(AirData airData) {
    return saveAirDataUseCase.execute(airData);
  }

  @Override
  public Optional<AirData> findById(Long id) {
    return findAirDataByIdUseCaseDefault.execute(id);
  }
}
