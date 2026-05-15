package com.grupo11;
/**
*clase encargada de mostrar el menú principal y controlar la ejecución de la calculadora
*/ 
public class Menu {
    private final Logica logica;
/**
*constructor de la clase menu.
*inicializa la lógica principal de la calculadora.
*/

    public Menu() {
        logica = new Logica();
    }
/**
*inicia la ejecuación del programa.
*muestra el menú, solicita una opción al usuario y ejecuta la operación correspondiente hasta que el usuario decida salir.
*/
    public void iniciar() {
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = logica.leerOpcionMenu();

            switch (opcion) {
                    //ejecuta la operación suma
                case 1:
                    logica.sumar();
                    break;
                    //ejecuta la operación de resta
                case 2:
                    logica.restar();
                    break;
                    //ejecuta la operación multiplicación
                case 3:
                    logica.multiplicar();
                    break;
                    //ejecuta la operación división
                case 4:
                    logica.dividir();
                    break;
                    //muestra los resultados guardados
                case 5:
                    logica.mostrarResultadosGuardados();
                    break;
                    //finaliza la ejecución del programa
                case 0:
                    System.out.println("");
                    System.out.println("Saliendo del programa...");
                    break;
            }
            System.out.println();
        } while (opcion != 0);
        logica.cerrarScanner();
    }
/**
*muestra en pantalla las opciones disponibles de la calculadora.
*/
    private void mostrarMenu() {
        System.out.println("");
        System.out.println("*** CALCULADORA BÁSICA ***");
        System.out.println("");
        System.out.println("[1] - SUMAR");
        System.out.println("[2] - RESTAR");
        System.out.println("[3] - MULTIPLICAR");
        System.out.println("[4] - DIVIDIR");
        System.out.println("[5] - RESULTADOS GUARDADOS");
        System.out.println("[0] - SALIR DEL PROGRAMA");
        System.out.println("");
    }
}
