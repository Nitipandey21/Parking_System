package parking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CarController {
	@Autowired
	private CarServiceImpl service;

	@PostMapping("/car")
	public Car addCar( @RequestBody Car car) {
	return 	service.saveCar(car);
	}
	
	@PutMapping("/parkings")
	public Car releaseCar(@RequestHeader(value ="carId",required =true) Long carId) {
		return service.releaseCar(carId);
	}

	@GetMapping("/parking")
	public ParkingVO getParkingInfo() {
	return 	service.parkingInfo();
	}
}
