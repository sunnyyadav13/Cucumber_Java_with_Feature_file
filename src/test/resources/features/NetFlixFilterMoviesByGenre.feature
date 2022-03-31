#Author: ash
#Test coverage
@NetFlix
Feature: Filter movies by actor
  
  User Story: As a user I want to search for movies based on Actor so that I can decide on number of movies I would want to watch

  @Regression @Smoke @Debug
  Scenario Outline: Correct number of movies by genre
    Given I have signed in to Netflix
    And I have the following movies by genre on Netflix
      | Bad Boys                 | Action    |
      | Cast Away                | Adventure |
      | The Pursuit of Happyness | Biography |
    When I search for movies by Genre "<Genre>"
    Then I find Number of "<Movies>" by Genre

    Examples: 
      | Genre     | Movies |
      | Adventure |      1 |
      | Biography |      1 |
      | Horror    |      0 |
      | XYZ       |      0 |
      |       123 |      0 |
      | £$%       |      0 |
      |           |      0 |
