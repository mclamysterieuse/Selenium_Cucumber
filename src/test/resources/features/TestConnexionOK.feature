Feature: Sauce Demo Test connexion ok

  @POEI23-363
  Scenario Outline: Sauce Demo Test connexion ok
    Given je renseigne le lien de connexion du site Swag Labs "https://www.saucedemo.com/"
    When  je saisis le nom d'utilisateur "<login>"
    And   je saisis le mot de passe "<mot_de_passe>"
    And   je clique sur le bouton Login
    And   je clique sur le bouton AddTocard
    And   je clique sur la card
    Then  je me connecte dans le site "Swag Labs"
    And   Le nombre d'articles dans le panier est "<expected_quantity>"
    And   le prix de l'article est de "<expected_price>"

    Examples:
      | login                   | mot_de_passe |expected_quantity |expected_price|
      | standard_user           | secret_sauce |     2           |$29.99        |
      | performance_glitch_user | secret_sauce  |     2           |$29.99        |
      | problem_user            | secret_sauce  | 2               | $29.99        |