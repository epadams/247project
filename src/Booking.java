public class Booking {
  private User user;
  private double price;
  private int numTickets;
  private String ticket;

  public void purchase() {

  }

  public void purchaseForOtherUser() {

  }

  public void searchAll() {

  }

  public String search(String query) {
    return "";
  }

  public String search(Preferences preference) {
    return "";
  }

  public void cancelBooking() {

  }

  public void refundCancelledBooking() {

  }

  public double getPrice() {
    return (price * numTickets);
  }

  public void setNumTickets(int numTickets) {
    this.numTickets = numTickets;
  }

  public void purchaseAddLuggageStorage() {

  }
}
