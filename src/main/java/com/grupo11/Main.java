package com.grupo11;
/**
* Clase principal del programa.
* Contiene el método main que inicia la ejecución de la calculadora.
*/
public class Main {
/**
* Método principal que se ejecuta al iniciar el programa.
* Crea una instancia de Menu y comienza la interacción con el usuario.
*
* @param args argumentos recibidos por consola.
*/
    public static void main(String[] args) {
        // Se crea el objeto menú
        Menu menu = new Menu();
        // Se inicia el programa mostrando menú
        menu.iniciar();
        
    }
}
