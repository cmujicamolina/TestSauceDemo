Feature: Cuando el usuario una vez que ha ingresado al portal de Saucedemo
  procede a hacer la busqueda de los productos ordenandolos según el criterio
  del usuario y porteriormente agregarlos al carrito de comprar.

  Scenario: Usuario ordena los productos de la Z a la A.

    Given El usuario se encuentra en la pagina de Saucedemo para hacer la compra
    When ingresa su usuario "standard_user"
    Then ingresa su passord "secret_sauce"
    Then hace click en el boton de logueo
    And ordena los productos por "Name (Z to A)"

  Scenario: Usuario ordena los productos de la A a la Z.

    Given El usuario se encuentra en la pagina de Saucedemo para hacer la compra
    When ingresa su usuario "standard_user"
    Then ingresa su passord "secret_sauce"
    Then hace click en el boton de logueo
    And ordena los productos por "Name (A to Z)"

  Scenario: Usuario ordena los productos del precio mas bajo al mas alto.

    Given El usuario se encuentra en la pagina de Saucedemo para hacer la compra
    When ingresa su usuario "standard_user"
    Then ingresa su passord "secret_sauce"
    Then hace click en el boton de logueo
    And ordena los productos por "Price (low to high)"

  Scenario: Usuario ordena los productos del precio mas alto al mas bajo.

    Given El usuario se encuentra en la pagina de Saucedemo para hacer la compra
    When ingresa su usuario "standard_user"
    Then ingresa su passord "secret_sauce"
    Then hace click en el boton de logueo
    And ordena los productos por "Price (high to low)"

