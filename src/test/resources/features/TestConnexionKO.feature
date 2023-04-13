Feature: Cas non passants utilisateur non valide

  @POEI23-383
  Scenario Outline: Cas non passants utilisateur non valide
    Given je renseigne le lien de connexion du site Swag Labs "https://www.saucedemo.com/"
    When  je saisis le nom d'utilisateur "<login>"
    And   je saisis le mot de passe "<mot_de_passe>"
    And   je clique sur le bouton Login
    Then  je verifie que le message erreur suivant "<error_message>" s'affiche
    Examples:
      | login           | mot_de_passe  |  | error_message                                                             |
      | locked_out_user | secret_sauce  |  | Epic sadface: Sorry, this user has been locked out.                       |
      | locked_out_user | secret_sauce1 |  | Epic sadface: Username and password do not match any user in this service |
