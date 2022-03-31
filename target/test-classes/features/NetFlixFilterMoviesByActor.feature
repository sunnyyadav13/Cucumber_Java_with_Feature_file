#Author: ash
#Test coverage
@NetFlix
Feature: Filter movies by actor
  
  User Story: As a user I want to search for movies based on Actor so that I can decide on number of movies I would want to watch

  Background: Given I have signed in to Netflix

  @Regression @Smoke @Debug
  Scenario Outline: Correct number of movies by actor
    And I have the following movies on Netflix based on Actor
      | Bad Boys                 | Will Smith |
      | Cast Away                | Tom Hanks  |
      | The Pursuit of Happyness | Will Smith |
    When I search for movies by Actor "<Actor>"
    Then I find Number of "<Movies>" by Actor

    Examples: 
      | Actor      | Movies |
      | Will Smith |      2 |
      | Tom Hanks  |      1 |
      | Tom Cruise |      0 |
      | Mr Bean    |      0 |
      | XYZ        |      0 |
      |        123 |      0 |
      | £$%        |      0 |
      |            |      0 |
