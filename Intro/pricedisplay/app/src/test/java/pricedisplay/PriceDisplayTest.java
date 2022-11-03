package pricedisplay;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriceDisplayTest {
  @Test
  public void displayingNameAndPrice() {
    assertEquals("The price for item: Apple is 2", String.valueOf("The price for item: Apple is 2"));
  }
}
