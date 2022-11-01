package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin

public class SakilaPracticeProjectApplication {
	@Autowired
	private ActorRepo actorRepo;
	private FilmRepo filmRepo;
	public SakilaPracticeProjectApplication(ActorRepo MyActorRepo, FilmRepo myfilmRepo){
		this.actorRepo = MyActorRepo;
		this.filmRepo = myfilmRepo;

	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaPracticeProjectApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable <Actor> getAllActors(){
		return actorRepo.findAll();
	}

	@GetMapping("/allActors/{id}")
	public Actor getsingleActor(@PathVariable(value = "id") int actorid){
		return actorRepo.findById(actorid).orElseThrow(() -> new ResourceAccessException("Actor index not found "+actorid));
	}
	@PostMapping("/Actor")
	public Actor createActor(@Validated @RequestBody Actor actor){
		return actorRepo.save(actor);
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable <Film> getAllfilms(){
		return filmRepo.findAll();
	}
}
