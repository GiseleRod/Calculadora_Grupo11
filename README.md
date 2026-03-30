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
- ingresar dos números enteros positivos
- validar que los datos ingresados sean numéricos
- validar que los valores ingresados sean enteros positivos
- realizar la operación correspondiente
- consultar al usuario si desea repetir la operación
- volver al menú principal o salir del programa

## Validaciones implementadas
El sistema incluye las siguientes validaciones:

- la opción del menú debe ser numérica
- la opción del menú debe estar comprendida entre 0 y 4
- los valores ingresados para operar deben ser numéricos
- los valores ingresados deben ser enteros positivos
- en las operaciones de resta y división, se utiliza primero el número mayor y luego el menor, según lo requerido en la especificación

## Estructura del proyecto
El proyecto está organizado en tres clases principales:

- `Main`: punto de entrada del programa
- `Menu`: muestra las opciones y controla la navegación general
- `Logica`: contiene las operaciones matemáticas y las validaciones

## Organización del trabajo
El equipo utilizó GitHub para organizar el desarrollo y centralizar el código fuente, y Trello para distribuir y hacer seguimiento de las tareas.

Distribución inicial de tareas:

- Lucas D'Amico: menú principal
- Faustina Enecoiz: suma
- Martín Romero: resta
- Diego Casas: multiplicación y división
- Victoria Pereyra: multiplicación y división
- Gisele Rodriguez: revisión general, integración final.

## Herramientas utilizadas
- Java
- IntelliJ IDEA / NetBeans / VS Code
- GitHub
- Trello

## Estado del proyecto
El proyecto se encuentra en etapa de revisión final.

Actualmente se están realizando:
- pruebas de funcionamiento
- correcciones menores de redacción y presentación
- ajustes de formato en mensajes mostrados por consola
- verificación final antes de la entrega