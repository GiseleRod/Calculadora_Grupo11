package com.grupo11;

import java.util.Scanner;

public class Logica {
    private final Scanner scanner;
    Resultado resultado = new Resultado();

    public Logica() {
        scanner = new Scanner(System.in);
    }

    public int leerOpcionMenu() {

        int opcion = 0;
        boolean opcionValida = false;

        while (!opcionValida) {
            System.out.print("SELECCIONAR UNA OPCIÓN [0 a 5] Y PRESIONAR ENTER: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion >= 0 && opcion <= 5) {
                    opcionValida = true;
                } else {
                    System.out.println("ERROR: La opción debe estar entre 0 y 5.");
                }
            } else {
                System.out.println("ERROR: Debe ingresar un número.");
                scanner.nextLine();
            }
        }
        return opcion;
    }

    public void mostrarResultadosGuardados() {
        resultado.mostrarResultado();
    }
    private long leerEnteroPositivo(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            try {
                long numero = Long.parseLong(entrada);

                if (numero > 0) {
                    return numero;
                } else {
                    System.out.println("ERROR: Debe ingresar un número entero positivo mayor que 0.");
                }
            } catch (NumberFormatException e) { // Si la entrada no es un entero válido, mostrar error y volver a pedir.
                System.out.println("ERROR: Debe ingresar un valor numérico entero.");
            }
        }
    }

    private boolean deseaContinuar(String operacion) {
        while (true) {
            System.out.print("\n¿Desea efectuar una nueva " + operacion + "? (S/N): ");
            String respuesta = scanner.nextLine().trim().toUpperCase();

            if (respuesta.equals("S")) {
                return true;
            } else if (respuesta.equals("N")) {
                return false;
            } else {
                System.out.println("ERROR: Debe responder con S o N.");
            }
        }
    }

    public void cerrarScanner() {
        scanner.close();
    }
}