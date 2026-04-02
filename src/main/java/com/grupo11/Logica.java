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
            System.out.print("SELECCIONAR UNA OPCIÓN [0 a 4] Y PRESIONAR ENTER: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion >= 0 && opcion <= 4) {
                    opcionValida = true;
                } else {
                    System.out.println("ERROR: La opción debe estar entre 0 y 4.");
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
            
            int num1 = leerEnteroPositivo("Ingrese el primer número: ");
            int num2 = leerEnteroPositivo("Ingrese el segundo número: ");
        
            int resultado = num1 + num2;
        
            System.out.println("El resultado de la suma es: " + resultado);
            continuar = deseaContinuar("sumar");
        }
    }

    public void restar() {
        boolean continuar = true;

        while (continuar) {

            int num1 = leerEnteroPositivo("Ingrese el primer número: ");
            int num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            int mayor;
            int menor;

            if (num1 > num2) {
                mayor = num1;
                menor = num2;
            } else {
                mayor = num2;
                menor = num1;
            }
            int resultado = mayor - menor;
            System.out.println("El resultado de la resta es: " + resultado);
            continuar = deseaContinuar("restar");
        }
    }

    public void multiplicar() {
         boolean continuar = true;

        while (continuar) {

            int num1 = leerEnteroPositivo("Ingrese el primer número: ");
            int num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            int resultado = num1 * num2;

            System.out.println("El resultado de la multiplicación es: " + resultado);

            continuar = deseaContinuar("multiplicación");
        }
    }
    

    public void dividir() {
       boolean continuar = true;
        while (continuar) {

        int num1 = leerEnteroPositivo("Ingrese el primer número: ");
        int num2 = leerEnteroPositivo("Ingrese el segundo número: ");

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

        if (mayor % menor == 0) {
            System.out.println("El resultado de la división es: " + (mayor / menor));
        } else {
            double resultado = (double) mayor / menor;
            System.out.printf("El resultado de la división es: %.2f%n", resultado);
        }

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
