package space.bum.spring;

public class PassengerUtil {
  public static Passenger getExpectedPassenger() {
    Passenger passenger = new Passenger("김철수");
    passenger.setCountry(new Country("대한민국", "KR"));
    return passenger;
  }
}
