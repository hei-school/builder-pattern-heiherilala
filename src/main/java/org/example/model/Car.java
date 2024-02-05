package org.example.model;

public class Car implements CarStructur {
  private int seats;
  private String engine;
  private String computer;
  private Boolean GPS;

  private Boolean tripComputer;

  public void setComputer(String computer) {
    this.computer = computer;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void setGPS(Boolean haveGPS) {
    this.GPS = haveGPS;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public void setTripComputer(Boolean haveTripComputer) {
    this.tripComputer = haveTripComputer;
  }

  public int getSeats() {
    return seats;
  }

  public String getEngine() {
    return engine;
  }

  public String getComputer() {
    return computer;
  }

  public Boolean getGPS() {
    return GPS;
  }

  public Boolean getTripComputer() {
    return tripComputer;
  }

  public Car() {}

  @Override
  public Void print() {
    System.out.printf(
        "Car Details:%nSeats: %d%nEngine: %s%nComputer: %s%nGPS: %s%nTrip Computer: %s%n",
        seats, engine, computer, GPS ? "Yes" : "No", tripComputer ? "Yes" : "No");
    return null;
  }
}
