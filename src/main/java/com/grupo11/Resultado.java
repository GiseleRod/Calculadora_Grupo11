package com.grupo11;

public class Resultado {
    private long resultado[];
    private int index;
    private int usos;

    public Resultado() {
        this.resultado = new long[3];
        this.index = 0;
        this.usos = 0;
    }

    public void agregarResultado(long resultado) {
        usos++;
        if (index == 3) {
            index = 0;
        }
        this.resultado[index] = resultado;
        index++;
    }

    public void mostrarResultado() {
        int ciclo = index;
        if (usos < 3) {
            System.out.println("No se hicieron suficientes operaciones para mostrar resultados guardados.");
        } else {
            for (int i = 0; i < resultado.length; i++) {
                if (ciclo == 3) {
                    ciclo = 0;
                }
                System.out.println(resultado[ciclo]);
                ciclo++;
            }
        }
    }
}
