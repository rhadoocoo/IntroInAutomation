Feature: Deschiderea unei pagini web
  Ca utlizator vreau sa pot deschide orice pagina web
  Scenario:
    Given Deschid browserul
    When Accesez pagina "https://www.wikipedia.com"
    Then Pagina "wikipedia.org" este afisata corect
    Then Apas pe dropdown-ul Alege limba si selectez limba romana
    And Vreau sa caut informatii despre "Printul Charles"