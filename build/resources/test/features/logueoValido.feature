Feature: Logueo de Usuarios
  Esta característica permite a los usuarios ingresar correctamente a
  la ventana de logueo de Saucedemo, considerando el usuario y password
  correctos.

  Scenario: Logueo correcto de usuarios validos (standard_user)
    Este escenario consiste en usuarios validos
    que se loguean correctamente a la portal de Saucedemo.

    Given El usuario se encuentra en la pagina de Saucedemo
    When ingresa su nombre de usuario "standard_user" al campo Username
    And ingresa su password "secret_sauce" al campo Password
    Then ingresa al portal de Saucedemo

  Scenario: Logueo incorrecto de usuarios validos (standar_user)
  Este escenario consiste en usuarios validos
  que se loguean incorrectamente a la portal de Saucedemo.

    Given El usuario se encuentra en la pagina de Saucedemo
    When ingresa su nombre de usuario "standard_user" al campo Username
    And ingresa su password "xxxxx" al campo Password
    Then no ingresa al portal de Saucedimo, se visualiza mensaje de error

  Scenario: Logueo incorrecto de usuarios validos (locked_out_user)
  Este escenario consiste en usuarios validos
  que se loguean incorrectamente a la portal de Saucedemo.

    Given El usuario se encuentra en la pagina de Saucedemo
    When ingresa su nombre de usuario "locked_out_user" al campo Username
    And ingresa su password "secret_sauce" al campo Password
    Then no ingresa al portal de Saucedimo, se visualiza mensaje de error

  Scenario: Logueo correcto de usuarios validos (problem_user)
  Este escenario consiste en usuarios validos
  que se loguean correctamente a la portal de Saucedemo.

    Given El usuario se encuentra en la pagina de Saucedemo
    When ingresa su nombre de usuario "problem_user" al campo Username
    And ingresa su password "secret_sauce" al campo Password
    Then ingresa al portal de Saucedemo

  Scenario: Logueo correcto de usuarios validos (performance_glitch_user)
  Este escenario consiste en usuarios validos
  que se loguean correctamente a la portal de Saucedemo.

    Given El usuario se encuentra en la pagina de Saucedemo
    When ingresa su nombre de usuario "performance_glitch_user" al campo Username
    And ingresa su password "secret_sauce" al campo Password
    Then ingresa al portal de Saucedemo