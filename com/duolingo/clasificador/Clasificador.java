package com.duolingo.clasificador;
import java.util.*;

public class Clasificador {

    private Map<String, Set<String>> listaGeneral = new HashMap<>();
    private Set<String> primeraLetra = new HashSet<>();
    
    private String obtenerPrimeraLetra(String palabra){ 
        return palabra.substring(0,1).toLowerCase();
        // Extraigo la inicial a nuevaPalabra
    }
    
    public void anadirPalabra(String nuevaPalabra){
        
        nuevaPalabra.trim().toLowerCase(); // Limpiar la palabra, todo a minúsculas y sin espacios
        
        if(listaGeneral.containsKey(obtenerPrimeraLetra(nuevaPalabra))){    
            // Busco en el Map si existe un Set para esa inicial
            //Si existe el Set, lo obtengo, añado la palabra y actualizo el mapa con un put
            primeraLetra = listaGeneral.get(obtenerPrimeraLetra(nuevaPalabra));
            primeraLetra.add(nuevaPalabra);
            listaGeneral.put(obtenerPrimeraLetra(nuevaPalabra), primeraLetra);
            System.out.println("Palabra añadida a lista");
            System.out.println(listaGeneral);
        }else{
            // Si no existe el Set, creo un Set nuevo, y lo guardo en el Map para esa letra
            Set<String> nuevaLetra = new HashSet<>();
            nuevaLetra.add(nuevaPalabra.toLowerCase());
            listaGeneral.put(obtenerPrimeraLetra(nuevaPalabra), nuevaLetra);
            System.out.println("Lista creada y palabra nueva añadida");
            System.out.println(listaGeneral);
        }
    }

    public void eliminarPalabra(String palabraEliminar){
        if(listaGeneral.containsKey(obtenerPrimeraLetra(palabraEliminar))){ // Compruebo que existe la colección y luego elimino la palabra de la coleccion
            primeraLetra = listaGeneral.get(obtenerPrimeraLetra(palabraEliminar));
            primeraLetra.remove(palabraEliminar);
            System.out.println("Palabra encontrada y eliminada");
            System.out.println(listaGeneral);
            if(primeraLetra.isEmpty()){
                listaGeneral.remove(obtenerPrimeraLetra(palabraEliminar));
            }
        }else{
            System.out.println("la palabra que desea eliminar no existe");
            System.out.println(listaGeneral);
        }
    }

    public void comprobarExistePalabra(String comprobacionPalabra){  // Compruebo que existe la coleccion, la obtengo, y por ultimo muestro el mensaje
        if(listaGeneral.containsKey(obtenerPrimeraLetra(comprobacionPalabra))){
            primeraLetra = listaGeneral.get(obtenerPrimeraLetra(comprobacionPalabra));
            if(primeraLetra.contains(comprobacionPalabra)){
                System.out.println("Palabra encontrada");
            }else{
                System.out.println("La palabra no existe");
                System.out.println(listaGeneral);
            }
        }else{
            System.out.println("La palabra no existe");
            System.out.println(listaGeneral);
        }
    }

    public void mostrarPalabrasInicial(String letra){

        primeraLetra = listaGeneral.get(obtenerPrimeraLetra(letra));

        if(listaGeneral.containsKey(obtenerPrimeraLetra(letra))){
            System.out.println(primeraLetra);
        }else{
            System.out.println("La letra no está en la lista");
        }
    }

    public void mostrarLetras(){
        if(listaGeneral.isEmpty()){
            System.out.println("El diccionario está vacío");
        }else{
            System.out.println(listaGeneral.keySet());
        }
    }
}
