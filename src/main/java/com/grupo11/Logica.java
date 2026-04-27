package com.grupo11;

import java.util.ArrayList;

public class Logica {
    private final EntradaDatos entrada;
    ArrayList<Long> resultadosGuardados = new ArrayList<>();

    public Logica() {
        entrada = new EntradaDatos();
    }

    public void agregarResultadoGuardado(long resultado) {
        resultadosGuardados.add(resultado);
    }

    public void mostrarResultadosGuardados() {
        int total = resultadosGuardados.size();
        if (total < 3) {
            System.out.println("No se hicieron suficientes operaciones para mostrar resultados guardados.");
        } else {
            System.out.println("Resultados guardados:");
            for (int i = total - 3; i < total; i++) {
                System.out.println(resultadosGuardados.get(i));
            }
        }
    }

    public int leerOpcionMenu() {
        while (true) {
            String input = entrada.leerLinea("SELECCIONAR UNA OPCIÓN [0 a 5]: ");

            if (!Validador.esEntero(input)) {
                System.out.println("ERROR: Debe ingresar un número.");
                continue;
            }

            int opcion = Integer.parseInt(input);

            if (!Validador.esOpcionValida(opcion)) {
                System.out.println("ERROR: La opción debe estar entre 0 y 5.");
                continue;
            }

            return opcion;
        }
    }

    public void sumar() {
        boolean continuar = true;

        do {
            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            try {
                long resultado = Math.addExact(num1, num2);
                System.out.println("El resultado de la suma es: " + resultado);
                agregarResultadoGuardado(resultado);
            } catch (ArithmeticException e) {
                System.out.println("ERROR: El resultado de la suma supera el valor máximo permitido.");
            }

            continuar = deseaContinuar("suma");

        } while (continuar);
    }

    public void restar() {
        boolean continuar = true;

        do {
            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            long mayor = Math.max(num1, num2);
            long menor = Math.min(num1, num2);

            long resultado = mayor - menor;
            System.out.println("El resultado de la resta es: " + resultado);
            agregarResultadoGuardado(resultado);

            continuar = deseaContinuar("resta");

        } while (continuar);
    }

    public void multiplicar() {
        boolean continuar = true;

        do {
            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            try {
                long resultado = Math.multiplyExact(num1, num2);
                System.out.println("El resultado de la multiplicación es: " + resultado);
                agregarResultadoGuardado(resultado);
            } catch (ArithmeticException e) {
                System.out.println("ERROR: El resultado de la multiplicación supera el valor máximo permitido.");
            }

            continuar = deseaContinuar("multiplicación");

        } while (continuar);
    }

    public void dividir() {
        boolean continuar = true;

        do {
            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            long mayor = Math.max(num1, num2);
            long menor = Math.min(num1, num2);

            long resultado;

            if (mayor % menor == 0) {
                resultado = mayor / menor;
            } else {
                resultado = Math.round((double) mayor / menor);
            }

            System.out.println("El resultado de la división es: " + resultado);
            agregarResultadoGuardado(resultado);

            continuar = deseaContinuar("división");

        } while (continuar);
    }

    private long leerEnteroPositivo(String mensaje) {
        while (true) {
            String input = entrada.leerLinea(mensaje);

            if (!Validador.esEntero(input)) {
                System.out.println("ERROR: Debe ingresar un valor numérico entero.");
                continue;
            }

            long numero = Long.parseLong(input);

            if (!Validador.esPositivo(numero)) {
                System.out.println("ERROR: Debe ser mayor que 0.");
                continue;
            }

            return numero;
        }
    }

    private boolean deseaContinuar(String operacion) {
        while (true) {
            String input = entrada
                    .leerLinea("\n¿Desea efectuar una nueva " + operacion + "? (S/N): ")
                    .trim()
                    .toUpperCase();

            if (!Validador.esSN(input)) {
                System.out.println("ERROR: Debe responder con S o N.");
                continue;
            }

            return input.equals("S");
        }
    }

    public void cerrarScanner() {
        entrada.cerrar();
    }
}
