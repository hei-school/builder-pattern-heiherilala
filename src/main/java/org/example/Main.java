package org.example;

import org.example.builder.CarBuilder;
import org.example.builder.ManualCarBuilder;
import org.example.model.Car;
import org.example.model.ManualCar;

public class Main {
  public static void main(String[] args) {
    // Create a ManualCarBuilder instance
    ManualCarBuilder manualCarBuilder = new ManualCarBuilder();

    // Set properties using the builder
    manualCarBuilder.reset();
    manualCarBuilder.setSeats(4);
    manualCarBuilder.setEngine("Manual Engine");
    manualCarBuilder.setTripComputer(true);
    manualCarBuilder.setGPS(false);

    ManualCar manualCar = ((ManualCarBuilder) manualCarBuilder).getProduct();

    manualCar.print();

    // Create a CarBuilder instance
    CarBuilder carBuilder = new CarBuilder();

    // Set properties using the builder
    carBuilder.reset();
    carBuilder.setSeats(5);
    carBuilder.setEngine("V6");
    carBuilder.setTripComputer(true);
    carBuilder.setGPS(true);

    // Build the Car object
    Car car = carBuilder.getProduct();

    car.print();
  }
}
