# 🚀 GestorProyectosIA

**GestorProyectosIA** es una plataforma inteligente de gestión de proyectos potenciada por **Java con Maven**, diseñada para optimizar flujos de trabajo, predecir retrasos y mejorar la productividad mediante patrones de diseño.

---

[![GitHub](https://img.shields.io/badge/GitHub-000?logo=github&logoColor=white)](https://github.com/dxn1l/GestorProyectosIA)


---

## 📌 Características Principales
- 🏗 **Arquitectura Modular** basada en patrones de diseño (**Factory Method, Facade y Observer**).
- 🔍 **Sistema de notificaciones** para usuarios con eventos en tareas.
- 🤖 **Asistente de IA** para análisis de productividad (implementación futura).
- ✅ **Pruebas unitarias** con JUnit 5.

---

## 🛠️ Tecnologías Usadas
- **Lenguaje:** Java 17
- **Gestión de dependencias:** Maven
- **Framework de pruebas:** JUnit 5
- **IDE recomendado:** IntelliJ IDEA
- **Control de versiones:** Git/GitHub

---

## 📂 Estructura del Proyecto
```
GestorProyectosIA
│── Docs                 # Documentación y diagramas UML
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── org.gestorproyectos
│   │   │   │   ├── facade       # Implementación del patrón Facade
│   │   │   │   ├── factory      # Implementación del patrón Factory Method
│   │   │   │   ├── observer     # Implementación del patrón Observer
│   │   │   │   ├── Main.java    # Punto de entrada del sistema
│   ├── test                    # Pruebas unitarias
│   │   ├── java
│   │   │   ├── org.gestorproyectos
│   │   │   │   ├── facade       # Pruebas para Facade
│   │   │   │   ├── factory      # Pruebas para Factory Method
│   │   │   │   ├── observer     # Pruebas para Observer
│── pom.xml              # Configuración de Maven
│── README.md            # Documentación del proyecto
```

---

## 🏗️ Patrones de Diseño Implementados
### 1️⃣ **Factory Method** 🏭
- Implementado en `factory/TareaFactory.java`.
- Permite la creación flexible de diferentes tipos de tareas (`TareaSimple`, `TareaCompleja`).

### 2️⃣ **Facade** 🎭
- Implementado en `facade/ProyectoFacade.java`.
- Simplifica la interacción con los servicios de usuario y gestión de proyectos.

### 3️⃣ **Observer** 🔔
- Implementado en `observer/TareaObserver.java`.
- Permite notificar a los usuarios cuando una tarea cambia de estado.

---

## 🧪 Pruebas Unitarias
Las pruebas se encuentran en `src/test/java/org/gestorproyectos/` y validan el correcto funcionamiento de los patrones de diseño.

### 📌 Ejecución de las pruebas
Ejecuta los tests con Maven:
```sh
mvn test
```

Resultados esperados:
```
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

---

## 🚀 Instalación y Uso
### 🔹 **Clonar el Repositorio**
```sh
git clone https://github.com/dxn1l/GestorProyectosIA
cd GestorProyectosIA
idea GestorProyectosIA
```

### 🔹 **Compilar y Ejecutar**
```sh
mvn clean install
mvn exec:java -Dexec.mainClass="org.gestorproyectos.Main"
```