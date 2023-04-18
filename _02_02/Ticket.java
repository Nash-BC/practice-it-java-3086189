package _02_02;

public class Ticket {

  private String destination;
  private double price;
  private boolean isReturn;

  public Ticket() {
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public boolean isReturn() {
    return isReturn;
  }

  public void setReturn(boolean isReturn) {
    this.isReturn = isReturn;
  }

}
