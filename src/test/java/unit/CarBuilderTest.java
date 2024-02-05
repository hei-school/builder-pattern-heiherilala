package unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.example.builder.CarBuilder;
import org.example.model.Car;
import org.junit.jupiter.api.Test;

public class CarBuilderTest {

  @Test
  void testCarBuilder() {
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

    // Validate the built Car object
    assertEquals(5, car.getSeats());
    assertEquals("V6", car.getEngine());
    assertTrue(car.getTripComputer());
    assertTrue(car.getGPS());
  }
}
