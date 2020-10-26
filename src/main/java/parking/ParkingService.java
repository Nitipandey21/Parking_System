package parking;

public interface ParkingService {

	 Car saveCar(Car car);
	 Car releaseCar(Long id);
	 ParkingVO parkingInfo();
}
