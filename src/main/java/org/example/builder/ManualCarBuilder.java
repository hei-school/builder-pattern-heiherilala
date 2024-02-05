package org.example.builder;

import org.example.model.ManualCar;

public class ManualCarBuilder implements Builder {
  ManualCar manualCar;

  @Override
  public void reset() {
    manualCar = new ManualCar();
  }
  ;

  @Override
  public void setSeats(int seats) {
    manualCar.setSeats(seats);
  }
  ;

  @Override
  public void setEngine(String engine) {
    manualCar.setEngine(engine);
  }
  ;

  @Override
  public void setTripComputer(Boolean b) {
    manualCar.setTripComputer(b);
  }
  ;

  @Override
  public void setGPS(Boolean b) {
    manualCar.setGPS(b);
  }

  @Override
  public ManualCar getProduct() {
    return manualCar;
  }
}
