package com.grupo11;

import java.util.Scanner;

public class EntradaDatos {
    private Scanner scanner;

    public EntradaDatos() {
        scanner = new Scanner(System.in);
    }

    public String leerLinea(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void cerrar() {
        scanner.close();
    }
}