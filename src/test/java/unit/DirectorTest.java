package unit;

import static org.junit.jupiter.api.Assertions.*;

import org.example.builder.CarBuilder;
import org.example.builder.Director;
import org.example.model.Car;
import org.junit.jupiter.api.Test;

public class DirectorTest {

  @Test
  void testConstructSportsCar() {
    // Create a CarBuilder instance
    CarBuilder carBuilder = new CarBuilder();

    // Call constructSportsCar method
    Director.constructSportsCar(carBuilder);

    // Build the Car object
    Car sportsCar = carBuilder.getProduct();

    // Validate the constructed SportsCar object
    assertEquals(4, sportsCar.getSeats());
    assertEquals("new SportEngine", sportsCar.getEngine());
    assertTrue(sportsCar.getTripComputer());
    assertTrue(sportsCar.getGPS());
  }

  @Test
  void testConstructSmallCar() {
    // Create a CarBuilder instance
    CarBuilder carBuilder = new CarBuilder();

    // Call constructSmallCar method
    Director.constructSmallCar(carBuilder);

    // Build the Car object
    Car smallCar = carBuilder.getProduct();

    // Validate the constructed SmallCar object
    assertEquals(4, smallCar.getSeats());
    assertEquals("new small car", smallCar.getEngine());
    assertTrue(smallCar.getTripComputer());
    assertTrue(smallCar.getGPS());
  }

  // You can add more tests based on your specific requirements.
}
