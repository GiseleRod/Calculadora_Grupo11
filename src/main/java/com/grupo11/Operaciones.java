package com.grupo11;

public class Operaciones {

    public static long sumar(long a, long b) {
        return Math.addExact(a, b);
    }

    public static long restar(long a, long b) {
        long mayor = Math.max(a, b);
        long menor = Math.min(a, b);
        return mayor - menor;
    }

    public static long multiplicar(long a, long b) {
        return Math.multiplyExact(a, b);
    }

    public static long dividir(long a, long b) {
        long mayor = Math.max(a, b);
        long menor = Math.min(a, b);

        if (mayor % menor == 0) {
            return mayor / menor;
        } else {
            return Math.round((float) mayor / menor);
        }
    }
}