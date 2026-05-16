package com.grupo11;

public class Operaciones {
    /**
    * Funcion que realiza la suma de dos numeros, recibe dos numeros enteros como parametros 
    * @return el resultado de la suma.
     */
    public long sumar(long a, long b) {
        return Math.addExact(a, b);
    }
    /**
     * Funcion que realiza la resta de dos numeros, recibe dos numeros enteros como parametros
     * @return el resultado de la resta.
     */
    public long restar(long a, long b) {
        /**
        * Para evitar resultados negativos, se determina cual de los dos numeros es mayor y cual es el menor.
        * Se realiza la resta en ese orden.
         */
        long mayor = Math.max(a, b);
        long menor = Math.min(a, b);
        return mayor - menor;
    }
    /**
    * Funcion que realiza la multiplicacion de dos numeros, recibe dos numeros enteros como parametros 
    * @return el resultado de la multiplicacion.
     */
    public long multiplicar(long a, long b) {
        return Math.multiplyExact(a, b);
    }
    /**
     *Funcion que realiza la division de dos numeros, recibe dos numeros enteros como parametros 
     * @return el resultado de la division.
     */
    public long dividir(long a, long b) {
        /**
        *se utilizo Math.max y Math.min para ordenar los numeros y evitar resultados menores a 1
         */
        long mayor = Math.max(a, b);
        long menor = Math.min(a, b);
        /**
        *se utiliza el operador modulo para determinar si la division es exacta o no, en caso de no serlo se redondea el resultado utilizando Math.round.
         */
        if (mayor % menor == 0) {
            return mayor / menor;
        } else {
            return Math.round((double) mayor / menor);
        }
    }
}