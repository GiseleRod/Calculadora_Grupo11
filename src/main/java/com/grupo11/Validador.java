package com.grupo11;

/**
 * Clase encargada de validar los datos ingresados por el usuario.
 * 
 * Contiene métodos que verifican si los valores cumplen
 * determinadas condiciones antes de ser utilizados
 * en las operaciones de la calculadora.
 */
public class Validador {

    /**
     * Verifica si el texto ingresado puede convertirse
     * en un entero de tipo long.
     * 
     * @param input texto ingresado por el usuario.
     * @return true si el valor es un número válido, false en caso contrario.
     */

    public static boolean esEntero(String input) {
        try {
            Long.parseLong(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Verifica si un número es positivo.
     * 
     * @param numero número a evaluar.
     * @return true si el número es mayor a cero, false en caso contrario.
     */
    public static boolean esPositivo(long numero) {
        return numero > 0;
    }

    /**
     * Verifica si la opción seleccionada por el usuario
     * corresponde a una opción válida del menú.
     * 
     * @param opcion opción ingresada por el usuario.
     * @return true si la opción es valida, false en caso contrario.
     */

    public static boolean esOpcionValida(int opcion) {
        return opcion >= 0 && opcion <= 5;
    }

    /**
     * Verfica si la respuesta ingresada corresponde
     * a las opciones "S" o "N".
     * 
     * @param input texto ingresado por el usario.
     * @return true si el valor es "S" o "N", false en caso contrario.
     */

    public static boolean esSN(String input) {
        return input.equalsIgnoreCase("S") || input.equalsIgnoreCase("N");
    }
}