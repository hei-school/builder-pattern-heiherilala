package org.example.builder;

import org.example.model.Car;

public class CarBuilder implements Builder {
  Car car;

  @Override
  public void reset() {
    this.car = new Car();
  }
  ;

  @Override
  public void setSeats(int seats) {
    car.setSeats(seats);
  }
  ;

  @Override
  public void setEngine(String engine) {
    car.setEngine(engine);
  }
  ;

  @Override
  public void setTripComputer(Boolean b) {
    car.setTripComputer(b);
  }
  ;

  @Override
  public void setGPS(Boolean b) {
    car.setGPS(b);
  }

  @Override
  public Car getProduct() {
    return car;
  }
}
