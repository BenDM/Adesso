Feature: Regel / Bedingung aendern

  Background: 
    Given Ich bin als <Admin> eingeloggt

  Scenario: 
    Given Ich rufe die <Regeln> auf
    And Ich rufe die <Maske (Aendern)> auf
    When Ich aendere die Daten
    And Ich klicke Speichern
    Then Ich sehe die Uebersicht <Regeln>
    And Die geaenderte <Regeln> ist selektiert
    And Die geaenderte Daten sind vorhanden