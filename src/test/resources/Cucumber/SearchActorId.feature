Feature: Search for actor by ID.
  As a user I would like to be able search for an actor by their actor id.

  Scenario: successfully retrieve the actor with given id.

    Given an actor id
    When the user seaches
    Then it should return the given actor