package com.grupo11;

public class Logica {
    private final EntradaDatos entrada;
    private final Operaciones operaciones;
    private final Resultado resultado;

    public Logica() {
        entrada = new EntradaDatos();
        operaciones = new Operaciones();
        resultado = new Resultado();
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

    public void sumar() {
        boolean continuar = true;

        do {
            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            try {
                long resultadoOperacion = operaciones.sumar(num1, num2);
                mostrarYGuardarResultado("suma", resultadoOperacion);
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

            long resultadoOperacion = operaciones.restar(num1, num2);
            mostrarYGuardarResultado("resta", resultadoOperacion);

            continuar = deseaContinuar("resta");

        } while (continuar);
    }

    public void multiplicar() {
        boolean continuar = true;

        do {
            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            try {
                long resultadoOperacion = operaciones.multiplicar(num1, num2);
                mostrarYGuardarResultado("multiplicación", resultadoOperacion);
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

            long resultadoOperacion = operaciones.dividir(num1, num2);
            mostrarYGuardarResultado("división", resultadoOperacion);

            continuar = deseaContinuar("división");

        } while (continuar);
    }

    private void mostrarYGuardarResultado(String operacion, long resultadoOperacion) {
        System.out.println("El resultado de la " + operacion + " es: " + resultadoOperacion);
        resultado.agregarResultado(resultadoOperacion);
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