package demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepo extends JpaRepository<Actor, Integer> {
     List<Actor> findByFirstname(String actorsearcchfirstname);

}
