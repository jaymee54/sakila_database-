package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin

public class SakilaPracticeProjectApplication {
	@Autowired
	private ActorRepo actorRepo;
	public SakilaPracticeProjectApplication(ActorRepo MyActorRepo){
		this.actorRepo = MyActorRepo;

	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaPracticeProjectApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable <Actor> getAllActors(){
		return actorRepo.findAll();
	}
}
