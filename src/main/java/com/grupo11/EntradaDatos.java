package com.grupo11;

import java.util.Scanner;

/**
 * Clase encargada de recibir los datos ingresados por el usuario.
 * 
 * Permite leer la información desde consola mediante un objeto Scanner
 * y devolver los valores ingresados para ser procesados y validados
 * por el sistema.
 */

public class EntradaDatos {
    private Scanner scanner;

    /**
     * Constructor de la clase EntradaDatos.
     * 
     * Inicializa el objeto Scanner utilizado para capturar
     * datos ingresados por consola.
     */

    public EntradaDatos() {
        scanner = new Scanner(System.in);
    }

    /**
     * Solicita al usuario el ingreso de un dato por consola
     * y devuelve el texto ingresado.
     * 
     * @param mensaje mensaje que se muestra al usuario.
     * @return texto ingresado por el usuario.
     */

    public String leerLinea(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    /**
     * Cierra el objeto Scanner utilizado para la entrada de datos.
     */

    public void cerrar() {
        scanner.close();
    }
}