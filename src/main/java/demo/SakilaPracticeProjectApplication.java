package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin

public class SakilaPracticeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SakilaPracticeProjectApplication.class, args);
	}

}
