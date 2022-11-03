class PriceDisplay {
  public static void main(String[] args) {
    String itemName = "Coffee machine";
    Double price = 15.99;
    System.out.printf("The price for the item %s is %.2f", itemName, price);
  }

  Integer getPriceLabel(String itemName, int price) {
    System.out.printf("The price for item: %s is %i", itemName, price)
  }
}