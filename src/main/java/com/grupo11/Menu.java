package com.grupo11;

public class Menu {
    private final Logica logica;
    public Menu() {
        logica = new Logica();
    }

    public void iniciar() {
        int opcion=0;
        do {
            mostrarMenu();
            opcion = logica.leerOpcionMenu();

            switch (opcion) {
                case 1:
                    logica.sumar();
                    break;
                case 2:
                    logica.restar();
                    break;
                case 3:
                    logica.multiplicar();
                    break;
                case 4:
                    logica.dividir();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
            }
            System.out.println();
        } while (opcion != 0);
        logica.cerrarScanner();
    }

    private void mostrarMenu() {
        System.out.println("");
        System.out.println("*** CALCULADORA BASICA ***");
        System.out.println("");
        System.out.println("[1] - SUMAR");
        System.out.println("[2] - RESTAR");
        System.out.println("[3] - MULTIPLICAR");
        System.out.println("[4] - DIVIDIR");
        System.out.println("[0] - SALIR DEL PROGRAMA");
        System.out.println("");
    }
}