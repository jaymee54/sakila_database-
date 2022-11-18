Feature: delete a given actor
        I would like to be able delete an actor by their full name.

  Scenario: successfully delete the actor with given their full name.

    Given an actors full name
    When the user deletes their name
    And searches for the name
    Then it should not return the given actor