package demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepo extends JpaRepository<Actor, Integer> {
@Query(nativeQuery = true, value = "SELECT * FROM sakila.actor WHERE first_name = ?1")
    public List<Actor> findactorbyname(String actorsearcchfirstname);
}
