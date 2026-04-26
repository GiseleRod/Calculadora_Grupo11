package com.grupo11;

public class Logica {
    private final EntradaDatos entrada;
    Resultado resultado = new Resultado();

    public Logica() {
        entrada = new EntradaDatos();
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

    public void mostrarResultadosGuardados() {
        resultado.mostrarResultado();
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