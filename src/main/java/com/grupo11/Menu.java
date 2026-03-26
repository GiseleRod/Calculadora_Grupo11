package com.grupo11;

public class Menu {

    private final Logica logica;

    public Menu() {
        logica = new Logica();
    }

    public void iniciar() {
        // Lucas:
        // Acá se desarrolla la lógica principal del menú.
        //
        // Tiene que:
        // 1. declarar una variable para guardar la opción elegida por el usuario
        // 2. mostrar el menú principal en pantalla
        // 3. pedir y leer la opción elegida
        // 4. usar un switch o una estructura similar para decidir qué hacer
        // 5. si el usuario elige 1, llamar a logica.sumar()
        // 6. si el usuario elige 2, llamar a logica.restar()
        // 7. si el usuario elige 3, llamar a logica.multiplicar()
        // 8. si el usuario elige 4, llamar a logica.dividir()
        // 9. si el usuario elige 0, mostrar un mensaje de salida
        // 10. repetir el menú hasta que el usuario elija salir
        // 11. antes de terminar el programa, cerrar el scanner llamando a logica.cerrarScanner()
        //
        // Importante:
        // - esto organiza la navegación del programa
        // - no tiene que hacer operaciones matemáticas
        // - no tiene que hacer validaciones de números de suma, resta, multiplicación o división
        // - solo controla el flujo del programa y deriva a la lógica correspondiente
    }

    private void mostrarMenu() {
        // Lucas:
        //
        // Se debería mostrar en pantalla el menú principal del sistema.
        // Tiene que imprimir claramente las opciones disponibles para el usuario.
        //
        // El menú debería mostrar algo como lo que mostraste:
        // *** CALCULADORA BASICA ***
        // [1] - SUMAR
        // [2] - RESTAR
        // [3] - MULTIPLICAR
        // [4] - DIVIDIR
        // [0] - SALIR DEL PROGRAMA
        //
        // Importante:
        // - solo muestra el menú
        // - no debe leer la opción
        // - no debe ejecutar operaciones
    }
}