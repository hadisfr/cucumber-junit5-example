Feature: Animal Behaviours

  Scenario Outline: Each animal should make appropriate sound: <animal>
    Given animals are in the zoo
    When zookeeper arrives
    Then <animal> makes <sound>
    Examples:
      | animal | sound |
      | cat    | Mew!  |
      | dog    | Haap! |
