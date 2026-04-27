# Calculadora - Grupo 11

Trabajo práctico de la materia Ingeniería de Software I.

## Integrantes
- Casas, Diego
- D'Amico, Lucas Oscar
- Enecoiz, Faustina
- Pereyra, Victoria
- Rodriguez, Gisele
- Romero, Martín

## Descripción
Este proyecto consiste en el desarrollo de una calculadora básica por consola, realizada como trabajo práctico grupal para la materia Ingeniería de Software I.

El sistema permite realizar las cuatro operaciones básicas de matemática:

- suma
- resta
- multiplicación
- división

Además, contempla las validaciones y restricciones solicitadas en la consigna, e incorpora la funcionalidad de almacenamiento y visualización de los últimos resultados.

## Actividad 4 - Reestructuración de código

En la Actividad 4 se trabajó sobre un proceso de reingeniería de software, específicamente mediante una reestructuración de código.

El objetivo principal fue mejorar la organización interna del programa, reduciendo la concentración de responsabilidades en la clase `Logica` y haciendo el código más legible y mantenible, sin modificar el comportamiento general de la calculadora.

## Funcionalidades incluidas

La calculadora permite:

- mostrar un menú principal de opciones
- seleccionar una operación matemática
- ingresar dos números enteros positivos de tipo `long`
- validar que los datos ingresados sean numéricos
- validar que los valores ingresados sean enteros positivos
- realizar la operación correspondiente
- consultar al usuario si desea repetir la operación
- volver al menú principal o salir del programa
- guardar automáticamente los últimos resultados obtenidos
- visualizar los resultados guardados desde el menú principal

## Validaciones implementadas

El sistema incluye las siguientes validaciones:

- la opción del menú debe ser numérica
- la opción del menú debe estar comprendida entre 0 y 5
- los valores ingresados para operar deben ser numéricos
- los valores ingresados deben ser enteros positivos
- en las operaciones de resta y división, se utiliza primero el número mayor y luego el menor
- en suma, se valida que el resultado no supere el valor máximo permitido por el tipo `long`
- en multiplicación, se valida que el resultado no supere el valor máximo permitido por el tipo `long`
- en división, cuando el resultado no es exacto, se redondea mediante `Math.round`

## Estructura del proyecto

El proyecto quedó organizado en las siguientes clases principales:

- `Main`: punto de entrada del programa.
- `Menu`: muestra las opciones y controla la navegación general.
- `Logica`: coordina el flujo general de las operaciones.
- `Operaciones`: contiene los cálculos matemáticos.
- `EntradaDatos`: gestiona la lectura de datos ingresados por el usuario.
- `Validador`: contiene validaciones reutilizables.
- `Resultado`: administra el almacenamiento y visualización de resultados guardados.

## Cambios realizados en la reestructuración

Durante la Actividad 4 se realizaron los siguientes cambios:

- Separación de los cálculos matemáticos de la clase `Logica`.
- Uso de `Math.max` y `Math.min` en resta y división para simplificar comparaciones.
- Separación del ingreso de datos y validaciones.
- Separación del almacenamiento y visualización de resultados.
- Reorganización del manejo de resultados mediante un `ArrayList` limitado a los últimos 3 resultados.
- Unificación de ciclos de repetición en las operaciones.
- Revisión del uso de bloques `try/catch`, dejándolos donde realmente son necesarios.
- Integración manual de ramas y resolución de conflictos en el código fuente.

## Organización del trabajo - Actividad 4

Distribución de tareas:

- Victoria Pereyra: separación de los cálculos de la clase `Logica` en una clase aparte.
- Gisele Rodriguez: uso de `Math.max` y `Math.min` en resta y división; apoyo en integración final.
- Martín Romero: separación del ingreso de datos y validaciones.
- Diego Casas: separación de resultados guardados, reestructuración del `ArrayList` y armado del video.
- Lucas D'Amico: revisión y unificación de los ciclos de repetición.
- Faustina Enecoiz: revisión de bloques `try/catch` e integración final junto con Gisele.
- Faustina Enecoiz y Gisele Rodriguez: merge final e integración de ramas.

## Herramientas utilizadas

- Java
- IntelliJ IDEA / NetBeans / VS Code
- GitHub
- Trello
- Google Docs

## Versión

Versión actual: 2.0

## Estado del proyecto

El proyecto se encuentra finalizado para la entrega de la Actividad 4.

Actualmente se dispone de:

- código fuente reestructurado
- validaciones implementadas
- almacenamiento de resultados
- integración final de ramas
- video explicativo de la reestructuración