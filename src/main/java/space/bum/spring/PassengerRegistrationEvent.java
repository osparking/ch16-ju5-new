package space.bum.spring;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
public class PassengerRegistrationEvent extends ApplicationEvent {
  private Passenger passenger;

  public PassengerRegistrationEvent(Passenger passenger) {
    super(passenger);
    this.passenger = passenger;
  }
}
