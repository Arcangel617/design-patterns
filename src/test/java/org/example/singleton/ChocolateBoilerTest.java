package org.example.singleton;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ChocolateBoilerTest {

  private ChocolateBoiler chocolateBoiler;

  @Test
  void shouldCreateAChocolateBoilerInstance() {
    chocolateBoiler = new ChocolateBoiler();

    assertTrue(chocolateBoiler.isEmpty());
    assertFalse(chocolateBoiler.isBoiled());
  }

  @Test
  void shouldFillAChocolateBoiler() {
    chocolateBoiler = new ChocolateBoiler();

    chocolateBoiler.fill();

    assertFalse(chocolateBoiler.isEmpty());
    assertFalse(chocolateBoiler.isBoiled());
  }

  @Test
  void shouldBoil() {
  }

  @Test
  void isEmpty() {
  }

  @Test
  void isBoiled() {
  }
}