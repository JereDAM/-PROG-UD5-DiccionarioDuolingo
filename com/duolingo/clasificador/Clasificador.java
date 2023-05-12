package com.duolingo.clasificador;
import java.util.*;

public class Clasificador {
    private String palabraIntroducida;
    private Set<String> palabras = new HashSet<String>();

    public Clasificador(String palabraIntroducida){
        this.palabraIntroducida = palabraIntroducida;
    }

    public String getPalabraIntroducida(){ //Getter para retornar la palabra;
        return this.palabraIntroducida;
    }

    public char PrimeraLetra(){  //Método para sacar la primera letra de una palabra;
        char letraPalabraIntroducida = palabraIntroducida.charAt(0);
        return letraPalabraIntroducida;
    }

    public Set<String> anadirPalabra(){
        palabras.add(palabraIntroducida);
        return palabras;
    }

    /*public void testeo(){
        System.out.println(palabraIntroducida);
    }*/


}
