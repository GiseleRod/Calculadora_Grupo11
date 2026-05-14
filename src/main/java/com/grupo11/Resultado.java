package com.grupo11;
import java.util.ArrayList;

/**
 * Clase encargada de almacenar y mostrar los últimos resultados
 * obtenidos en las operaciones de la calculadora.
 *
 * Mantiene como máximo tres resultados guardados.
 */
public class Resultado {
    /**
     * Lista donde se almacenan los últimos resultados calculados.
     */
    ArrayList<Long> resultados = new ArrayList<>();

    /**
     * Agrega un nuevo resultado a la lista de resultados guardados.
     * Si ya existen tres resultados almacenados, elimina el más antiguo
     * antes de agregar el nuevo.
     *
     * @param resultado resultado obtenido en una operación matemática.
     */

    public void agregarResultado(long resultado) {
        if(resultados.size() >=3){
            resultados.remove(0);
        }
        resultados.add(resultado);
    }

    /**
     * Muestra por consola los resultados guardados.
     * Si todavía no hay tres resultados almacenados, informa que no
     * se realizaron suficientes operaciones.
     */
    public void mostrarResultado() {
        if (resultados.size() < 3) {
            System.out.println("No se hicieron suficientes operaciones para mostrar resultados guardados.");
        } else {
            for(Long res : resultados){ //para cada "res" en "resultados"
                System.out.println(res);
            }
        }
    }
}
// cambios:
// - se elimina el constructor (java crea uno automaticamente)
// - se trabaja con un arraylist de 3 elementos maximo
// - se cambia a un for loop para mostrar resultados