package org.example.singleton;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class SingletonTest {

  @Test
  void shouldGetUniqueInstance() {
    Singleton singleton = Singleton.getInstance();

    assertNotNull(singleton);
  }

}