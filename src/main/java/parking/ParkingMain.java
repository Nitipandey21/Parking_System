package parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(scanBasePackages = "parking")
@RestController
public class ParkingMain {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication app = new SpringApplication(ParkingMain.class);
		app.run(args);
	}
}
