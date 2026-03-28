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
        // Gisele:
        // Acá se debe:
        // 1. mostrar el mensaje que se recibe por parámetro
        // 2. leer lo que ingresa el usuario
        // 3. validar que el valor ingresado sea numérico
        // 4. validar que sea un número entero positivo mayor que 0
        // 5. volver a pedir el dato si hay error
        // 6. devolver el número cuando sea válido
        return 0;
    }

    private boolean deseaContinuar(String operacion) {
        // Gisele:
        // Acá se debe:
        // 1. preguntar al usuario si desea repetir la operación realizada
        // 2. mostrar el nombre de la operación recibido por parámetro
        // 3. aceptar únicamente las respuestas S o N
        // 4. volver a pedir la respuesta si el ingreso es inválido
        // 5. devolver true si responde S
        // 6. devolver false si responde N
        return false;
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
