package org.example.builder;

import org.example.model.CarStructur;

public interface Builder {
  public void reset();

  public void setSeats(int seats);

  public void setEngine(String string);

  public void setTripComputer(Boolean b);

  public void setGPS(Boolean b);

  public CarStructur getProduct();
}
