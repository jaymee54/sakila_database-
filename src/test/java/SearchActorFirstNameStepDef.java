import demo.Actor;
import demo.ActorRepo;
import demo.FilmRepo;
import demo.SakilaPracticeProjectApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public class SearchActorFirstNameStepDef {

    String testactorfirstname;
    List<Actor> listofactors;
    @Autowired
    ActorRepo actorRepo;
    @Autowired
    FilmRepo filmRepo;
    @Autowired
    SakilaPracticeProjectApplication sakilaPracticeProjectApplication = new SakilaPracticeProjectApplication(actorRepo, filmRepo);

    @Given("an actor first name")
    public void an_actor_first_name() {
        // Write code here that turns the phrase above into concrete actions
        testactorfirstname = "PENELOPE";
    }

    @When("the user searches")
    public void theUserSeaches() {
        listofactors = sakilaPracticeProjectApplication.listactorswithfirstname(testactorfirstname);
    }

    @Then("it should return the given actors")
    public void it_should_return_the_given_actors() {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertNotNull(listofactors);
    }
}


