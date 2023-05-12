package com.duolingo.clasificador;
import java.util.*;

public class Clasificador {

    private Map<String, Set<String>> listaGeneral = new HashMap<>();


    private String obtenerPrimeraLetra(String palabra){ 
        return palabra.substring(0,0).toLowerCase();
        // Extraigo la inicial a nuevaPalabra
    }

    public void anadirPalabra(String nuevaPalabra){

        nuevaPalabra.toLowerCase(); // Limpiar la palabra, todo a minúsculas y sin espacios
        nuevaPalabra.trim();    
        // Busco en el Map si existe un Set para esa inicial
        // Si existe el Set, lo obtengo, añado la palabra y actualizo el mapa con un put
        // Si no existe el Set, creo un Set nuevo, y lo guardo en el Map para esa letra

    }



    /*public void testeo(){
        System.out.println(palabraIntroducida);
    }*/


}
