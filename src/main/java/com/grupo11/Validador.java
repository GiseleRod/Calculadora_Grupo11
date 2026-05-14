package com.grupo11;

public class Validador {

    public static boolean esEntero(String input) {
        try {
            Long.parseLong(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean esPositivo(long numero) {
        return numero > 0;
    }

    public static boolean esOpcionValida(int opcion) {
        return opcion >= 0 && opcion <= 5;
    }

    public static boolean esSN(String input) {
        return input.equalsIgnoreCase("S") || input.equalsIgnoreCase("N");
    }
}