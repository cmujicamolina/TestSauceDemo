Feature: El usuario que se ha logueado al app de Saucedemo va a realizar la selección online
  de productos y luego procede a realizar la compra en el carrito del aplicativo.

  Scenario: El usuario selecciona los productos que va a comprar y realiza el checkout.

    Given El usuario se loguea a la plataforma Saucedemo
    When ingresa a la plataforma su usuario "standard_user"
    Then ingresa a la plataforma su passord "secret_sauce"
    Then selecciona backpack
    Then selecciona bikelight
    Then hace checkout
    Then escribe el nombre del comprador "Christian" al formulario
    Then escribe el apellido del comprador "Mujica" al formulario
    Then escribe el postal "051" al formulario
    Then hace click en el boton continue
    And hace click en el boton finish para terminar la compra

