package space.bum.spring;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:application-context.xml")
class RegistrationTest {

  @Autowired
  private RegistrationManager manager;

  @Autowired
  private Passenger passenger;

  @Test
  void test() {
    var event = new PassengerRegistrationEvent(passenger);
    System.out.println("사건 발생 후:" + passenger);
    manager.getApplicationContext().publishEvent(event);
    assertTrue(passenger.isRegistered());
  }
}
