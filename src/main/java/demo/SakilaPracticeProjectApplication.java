package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;
import demo.*;

import java.util.HashMap;
import java.util.List;

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

	@GetMapping("/allActorswithfirstname/{name}")
	public List<Actor> listactorswithfirstname(@PathVariable(value = "name")String firstnamesearch){
		return actorRepo.findactorbyname(firstnamesearch);
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
	@DeleteMapping("/Actor/{id}")
	public void deleteActor(@PathVariable(value = "id") int actorid)
		throws ResourceAccessException {
		Actor actor = actorRepo.findById(actorid)
				.orElseThrow(() -> new ResourceAccessException("Actor not found with id" + actorid));

		actorRepo.delete(actor);
	}
	@PutMapping("/Actor/{id}")
	public ResponseEntity<Actor> udateActor(@PathVariable(value = "id") int actorid,
											@Validated @RequestBody Actor actorDetails) throws ResourceAccessException{
		Actor actor = actorRepo.findById(actorid)
				.orElseThrow(() -> new ResourceAccessException("Actor not found with this id " + actorid));

		actor.setfirstname(actorDetails.getfirstname());
		actor.setlastname(actorDetails.getlastname());
		final Actor updatedActor = actorRepo.save(actor);
		return ResponseEntity.ok(updatedActor);
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable <Film> getAllfilms(){
		return filmRepo.findAll();
	}
}
