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

    public void sumar() {
        boolean continuar = true;
        while (continuar) {

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            try {
                long resultado = Math.addExact(num1, num2);
                System.out.println("El resultado de la suma es: " + resultado);
                this.resultado.agregarResultado(resultado);
            } catch (ArithmeticException e) {
                System.out.println("ERROR: El resultado de la suma supera el valor máximo permitido.");
            }

            continuar = deseaContinuar("suma");
        }
    }

    public void restar() {
        boolean continuar = true;

        while (continuar) {

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            long mayor;
            long menor;

            if (num1 > num2) {
                mayor = num1;
                menor = num2;
            } else {
                mayor = num2;
                menor = num1;
            }
            long resultado = mayor - menor;
            System.out.println("El resultado de la resta es: " + resultado);
            this.resultado.agregarResultado(resultado);
            continuar = deseaContinuar("restar");
        }
    }

    public void multiplicar() {
        boolean continuar = true;

        while (continuar) {

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            try {
                long resultado = Math.multiplyExact(num1, num2);
                System.out.println("El resultado de la multiplicación es: " + resultado);
                this.resultado.agregarResultado(resultado);
            } catch (ArithmeticException e) {
                System.out.println("ERROR: El resultado de la multiplicación supera el valor máximo permitido.");
            }

            continuar = deseaContinuar("multiplicación");
        }
    }

    public void dividir() {
        boolean continuar = true;
        while (continuar) {

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            // ORDENAR NÚMEROS
            long mayor;
            long menor;

            if (num1 > num2) {
                mayor = num1;
                menor = num2;
            } else {
                mayor = num2;
                menor = num1;
            }

            if (mayor % menor == 0) {
                System.out.println("El resultado de la división es: " + (mayor / menor));
            } else {
                long resultado = Math.round((float) mayor / menor);
                System.out.println("El resultado de la división es:" + resultado);
                this.resultado.agregarResultado(resultado);
            }

            continuar = deseaContinuar("división");
        }
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
