#@LoginSwagLabs
#Caracteristicas: login
#Yo, como usuario
#Quiero, tener una opción para iniciar sesión
#Para ver todos los items

Feature: SwagLabs
  @LoginSwagLabs
  Scenario: Iniciar sesión SwagLabs
    Given que me encuentro en la pagina de login de SwagLabs
    When inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce"
    Then valido que deberia aparecer el titulo de "PRODUCTS"
    And tambien valido que al menos exista un item
