package com.grupo11;
/**
*clase principal del programa.
*contiene el método main que inicia la ejecución de la calculadora.
*/
public class Main {
/**
*método principal que se ejecuta al iniciar el programa.
*crea una instacia del menu y comienza la interación con el usuario.
*/
    public static void main(String[] args) {
        //se crea el objeto menú
        Menu menu = new Menu();
        //se inicia el programa mostrando menú
        menu.iniciar();
        
    }
}
