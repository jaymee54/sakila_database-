import demo.SakilaPracticeProjectApplication;
import org.springframework.boot.test.context.SpringBootTest;
import io.cucumber.spring.CucumberContextConfiguration;
@CucumberContextConfiguration
@SpringBootTest(classes = SakilaPracticeProjectApplication.class)

public class CucumberSpringConfiguration {
}
