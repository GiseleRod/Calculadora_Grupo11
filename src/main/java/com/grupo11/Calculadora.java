package com.grupo11;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       menu(sc);
       sc.close();
    }

    public static void menu(Scanner sc){
        //establecer int caso como -1 para mostrar el menu al llamar la funcion
        int caso = -1;
        //mientras caso sea diferente de 0, mostrar el menu
        while(caso != 0){
            System.out.println(" ***CALCULADORA BÁSICA ***");
            System.out.println("");
            System.out.println("[1] - SUMAR. ");
            System.out.println("[2] - RESTAR.");
            System.out.println("[3] - MULTIPLICAR.");
            System.out.println("[4] - DIVIDIR. ");
            System.out.println("[0] - SALIR DEL PROGRAMA.");
            
            //leer el input como string para validar que sea un numero entero positivo antes de convertirlo a int
            String input = sc.nextLine();
            if(!CheckInt(input)){
                System.out.println("Ingrese una opcion valida");
                continue;
            }
            caso = Integer.parseInt(input);
            //llamar a la funcion correspondiente segun el caso + fallback para caso fuera de rango
            switch (caso) {
                case 1: sumar(sc); break;
                case 2: restar(sc); break;
                case 3: multiplicar(sc); break;
                case 4: dividir(sc); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción fuera de rango.");
        }
        }
        
        
    }
    //funcion para validar que el input sea un numero entero positivo
    public static boolean CheckInt(String input){
        //intentar convertir la cadena de entrada a un entero, si falla, la entrada no es un entero valido
        try {
            // Intenta convertir la cadena de entrada a un entero
            Integer.parseInt(input);
            //si la conversion es exitosa, verificar que el numero sea positivo
            if(Integer.parseInt(input)>= 0){
                return true;
            }else{return false;}
            //en caso de que la conversion falle, se lanzará una excepción NumberFormatException, lo que indica que la entrada no es un entero válido
        } catch (NumberFormatException e) {
            // Si la conversión falla, la entrada no es un entero válido
            return false;
        }
    }
    //funcion para pedir un numero entero positivo al usuario, utilizando la funcion CheckInt para validar la entrada y enviar el mensaje correspondiente segun el numero que se le pide al usuario
    public static int PedirNumero(Scanner sc, String mensaje){
        System.out.println(mensaje);
        String input = sc.nextLine();
        while(!CheckInt(input)){
            System.out.println("Ingrese un numero entero positivo valido.");
            input = sc.nextLine();
        }
        return Integer.parseInt(input);
    }
    //funcion para sumar
    public static void  sumar(Scanner sc){
        //hacer mientras Continuar() sea verdadero para repetir la operacion
        do {
            //establecer n1 como int usando PedirNumero() que a la vez lo valida y muestra el mensaje para el caso de suma
            int n1 = PedirNumero(sc, "Ingrese el primer numero:");
            int n2 = PedirNumero(sc, "Ingrese el segundo numero:");
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        }while(Continuar(sc));

    }
    //funcion restar (en diferencia) 
    public static void restar(Scanner sc){
        //hacer mientras Continuar() sea verdadero para repetir la operacion
           do {
            int n1 = PedirNumero(sc, "Ingrese el primer numero:");
            int n2 = PedirNumero(sc, "Ingrese el segundo numero:");
            //calcular la diferencia entre n1 y n2 con un if en linea
            int resultado = (n1 > n2) ? (n1 - n2) : (n2-n1);
            System.out.println("Resultado (diferencia) = " + resultado);
        }while(Continuar(sc));
    }
    //funcion multiplicar
    public static void multiplicar(Scanner sc){
          do {
            int n1 = PedirNumero(sc, "Ingrese el primer numero:");
            int n2 = PedirNumero(sc, "Ingrese el segundo numero:");
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        }while(Continuar(sc));
    }
    //funcion dividir
    public static void dividir(Scanner sc){

         do{
            //pedimos los numero y validamos
            int n1 = PedirNumero(sc, "Ingrese el primer numero entero positivo.");
            int n2 = PedirNumero(sc, "Ingrese el primer numero entero positivo (mayor a 0).");
            
            //establecemos el numero mas alto y mas chico
            int max = Math.max(n1, n2);
            int min = Math.min(n1,n2);
            //validamos que el numero mas chico no sea 0 para evitar division por 0. en caso de serlo se repite la opeeracion
            if(min == 0){
                System.out.println("Error: el numero mas chico no puede ser 0");
            }else{
                //el resultado se hace con double para mostrar decimales en caso de ser necesario
                double resultado = (double) max / min;
                System.out.println(max + " / " + min + " = " + resultado);
            }
         }while(Continuar(sc));
    }


    //boolean de continuar para repetir la operaacion
    public static boolean Continuar(Scanner sc){
        //mientras(true)
               while(true){
                //imprimir menu de opciones
                System.out.println("Desea hacer repetir la operacion?");
                System.out.println("[1] - Si.");
                System.out.println("[0] - No.");
                //leer la opcion del usuario
                String opcion = sc.nextLine();
                if(opcion.equals("1")) return true; //si es 1 se reptie la operacion
                if (opcion.equals("0")) return false;//si es 0 se sale de la operacion al menu
                System.out.println("Opción inválida.");//si el input no es 1 o 0 marca error y vuelve a preguntar
               }
    }
    
}
