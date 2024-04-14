Feature: Deschiderea unei pagini web
  Ca utlizator vreau sa pot deschide orice pagina web
  Scenario:
    Given Deschid browserul
    When Accesez pagina "https://www.wikipedia.org"
    Then Pagina "https://www.wikipedia.org/" este afisata corect si contine textul "The Free Encyclopedia"
    And Apas pe dropdown-ul Alege limba si selectez limba romana
    And Vreau sa caut informatii despre "Printul Charles"
    Then Pagina "https://ro.wikipedia.org/wiki/Charles_al_III-lea" este afisata corect si contine textul "Căsătorit cu Diana, Prințesă de Wales (29 iulie 1981–28 august 1996)"
    And Inchid browserul

