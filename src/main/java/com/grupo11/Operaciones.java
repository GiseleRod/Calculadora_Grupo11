package com.grupo11;

public class Operaciones {

    public long sumar(long a, long b) {
        return Math.addExact(a, b);
    }

    public long restar(long a, long b) {
        long mayor = Math.max(a, b);
        long menor = Math.min(a, b);
        return mayor - menor;
    }

    public long multiplicar(long a, long b) {
        return Math.multiplyExact(a, b);
    }

    public long dividir(long a, long b) {
        long mayor = Math.max(a, b);
        long menor = Math.min(a, b);

        if (mayor % menor == 0) {
            return mayor / menor;
        } else {
            return Math.round((double) mayor / menor);
        }
    }
}