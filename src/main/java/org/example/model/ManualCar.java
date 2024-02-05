package org.example.model;

public class ManualCar implements CarStructur {
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

  public ManualCar() {}

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

  @Override
  public Void print() {
    System.out.println("ManualCar Details:");
    System.out.println("Seats: " + seats);
    System.out.println("Engine: " + engine);
    System.out.println("Computer: " + computer);
    System.out.println("GPS: " + (GPS ? "Yes" : "No"));
    System.out.println("Trip Computer: " + (tripComputer ? "Yes" : "No"));
    return null;
  }
}
