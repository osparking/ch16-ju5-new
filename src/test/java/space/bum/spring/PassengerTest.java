package space.bum.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static space.bum.spring.PassengerUtil.getExpectedPassenger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:application-context.xml")
class PassengerTest {
  @Autowired
  private Passenger passenger;
  private static Passenger expectedPassenger;

  @BeforeEach
  void setUp() {
    expectedPassenger = getExpectedPassenger();
  }

  @Test
  void testIfPassengerIsInContextAsExpected() {
    assertEquals(expectedPassenger, passenger);
    System.out.println(passenger);
  }

}
