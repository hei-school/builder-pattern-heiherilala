package unit;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

import org.example.builder.CarBuilder;
import org.example.builder.Director;
import org.example.model.Car;
import org.junit.Test;

public class DirectorTest {

  @Test
  public void testConstructSportsCar() {
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
  public void testConstructSmallCar() {
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
