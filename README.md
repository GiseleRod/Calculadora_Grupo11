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

Además, contempla las validaciones y restricciones solicitadas en la consigna.

## Objetivo
Desarrollar una solución funcional aplicando un proceso de trabajo organizado, contemplando relevamiento de requerimientos, diseño, implementación, validación y presentación final del sistema.

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

## Alcance y funcionalidades no incluidas
El sistema fue desarrollado de acuerdo con los requerimientos relevados para esta primera versión. En consecuencia, no contempla:

- ingreso de números decimales
- ingreso de números negativos
- ingreso del valor 0 como operando
- operaciones encadenadas
- cálculo de porcentajes
- interfaz gráfica
- almacenamiento de historial de operaciones
- persistencia de datos
- resultados que excedan la capacidad máxima del tipo long

## Validaciones implementadas
El sistema incluye las siguientes validaciones:

- la opción del menú debe ser numérica
- la opción del menú debe estar comprendida entre 0 y 4
- los valores ingresados para operar deben ser numéricos
- los valores ingresados deben ser enteros positivos
- en las operaciones de resta y división, se utiliza primero el número mayor y luego el menor, según lo requerido en la especificación
- en suma, se valida que el resultado no supere el valor máximo permitido por el tipo long
- en multiplicación, se valida que el resultado no supere el valor máximo permitido por el tipo long

## Estructura del proyecto
El proyecto está organizado en tres clases principales:

- `Main`: punto de entrada del programa
- `Menu`: muestra las opciones y controla la navegación general
- `Logica`: contiene las operaciones matemáticas y las validaciones

## Organización del trabajo
El equipo utilizó GitHub para organizar el desarrollo y centralizar el código fuente, Trello para distribuir y hacer seguimiento de las tareas, y Google Docs para la elaboración colaborativa de la documentación.

Distribución de tareas:

- Lucas D'Amico: menú principal
- Faustina Enecoiz: suma
- Martín Romero: resta
- Diego Casas: pruebas de funcionamiento, organización y presentación de la demo
- Victoria Pereyra: multiplicación, división y coordinación general del trabajo
- Gisele Rodríguez: revisión general e integración final

La documentación del trabajo fue elaborada de manera colaborativa entre los integrantes del grupo.

## Herramientas utilizadas
- Java
- IntelliJ IDEA / NetBeans / VS Code
- GitHub
- Trello
- Google Docs

## Versión
Versión actual: 1.0

## Estado del proyecto
El proyecto se encuentra finalizado.

Actualmente se dispone de:
- código fuente completo
- archivo ejecutable `.jar`
- validaciones implementadas según la consigna
- pruebas manuales de las operaciones y validaciones principales
- documentación de entrega completa, incluyendo README y manual de uso