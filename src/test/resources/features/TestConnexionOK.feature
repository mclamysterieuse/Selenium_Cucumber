Feature: Sauce Demo Test connexion ok

  @TESTOK
  Scenario Outline: Sauce Demo Test connexion ok
    Given je renseigne le lien de connexion du site Swag Labs "https://www.saucedemo.com/"
    When  je saisis le nom d'utilisateur "<login>"
    And   je saisis le mot de passe "<mot_de_passe>"
    And   je clique sur le bouton Login
    And   je clique sur le bouton AddTocard
    And   je clique sur la card
    Then  je me connecte dans le site "Swag Labs"
    And   Le nombre d'articles dans le panier est "1"
    And   le prix de l'article est de "$29.99"

    Examples:
      | login                   | mot_de_passe |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
