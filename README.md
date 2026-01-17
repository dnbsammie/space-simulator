<h1 align="center">RETO 1 - Simulador de Viaje Interplanetario</h1>
<img src="banner.png" width="100%"></img>
<br/>
<p align="center">
  <a href="https://github.com/dnbsammie/space-simulator/issues">
    <img src="https://img.shields.io/github/issues/dnbsammie/space-simulator" alt="Issues">
  </a>
  <a href="https://github.com/dnbsammie/space-simulator/stargazers">
    <img src="https://img.shields.io/github/stars/dnbsammie/space-simulator" alt="Stars">
  </a>
  <a href="https://github.com/dnbsammie/space-simulator/blob/main/LICENSE">
    <img src="https://img.shields.io/github/license/dnbsammie/space-simulator" alt="License">
  </a>
</p>
<h3>Descripción:</h3>
<p>Desarrollar un simulador de viaje interplanetario, donde se gestionará un viaje espacial a diferentes planetas del sistema solar. El usuario obtendrá la experiencia de elegir el destino, gestionar recursos de la nave, calcular tiempo de viaje y resolver conflictos a medida que los eventos se vuelven más complejos.</p>

<p>Puedes encontrar el link de la presentación <a href="https://youtu.be/VV7WT9pXnbc" target="_blank">acá mismo 🎥</a></p>

<h3 align="left">Lenguajes y herramientas:</h3>

<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=github,figma,vscode,idea,redhat,git,css,java,maven,md&theme=dark&perline=5" />
  </a>
</p>
<!-- TABLE OF CONTENTS -->
<details>
  <summary>Índice:</summary>
  <ol>
    <li><a href="#objectives">🎯 Objetivos</a></li>
    <li><a href="#requeriments">🚀 Requerimientos</a></li>
    <li><a href="#architecture">🚧 Arquitectura</a></li>
    <li><a href="#usage">🧮 Uso</a></li>
    <li><a href="#license">📄 Licencia</a></li>
    <li><a href="#footer">🙏 Gracias</a></li>
  </ol>
</details>

<!-- OBJETIVOS -->
<h2 id="objectives">🎯 Objetivos</h2>
<ol>
    <li><strong>Seleccionar Destino interplanetario</strong></li>
      <ul>
        <li>Permitir al usuario elegir un planeta destino entre una lista de planetas del sistema solar.</li>
      </ul>
    <li><strong>Calcular distancia y tiempo de viaje</strong></li>
      <ul>
        <li>Calcular la distancia entre la tierra y el planeta destino, considerar el tiempo de viaje tomando la velocidad dada.</li>
      </ul>
    <li><strong>Gestionar Recursos de la nave</strong></li>
      <ul>
        <li>Calcular la cantidad de combustible necesario para el viaje y permitir al usuario administrar los recursos (Combustible y oxigeno). Esto variara según los recursos disponibles y necesarios para cierto destino.</li>
      </ul>
    <li><strong>Simular eventos aleatorios durante el viaje</strong></li>
      <ul>
        <li>Introducción de eventos aleatorios que puedan afectar el viaje tanto del entorno como del sistema. El usuario deberá intervenir para resolverlos.</li>
      </ul>
    <li><strong>Monitoreo el estado del viaje</strong></li>
      <ul>
        <li>El usuario podrá ver el progreso del viaje, cantidad de recursos disponibles y tiempo restante para llegar al destino.</li>
      </ul>
</ol>

<!-- REQUISITOS DEV -->
<h2 id="requirements">🚀 Requerimientos</h2>
<ol>
    <li><strong>Selección de Planeta de Destino</strong></li>
      <ul>
        <li>Presentar al usuario una lista de planetas del sistema solar para elegir el destino del viaje.</li>
        <li>Solicitar la confirmación del usuario y mostrar información básica del planeta.</li>
      </ul>
    <li><strong>Gestión de la Nave Espacial</strong></li>
      <ul>
        <li>El sistema ofrecerá al usuario una lista de naves espaciales, cada una con características básicas, como la velocidad máxima y la capacidad de pasajeros.</li>
        <li>El usuario deberá especificar la cantidad de pasajeros que viajarán. El sistema solo verificará que se ingrese un valor positivo, pero no limitará la cantidad máxima.</li>
        <li>Basado en la velocidad de la nave y la distancia del planeta seleccionado, el sistema calculará la duración estimada del viaje en días.</li>
      </ul>
    <li><strong>Simulación del Viaje</strong></li>
      <ul>
        <li>El sistema mostrará el avance del viaje mediante una serie de mensajes en la consola, indicando el porcentaje completado del trayecto.</li>
        <li>El progreso se calculará utilizando bucles básicos y se presentaran mensajes condicionales para indicar las etapas clave del viaje, como: "Inicio del viaje", "Mitad del camino", y "Llegada al destino".</li>
      </ul>
    <li><strong>Interacción con el Usuario</strong></li>
      <ul>
        <li>El sistema debe proporcionar un menú interactivo en consola que permita al usuario elegir entre las siguientes opciones:</li>
          <ul>
            <li>Seleccionar un Planeta de Destino.</li>
            <li>Seleccionar una Nave Espacial.</li>
            <li>Iniciar la simulación del viaje.</li>
            <li>Salir del programa.</li>
          </ul>
        <li>El sistema debe verificar que el usuario elija una opción válida en el menú. Si el usuario ingresa una opción no válida, se mostrará un mensaje y se volverá a presentar el menú.</li>
      </ul>
    <li><strong>Manipulación de Datos</strong></li>
      <ul>
        <li>Los datos como la distancia al planeta, la velocidad de la nave, y la cantidad de pasajeros se manejarán utilizando tipos de datos básicos como int, double, y String.</li>
        <li>Los planetas y las naves espaciales se almacenarán en arrays para facilitar su selección e información. Por ejemplo, un array de strings para los nombres de los planetas y otro array para las distancias correspondientes.</li>
      </ul>
    <li><strong>Modularidad y Métodos</strong></li>
      <ul>
        <li>El sistema debe utilizar métodos para separar la lógica de selección del planeta, cálculo de la duración del viaje, y simulación del trayecto. Cada funcionalidad principal se implementará en un método separado.</li>
        <li>Los métodos aceptarán parámetros para recibir datos del usuario.</li>
      </ul>
</ol>

<!-- ARQUITECTURA -->
<h2 id="#architecture">🚧 Arquitectura</h2>
<p>Para el desarrollo se optó por una arquitectura hexagonal ligera:</p>

```text
spacesimulator/
├─ .idea/
├─ .mvn/
├─ src/
│ ├─ main/
│ │ ├─ java/
│ │ │ ├─ com.dnbsammie.spacesimulador/
│ │ │ │ ├─ app/				# Punto de entrada
│ │ │ │ │ └─ SpaceSimulatorApp.java
│ │ │ │ │
│ │ │ │ ├─ core/			# Reglas del simulador
│ │ │ │ │ ├─ Event.java
│ │ │ │ │ ├─ Planet.java
│ │ │ │ │ ├─ Question.java
│ │ │ │ │ ├─ Ship.java
│ │ │ │ │ └─ TravelStatus.java
│ │ │ │ │
│ │ │ │ ├─ data/			# Carga de .json, repostiorios
│ │ │ │ │ ├─ JsonLoader.java
│ │ │ │ │ ├─ PlanetRepository.java
│ │ │ │ │ ├─ QuestionRepository.java
│ │ │ │ │ └─ ShipRepository.java
│ │ │ │ │
│ │ │ │ ├─ engine/			# Flujo, estados, simulación
│ │ │ │ │ ├─ EventEngine.java
│ │ │ │ │ ├─ GameEngine.java
│ │ │ │ │ ├─ GameState.java
│ │ │ │ │ ├─ QuestionEngine.java
│ │ │ │ │ └─ TravelEngine.java
│ │ │ │ │
│ │ │ │ ├─ io/				# Logging, consola, archivos
│ │ │ │ │ ├─ FileManager.java
│ │ │ │ │ └─ LoggerFactory.java
│ │ │ │ │
│ │ │ │ └─ ui/				# JavaFX, Controladores
│ │ │ │   ├─ extras/
│ │ │ │   ├─ menu/
│ │ │ │   ├─ settings/
│ │ │ │   ├─ travel/
│ │ │ │   ├─ BaseController.java
│ │ │ │   ├─ HudController.java
│ │ │ │   ├─ MainController.java
│ │ │ │   ├─ NavigationController.java
│ │ │ │   └─ ViewType.java
│ │ │ │
│ │ │ └─ module-info.java
│ │ │
│ │ └─ resources/
│ │   └─ com.dnbsammie.spacesimulator/
│ │       ├─ data/
│ │       │ ├─ planets.json
│ │       │ ├─ questions.json
│ │       │ └─ spaceships.json
│ │       │
│ │       ├─ ui/
│ │       │ ├─ fonts/           # .ttf
│ │       │ ├─ icons/           # Ikonli
│ │       │ ├─ images/
│ │       │ ├─ styles/          # .css
│ │       │ └─ views/           # .fxml              
│ │       │
│ │       └─ logback.xml 
│ │ 
│ └─ test/      # JUnit
│     └─ java/ 
│         └─ com.dnbsammie.spacesimulator/    
│             ├─ core/  
│             └─ engine/ 
│ 
├─ target/ 
├─ .gitignore 
├─ mvnw 
├─ mvnw.card 
└─ pom.xml
```

<h3 id="roadmap">🗺️ Roadmap</h3>

<p>
Este proyecto esta abierto a seguir siendo alimentando. A continuación, algunas ideas de evolución:
</p>

<ul>
  <li>📦 <strong>Mejorar la estructura del código</strong>: refactorizar clases y aplicar patrones de diseño.</li>
  <li>🎨 <strong>Ampliar la interfaz gráfica</strong>: añadir más componentes y vistas con JavaFX.</li>
  <li>🧪 <strong>Pruebas unitarias</strong>: incorporar JUnit para asegurar calidad y estabilidad.</li>
  <li>📚 <strong>Documentación</strong>: enriquecer el README y añadir ejemplos prácticos.</li>
  <li>🌐 <strong>Internacionalización</strong>: soporte multilenguaje.</li>
  <li>🤝 <strong>Contribuciones de la comunidad</strong>: abrir espacio para nuevas ideas y mejoras educativas.</li>
</ul>

<p>
Este roadmap es una guía inicial y puede crecer con nuevas propuestas. 
¡Tu aporte puede ser parte de la evolución de este proyecto educativo!
</p>


<!-- USO -->
<h2 id="usage">🧮 Uso</h2>
<h3>🎓 Fines educativos</h3>
<p>Este proyecto está diseñado con fines <strong>educativos y de aprendizaje</strong>. Puedes utilizar el código para:</p>

<ul>
  <li>Explorar conceptos de programación en Java.</li>
  <li>Practicar técnicas de desarrollo y buenas prácticas.</li>
  <li>Consultar ejemplos como referencia en tus estudios.</li>
</ul>

<p>
  <strong>Importante:</strong> El uso de este código en <em>entornos de producción</em> o con <em>fines comerciales</em> está estrictamente prohibido.
  La redistribución solo se permite en contextos académicos o personales, siempre manteniendo esta nota de licencia y atribución. Si quieres conocer más, consulta la sección de <a href="#license">licencia</a>.</p>

<h3>⚙️ Requisitos previos</h3>
<p>Antes de clonar y ejecutar el proyecto, asegúrate de tener instaladas las siguientes herramientas:</p> 
<ul> 
   <li><strong>IDE Preferido</strong> para tu desarrollo con java (IntelliJ IDEA, VS Code, Eclipse, etc.).</li>
   <li><strong>Java JDK</strong> versión 21 o superior.</li>
   <li><strong>Maven</strong> para la gestión de dependencias y construcción del proyecto.</li>
   <li><strong>Git</strong> para clonar el repositorio y manejar el control de versiones.</li>
   <li><strong>OPCIONAL:</strong> WiX Toolset (v3.14).</li>
</ul>
<p>No es necesario instalar JavaFX manualmente, Maven gestiona todas las dependencias.</p>
<br/>
<p><strong>Nota:</strong> Verifica tus variables de entorno como <code>JAVA_HOME</code> o <code>MAVEN_HOME</code> estén configuradas correctamente y que los siguientes comandos funcionen en tu terminal:</p>

```bash
java -version
mvn -v
```

<h3>📥 Clonar el proyecto</h3>
<p>Este simulador interactivo de viajes espaciales desarrollado en Java 21 y JavaFX. El proyecto se distribuye como ejecutable nativo para el usuario final y como proyecto Maven para desarrollo.</p>
<hr/>
<p>Clona el repositorio en tu máquina local con el siguiente comando:</p>

```shell
# Clona el repositorio
git clone https://github.com/dnbsammie/space-simulator.git
cd space-simulator
```

<h3>🚀 Ejecutar el programa</h3>
<p>Para desarrollo (Maven):</p>

```bash
./mvnw javafx:run
```

<p>Como ejecutable (.exe):</p>

```bash
# Primero crea la imagen de runtime con JavaFX incluido
./mvnw clean javafx:jlink
# Prueba la imagen generada:
target/SpaceSimulator/bin/SpaceSimulator
# Luego empaqueta a ejecutable nativo:
jpackage `
  --type exe `
  --name SpaceSimulator `
  --runtime-image target/SpaceSimulator `
  --dest target/installer
# El ejecutable se generará en:
target/installer/SpaceSimulator.exe
```

<p>Para usuarios finales:</p>
<p>Solo necesitas descargar el archivo <code>SpaceSimulator.exe</code> y abrirlo, no necesitas instalar nada de lo mencionado anteriormente.</p>

<p>
  <strong>Nota:</strong> Si deseas contribuir a este proyecto, consulta la guía completa en 
  <a href="./CONTRIBUTING.md">CONTRIBUTING.md</a>. Allí encontrarás las instrucciones y plantillas 
  necesarias para Pull Requests e Issues. 
  <br><br>
  <strong>Importante:</strong> Toda contribución debe seguir las plantillas establecidas. 
  Los Pull Requests o Issues que no respeten estas pautas <em>no serán aceptados</em>.
</p>

<!-- LICENCIA -->
<h2 id="license">📜 Licencia</h2>
<p> Este proyecto está protegido bajo una licencia de <strong>Uso Educativo</strong>. El código se distribuye únicamente con fines de aprendizaje, práctica y consulta académica. </p>
<p> Queda <strong>estrictamente prohibido</strong> el uso en entornos de producción o con fines comerciales. La redistribución solo está permitida en contextos académicos o personales, siempre que se mantenga esta nota de licencia y la atribución correspondiente. </p>

<p>Consulta el archivo <a href="./LICENSE">LICENSE</a> para más detalles. </p>

---
<h2 id="footer">🙏 Gracias</h2>

<p align="center">
Este proyecto nació como la entrega de un trabajo final para nuestro bootcamp de programación. Lo que comenzó como un ejercicio académico se ha convertido en una base para seguir alimentando y mejorando con el tiempo, manteniendo siempre su propósito educativo y abierto a nuevas ideas y contribuciones.
</p>

<p>
Consulta también:
<ul>
  <li><a href="./LICENSE">📜 Licencia educativa</a></li>
  <li><a href="./CONTRIBUTING.md">🤝 Guía de contribución</a></li>
  <!-- <li><a href="./README.en.md">🌐 Versión en inglés</a></li> -->
</ul>
</p>

<h3>Autores</h3>
<p>
  <strong>Samuel Rivera</strong><br/>
  <strong>GitHub:</strong> <a href="https://github.com/dnbsammie">https://github.com/dnbsammie</a>
</p>
<p>
  <strong>Luis Triana</strong><br/>
  <strong>GitHub:</strong> <a href="https://github.com/luistriana032006">https://github.com/luistriana032006</a>
</p>

<hr/>