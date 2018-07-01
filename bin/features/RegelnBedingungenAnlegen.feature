  Feature: Regel / Bedingung anlegen

      Background:
        Given Ich bin als Admin eingeloggt
      Scenario:
        Given Ich rufe die Regeln auf
        And Ich rufe die Maske (Neu) auf
        When Ich fuege die Daten ein
        And Ich klicke Speichern
        Then Ich sehe die Uebersicht Regeln
        And Die angelegte Regeln ist selektiert
        And Die eingegebenen Daten sind vorhanden
