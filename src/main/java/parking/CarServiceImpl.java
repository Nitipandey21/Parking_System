package parking;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements ParkingService {

	@Autowired
	private CarRepository repo;
	@Autowired
	private SmallParking sParking;
	@Autowired
	private MediumParking mParking;
	@Autowired
	private ParkingVO  parkingVO;

	@Override
	public Car saveCar(Car car) {
		double area = car.getLength()*car.getBreadth();

		if(area <= sParking.area) {
			car.setType(ParkingType.SMALL);
			SmallParking.s_size--;
		}else if (area>sParking.area && area<=mParking.area) {
			car.setType(ParkingType.MEDIUM);
			MediumParking.m_size--;
		}else {
			car.setType(ParkingType.LARGE);
			LargeParking.l_size--;
		}
		return repo.save(car);
	}

	@Override
	public Car releaseCar(Long id) {
		Optional<Car> car = repo.findById(id);
		car.get().setIsdeleted(Boolean.TRUE);
		if(car.get().getType() == ParkingType.SMALL) {
			SmallParking.s_size++;
		}else if (car.get().getType() == ParkingType.MEDIUM) {
			MediumParking.m_size++;
		}else {
			LargeParking.l_size++;
		}

		return repo.save(car.get());

	}

	@Override
	public ParkingVO parkingInfo() {
		parkingVO.setSmallSpace(SmallParking.s_size);
		parkingVO.setMediumSpace(MediumParking.m_size);
		parkingVO.setLargeSpace(LargeParking.l_size);
		return parkingVO;
	}
}
