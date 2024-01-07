package space.bum.spring;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
public class Passenger {
  private String name;
  private Country country;
  public Passenger(String name) {
    super();
    this.name = name;
  }
  public void setCountry(Country country) {
    this.country = country;
  }
}
