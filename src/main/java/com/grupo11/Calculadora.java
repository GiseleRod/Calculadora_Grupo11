import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       menu(sc);
       sc.close();
    }

    public static void menu(Scanner sc){
        int caso = -1;
        while(caso != 0){
            System.out.println(" ***CALCULADORA BÁSICA ***");
            System.out.println("");
            System.out.println("[1] - SUMAR. ");
            System.out.println("[2] - RESTAR.");
            System.out.println("[3] - MULTIPLICAR.");
            System.out.println("[4] - DIVIDIR. ");
            System.out.println("[0] - SALIR DEL PROGRAMA.");
            
            String input = sc.nextLine();
            if(!CheckInt(input)){
                System.out.println("Ingrese una opcion valida");
                continue;
            }
            caso = Integer.parseInt(input);
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
    
    public static boolean CheckInt(String input){
        try {
            // Intenta convertir la cadena de entrada a un entero
            Integer.parseInt(input);
            if(Integer.parseInt(input)>= 0){
                return true;
            }else{return false;}
            
        } catch (NumberFormatException e) {
            // Si la conversión falla, la entrada no es un entero válido
            return false;
        }
    }
   
    public static int PedirNumero(Scanner sc, String mensaje){
        System.out.println(mensaje);
        String input = sc.nextLine();
        while(!CheckInt(input)){
            System.out.println("Ingrese un numero entero positivo valido.");
            input = sc.nextLine();
        }
        return Integer.parseInt(input);
    }

    public static void  sumar(Scanner sc){
        do {
            int n1 = PedirNumero(sc, "Ingrese el primer numero:");
            int n2 = PedirNumero(sc, "Ingrese el segundo numero:");
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        }while(Continuar(sc));

    }
    public static void restar(Scanner sc){
           do {
            int n1 = PedirNumero(sc, "Ingrese el primer numero:");
            int n2 = PedirNumero(sc, "Ingrese el segundo numero:");
            int resultado = (n1 > n2) ? (n1 - n2) : (n2-n1);
            System.out.println("Resultado (diferencia) = " + resultado);
        }while(Continuar(sc));
    }
    public static void multiplicar(Scanner sc){
          do {
            int n1 = PedirNumero(sc, "Ingrese el primer numero:");
            int n2 = PedirNumero(sc, "Ingrese el segundo numero:");
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        }while(Continuar(sc));
    }
    public static void dividir(Scanner sc){
         boolean repetir = true;
         while(repetir){
            int n1 = PedirNumero(sc, "Ingrese el primer numero entero positivo.");
            int n2 = PedirNumero(sc, "Ingrese el primer numero entero positivo (mayor a 0).");
            
            int max = Math.max(n1, n2);
            int min = Math.min(n1,n2);

            if(min == 0){
                System.out.println("Error: el numero mas chico no puede ser 0");
            }else{
                int resultado = (max / min);
                System.out.println(max + " / " + min + " = " + resultado);
            }
            repetir = Continuar(sc);
         }
    }


    
    public static boolean Continuar(Scanner sc){
               while(true){
                System.out.println("Desea hacer repetir la operacion?");
                System.out.println("[1] - Si.");
                System.out.println("[0] - No.");
                String opcion = sc.nextLine();
                if(opcion.equals("1")) return true;
                if (opcion.equals("0")) return false;
                System.out.println("Opción inválida.");
               }
    }
    
}
