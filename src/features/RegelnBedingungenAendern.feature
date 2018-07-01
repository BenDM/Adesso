Feature: Regeln

  Scenario:
    Given Ich bin als Admin eingeloggt
    Given Ich rufe die Regeln auf
    And Ich rufe die Maske (Aendern) auf
    When Ich aendere die Daten
    And Ich klicke Speichern
    Then Ich sehe die Uebersicht Regeln
    And Die geaenderte Regeln ist selektiert
    And Die geaenderte Daten sind vorhanden

  Scenario:
    Given Ich bin als Admin eingeloggt
    Given Ich rufe die Regeln auf
    And Ich rufe die Maske (Neu) auf
    When Ich fuege die Daten ein
    And Ich klicke Speichern
    Then Ich sehe die Uebersicht Regeln
    And Die angelegte Regeln ist selektiert
    And Die eingegebenen Daten sind vorhanden
