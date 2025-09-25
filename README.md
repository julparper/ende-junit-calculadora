# Testing con Junit

Este es un ejemplo sencillo de pruebas unitarias usando Junit 5

Y ejemplo de Mock usando Mockito. 
> Observa que los DAO son interfaces y que ClienteDAOImpl **no** está implementado.

En la clase MartingTest2 tienes un ejemplo de el uso parcial de Mocks (spy):
- `contratarReal`: Ejecuta el método insertar de la clase OfertaDAOImpl
- `contratarRealCambiado`: Ejecuta una simulación de insertar devolviendo 99 cuando se llame con María García.