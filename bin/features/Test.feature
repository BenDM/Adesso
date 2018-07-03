Feature: Stammdaten

  Background:
    Given Ich bin als Admin eingeloggt

  Scenario Outline: Stammdaten suchen
    Given Ich rufe die Stammdaten auf
    And Ich sehe die Uebersicht Stammdaten
    When Ich gebe eine <Stammdatensatznummer> und <Kundennummer> und <Mitabeiternummer> im Suchfeld ein
    And Ich klicke Suchen
    Then Die gesuchte Stammdaten ist selektiert
    And Ich kann Detailansicht aufrufen

    Examples:
      | Stammdatensatznummer | Kundennummer | Mitarbeiternummer |
      |                    1 |            1 |                 1 |
      |                    2 |            2 |                 2 |
      |                    3 |            3 |                 3 |
