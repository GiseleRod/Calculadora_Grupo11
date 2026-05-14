# Calculadora - Grupo 11

Trabajo práctico de la materia Ingeniería de Software I.

## Integrantes

- Casas, Diego
- D'Amico, Lucas Oscar
- Enecoiz, Faustina
- Pereyra, Victoria
- Rodriguez, Gisele
- Romero, Martín

## Actividad 6 - Herramientas CASE y documentación técnica

### Descripción

En esta actividad se trabajó sobre el uso de herramientas CASE (Computer Aided Software Engineering), enfocadas en la generación y organización de documentación técnica del sistema.

La herramienta utilizada fue JavaDoc, integrada al ecosistema Java, que permite generar documentación automática en formato HTML a partir del código fuente y comentarios estructurados.

El objetivo principal fue documentar las distintas clases y métodos de la calculadora desarrollada en actividades anteriores, mejorando la comprensión, mantenibilidad y organización del proyecto.

## Funcionalidades documentadas

La documentación técnica generada incluye:

- descripción de clases
- descripción de métodos
- parámetros utilizados
- organización del sistema
- navegación automática entre componentes
- estructura general del proyecto

## Estructura del proyecto

El sistema se encuentra organizado en las siguientes clases:

- `Main`: punto de entrada del programa.
- `Menu`: muestra las opciones y controla la navegación general.
- `Logica`: coordina el flujo de las operaciones.
- `Operaciones`: contiene los cálculos matemáticos.
- `EntradaDatos`: gestiona la lectura de datos ingresados por el usuario.
- `Validador`: contiene validaciones reutilizables.
- `Resultado`: administra el almacenamiento y visualización de resultados guardados.

## Herramienta CASE utilizada

### JavaDoc

JavaDoc es una herramienta incluida en el JDK de Java que permite generar documentación técnica automática a partir del código fuente.

La documentación se genera mediante comentarios estructurados utilizando el formato:

```java
/**
 * Comentario JavaDoc
 */
```

A partir de estos comentarios, JavaDoc genera páginas HTML navegables con información sobre clases, métodos y parámetros.

## Organización del trabajo

### Logica (parte 1)

Estado: sin asignar

Métodos:

- `leerOpcionMenu()`
- `mostrarResultadosGuardados()`
- `sumar()`
- `restar()`

### Logica (parte 2)

Responsable: Diego Casas

Métodos:

- `multiplicar()`
- `dividir()`
- `mostrarYGuardarResultado()`
- `leerEnteroPositivo()`
- `deseaContinuar()`
- `cerrarScanner()`

### Main + Menu

Estado: sin asignar

### Operaciones

Responsable: Faustina Enecoiz

### Resultado

Responsable: Gisele Rodriguez

### Validador + EntradaDatos

Responsable: Martín Romero

## Herramientas utilizadas

- Java
- JavaDoc
- IntelliJ IDEA
- GitHub
- Trello
- Google Docs

## Estado del proyecto

El proyecto se encuentra en desarrollo para la entrega de la Actividad 6.

Actualmente se dispone de:

- estructura del proyecto organizada
- distribución parcial de tareas
- documentación JavaDoc en desarrollo
- herramienta CASE definida