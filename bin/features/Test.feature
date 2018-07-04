Feature: Stammdaten

  Background:
    Given Ich bin als Admin eingeloggt

  Scenario Outline: Stammdaten suchen
    Given Ich rufe die Stammdaten auf
    And Ich sehe die Uebersicht Stammdaten
    When Ich gebe im Suchfeld folgende Parameters '<Stammdatensatznummer>' ,'<Kundennummer>','<Mitarbeiternummer>'
    And Ich klicke Suchen
    Then Die gesuchte Stammdaten ist selektiert
    And Ich kann Detailansicht aufrufen

  Examples:
      | Stammdatensatznummer | Kundennummer | Mitarbeiternummer |
      |                    1 |            1 |                 1 |
      |                    2 |            2 |                 2 |
      |                    3 |            3 |                 3 |

    #Examples:
      #| Kategorie  | Anrede | Titel | Name  | Vorname  | Land        | Sprache | Geschlecht |
      #| Kategorie1 | Herr   | Dr.1  | Name1 | Vorname1 | Deutschland | Deustch | männlich   |
      #| Kategorie2 | Frau   | Dr.2  | Name2 | Vorname2 | Deutschland | Deustch | weiblich   |
      #| Kategorie3 | Herr   | Dr.3  | Name3 | Vorname3 | Deutschland | Deustch | männlich   |
    #Examples:
      #| Stammdatensatznummer | Kundennummer | Mitarbeiternummer | Provisionsnummernummer |
      #|                    1 |            1 |                 1 |                      1 |
      #|                    2 |            2 |                 2 |                      2 |
      #|                    3 |            3 |                 3 |                      3 |
#
  #Scenario Outline: generate and send confirmation email - section 1
    #Given I have stored itinerary in  '<EmbeddedItinerary>'
    #When Generate confirmation email
    #Then section1 should have   parameters '<Param1_1>', '<Param1_2>', '<Param1_3>'
#
    #Examples:
      #| EmbeddedItinerary | Param1_1 | Param1_2 | Param1_3 |
      #| Itinerary_1       | Value1_1 | Value1_2 | Value1_3 |
