# TestSauceDemo
1. Crear las imagenes de docker del archivo: docker-compose_selenium.yml (Este archivo yamel contiene las ultimas versiones de las imagenes de los navegadores) con el siguiente comando (colocarse con CMD sobre la carpeta en el que se encuentra el archivo yml):
            
            docker-compose -f docker-compose_selenium.yml up -d

3. Los casos de pruebas se encuentran en el archivo: CasosPruebas.txt
4. El proyecto esta creado con selenium, docker(Para navegadores de ultima version), librerias cucumber y lenguaje gherkins.
5. Los reportes de las ejecuciones se visulizan en la siguiente ruta del proyecto:
      
      TestSaucedemo\target\cucumber-reports\cucumber-pretty\index.html
