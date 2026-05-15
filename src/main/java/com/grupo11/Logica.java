package com.grupo11;

/**
 * Clase encargada de gestionar la lógica principal de la calculadora.
 * Coordina la entrada de datos, las operaciones matemáticas y
 * el almacenamiento de resultados.
 */
public class Logica {
    private final EntradaDatos entrada;
    private final Operaciones operaciones;
    private final Resultado resultado;

    /**
     * Inicializa los componentes necesarios para la ejecución de la lógica
     * de la calculadora
     */
    public Logica() {
        entrada = new EntradaDatos();
        operaciones = new Operaciones();
        resultado = new Resultado();
    }

    /**
     * Solicita al usuario una opción del menú y valida que sea un número entero
     * dentro del rango permitido (0 a 5).
     *
     * @return la opción válida ingresada por el usuario.
     */
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

    /**
     * Muestra todos los resultados almacenados previamente.
     */
    public void mostrarResultadosGuardados() {
        resultado.mostrarResultado();
    }

    /**
     * Realiza operaciones de suma solicitando dos números positivos al usuario.
     * El resultado obtenido se muestra en pantalla y se almacena en el historial.
     * Si ocurre un desbordamiento numérico, se informa mediante un mensaje de error.
     */
    public void sumar() {
        boolean continuar = true;

        do{

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            try {
                long resultadoOperacion = operaciones.sumar(num1, num2);
                mostrarYGuardarResultado("suma", resultadoOperacion);
            } catch (ArithmeticException e) {
                System.out.println("ERROR: El resultado de la suma supera el valor máximo permitido.");
            }

            continuar = deseaContinuar("suma");

         }while(continuar);
    }

    /**
     * Realiza operaciones de resta solicitando dos números positivos al usuario.
     * El resultado obtenido se muestra en pantalla y se almacena en el historial.
     */
    public void restar() {
        boolean continuar = true;

        do{

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            long resultadoOperacion = operaciones.restar(num1, num2);
            mostrarYGuardarResultado("resta", resultadoOperacion);

            continuar = deseaContinuar("resta");

        } while (continuar);
    }
    
    /**
     * Realiza operaciones de multiplicación solicitando dos números positivos al usuario.
     * El resultado obtenido se muestra en pantalla y se almacena en el historial.
     * @throws ArithmeticException en caso de overflow
     * @see leerEnteroPositivo Ingreso de los numeros a operar
     * @see mostrarYGuardarResultado Funcion para mostrar y guardar el resultado obtenido
     * @see deseaContinuar Funcion para saber si se repite la operacion
     * @see operaciones Clase para realizar los calculos
     */
    public void multiplicar() {
        boolean continuar = true;

        do{

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            try {
                long resultadoOperacion = operaciones.multiplicar(num1, num2);
                mostrarYGuardarResultado("multiplicación", resultadoOperacion);
            } catch (ArithmeticException e) {
                System.out.println("ERROR: El resultado de la multiplicación supera el valor máximo permitido.");
            }

            continuar = deseaContinuar("multiplicación");

        }while (continuar);
    }
    /**
     * Realiza operaciones de division solicitando dos números positivos al usuario.
     * El resultado obtenido se muestra en pantalla y se almacena en el historial.
     * en caso de dividir por 0 marca error en pantalla.
     * @see leerEnteroPositivo Ingreso de los numeros a operar
     * @see mostrarYGuardarResultado Funcion para mostrar y guardar el resultado obtenido
     * @see deseaContinuar Funcion para saber si se repite la operacion
     * @see operaciones Clase para realizar los calculos
     */
    public void dividir() {
        boolean continuar = true;

        do{

            long num1 = leerEnteroPositivo("Ingrese el primer número: ");
            long num2 = leerEnteroPositivo("Ingrese el segundo número: ");

            long resultadoOperacion = operaciones.dividir(num1, num2);
            mostrarYGuardarResultado("división", resultadoOperacion);

            continuar = deseaContinuar("división");

        } while (continuar);
    }
    /**
     * Muestra el resultado de la operacion recien realizada y guarda su resultado para posterior uso.
     * @param operacion demarca la operacion realizada (suma, resta, multiplicación, division)
     * @param resultadoOperacion valor del resultado de la operacion
     * @see Resultado Clase usada para manejar los resultados
     */
    private void mostrarYGuardarResultado(String operacion, long resultadoOperacion) {
        System.out.println("El resultado de la " + operacion + " es: " + resultadoOperacion);
        resultado.agregarResultado(resultadoOperacion);
    }
    /**
     * Funcion encargada de leer la entrada del usuario y transformarla en un entero positivo.
     * En caso que la entrada no sea un entero positivo marca error y pide reingresar el numero.
     * @param mensaje mensaje que se muestra al pedir el numero
     * @return Numero entero positivo ingresado por el usuario
     * @see Validador Clase usada para validar datos ingresados
     */
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
    /**
     * Funcion encargada de preguntar al usuario si quiere repetir la operacion realizada.
     * En caso de una respuesta positiva repite la operacion.
     * En caso de una respuesta negativa devuelve al usuario al menu principal.
     * @param operacion operacion que pregunta si quiere repetir el calculo realizado
     * @return True o false dependiendo de la entrada del usuario
     */
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
    /**
     * Cierre de Scanner
     */
    public void cerrarScanner() {
        entrada.cerrar();
    }
}