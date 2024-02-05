package org.example.builder;

public class Director {

  public static void constructSportsCar(CarBuilder builder) {
    if (builder.car == null) {
      builder.reset();
    }
    builder.setSeats(4);
    builder.setEngine("new SportEngine");
    builder.setTripComputer(true);
    builder.setGPS(true);
  }

  public static void constructSmallCar(CarBuilder builder) {
    if (builder.car == null) {
      builder.reset();
    }
    builder.setSeats(4);
    builder.setEngine("new small car");
    builder.setTripComputer(true);
    builder.setGPS(true);
  }
}
