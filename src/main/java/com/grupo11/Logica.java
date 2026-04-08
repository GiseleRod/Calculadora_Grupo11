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

    public void sumar() {
        boolean continuar = true;
        while (continuar) {

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            try {
                long resultado = Math.addExact(num1, num2);
                System.out.println("El resultado de la suma es: " + resultado);
                this.resultado.agregarResultado(resultado);
            } catch (ArithmeticException e) {
                System.out.println("ERROR: El resultado de la suma supera el valor máximo permitido.");
            }

            continuar = deseaContinuar("suma");
        }
    }

    public void restar() {
        boolean continuar = true;

        while (continuar) {

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            long mayor;
            long menor;

            if (num1 > num2) {
                mayor = num1;
                menor = num2;
            } else {
                mayor = num2;
                menor = num1;
            }
            long resultado = mayor - menor;
            System.out.println("El resultado de la resta es: " + resultado);
            this.resultado.agregarResultado(resultado);
            continuar = deseaContinuar("restar");
        }
    }

    public void multiplicar() {
        boolean continuar = true;

        while (continuar) {

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            try {
                long resultado = Math.multiplyExact(num1, num2);
                System.out.println("El resultado de la multiplicación es: " + resultado);
                this.resultado.agregarResultado(resultado);
            } catch (ArithmeticException e) {
                System.out.println("ERROR: El resultado de la multiplicación supera el valor máximo permitido.");
            }

            continuar = deseaContinuar("multiplicación");
        }
    }

    public void dividir() {
        boolean continuar = true;
        while (continuar) {

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            // ORDENAR NÚMEROS
            long mayor;
            long menor;

            if (num1 > num2) {
                mayor = num1;
                menor = num2;
            } else {
                mayor = num2;
                menor = num1;
            }

            if (mayor % menor == 0) {
                System.out.println("El resultado de la división es: " + (mayor / menor));
            } else {
                double resultado = (double) mayor / menor;
                System.out.printf("El resultado de la división es: %.2f%n", resultado);
                this.resultado.agregarResultado(Math.round(resultado));
            }

            continuar = deseaContinuar("división");
        }
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
