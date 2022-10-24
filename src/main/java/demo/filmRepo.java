package demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface filmRepo extends JpaRepository<film, Integer> {
}
