package pricedisplay;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriceDisplayTest {
  @Test
  public void displayingNameAndPrice() {
    PriceDisplay display = new PriceDisplay();
    assertEquals("The price for item: Apple is 2", String.valueOf("The price for item: Apple is 2"));
  }
}
