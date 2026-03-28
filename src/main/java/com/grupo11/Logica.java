package com.grupo11;

import java.util.Scanner;

public class Logica {
    private final Scanner scanner;
    public Logica() {
        scanner = new Scanner(System.in);
    }
    public int leerOpcionMenu() {

        int opcion = 0;
        boolean opcionValida = false;

        while (!opcionValida) {
            System.out.println("SELECCIONAR UNA OPCIÓN [0 a 4] Y PRESIONAR ENTER:");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion >= 0 && opcion <= 4) {
                    opcionValida = true;
                } else {
                    System.out.println("ERROR: LA OPCION DEBE SER ENTRE 0 Y 4");
                }
            } else {
                System.out.println("ERROR: SE DEBE INGRESAR UN NUMERO");
                scanner.nextLine();
            }
        }
        return opcion;
    }

    public void sumar() {
        // Faustina: suma
    }

    public void restar() {
        // Martín: resta
    }

    public void multiplicar() {
         boolean continuar = true;

        while (continuar) {

            int num1 = leerEnteroPositivo("Ingrese el primer número:");
            int num2 = leerEnteroPositivo("Ingrese el segundo número:");

            int resultado = num1 * num2;

            System.out.println("El resultado de la multiplicación es: " + resultado);

            continuar = deseaContinuar("multiplicación");
        }
    }
    

    public void dividir() {
       boolean continuar = true;
        while (continuar) {

        int num1 = leerEnteroPositivo("Ingrese el primer número:");
        int num2;

        do {
            num2 = leerEnteroPositivo("Ingrese el segundo número (distinto de 0):");

            if (num2 == 0) {
                System.out.println("ERROR: No se puede dividir por cero.");
            }

        } while (num2 == 0);

        //ORDENAR NÚMEROS
        int mayor;
        int menor;

        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        double resultado = (double) mayor / menor;

        System.out.println("El resultado de la división es: " + resultado);

        continuar = deseaContinuar("división");
    }
}


    private int leerEnteroPositivo(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            try {
                int numero = Integer.parseInt(entrada);

                if (numero > 0) {
                    return numero;
                } else {
                    System.out.println("Error: debe ingresar un numero entero positivo mayor que 0.");
                }

            } catch (NumberFormatException e) { // Si la entrada no es un entero válido, mostrar error y volver a pedir.
                System.out.println("Error: debe ingresar un valor numérico entero.");
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
                System.out.println("Error: debe responder con S o N.");
            }
        }
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
