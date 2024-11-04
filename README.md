# Ejecución de Aplicativos

Para poder ejecutar ambos aplicativos:

1. Descargar el repositorio.
2. Inicializar el aplicativo backend (requiere tener instalado Java 17-21):
   - Dentro de `src`, iniciar la app con `./mvnw spring-boot:run`.
   - Es accesible en servidor local dentro del puerto 8080.
3. Inicializar el aplicativo front (requiere tener instalado Java 17-21):
   - Dentro de `src`, iniciar la app con `ng-serve` en consola.
   - Se ejecuta en el navegador en local, dentro del puerto 4200.

Para demostración:
- Dentro del puerto 4200, existen vistas en los directorios `/registro`, `/consulta`, `/borrar` para operaciones CRUD del MVC.
