package com.grupo11;

import java.util.Scanner;

public class Logica {

    private final Scanner scanner;

    public Logica() {
        scanner = new Scanner(System.in);
    }

    public int leerOpcionMenu() {
        // Lucas:
        // Acá habría que:
        // 1. pedir al usuario que ingrese una opción del menú
        // 2. leer lo que escribe
        // 3. validar que el dato ingresado sea numérico
        // 4. validar que la opción esté entre 0 y 4
        // 5. si hay error, volver a pedir la opción
        // 6. devolver la opción válida
        return 0;
    }

    public void sumar() {
        // Faustina: suma
    }

    public void restar() {
        // Martín: resta
    }

    public void multiplicar() {
        // Diego y Victoria: multiplicación
    }

    public void dividir() {
        // Diego y Victoria: división
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
