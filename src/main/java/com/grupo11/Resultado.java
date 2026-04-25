package com.grupo11;
import java.util.ArrayList;

public class Resultado {
    ArrayList<Long> resultados = new ArrayList<>();

    public void agregarResultado(long resultado) {
        if(resultados.size() >=3){
            resultados.remove(0);
        }
        resultados.add(resultado);
    }

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