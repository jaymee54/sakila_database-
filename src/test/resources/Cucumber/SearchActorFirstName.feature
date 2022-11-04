Feature: Search for actor by first name.
  As a user I would like to be able search for an actor by their actor first name.

  Scenario: successfully retrieve the actor with given first name.

    Given an actor first name
    When the user searches
    Then it should return the given actors