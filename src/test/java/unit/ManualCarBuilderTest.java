package unit;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

import org.example.builder.ManualCarBuilder;
import org.example.model.ManualCar;
import org.junit.Test;

public class ManualCarBuilderTest {

  @Test
  public void testManualCarBuilder() {
    // Create a ManualCarBuilder instance
    ManualCarBuilder manualCarBuilder = new ManualCarBuilder();

    // Set properties using the builder
    manualCarBuilder.reset();
    manualCarBuilder.setSeats(4);
    manualCarBuilder.setEngine("Manual Engine");
    manualCarBuilder.setTripComputer(true);
    manualCarBuilder.setGPS(false);

    // Build the ManualCar object
    ManualCar manualCar = ((ManualCarBuilder) manualCarBuilder).getProduct();

    // Validate the built ManualCar object
    assertEquals(4, manualCar.getSeats());
    assertEquals("Manual Engine", manualCar.getEngine());
    assertTrue(manualCar.getTripComputer());
    assertFalse(manualCar.getGPS());
  }
}
