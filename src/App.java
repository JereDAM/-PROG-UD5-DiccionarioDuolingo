package src;

import java.util.Scanner;

import com.duolingo.clasificador.Clasificador;

public class App {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);      

        Clasificador micClasificador = new Clasificador();
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            micClasificador.anadirPalabra(nombre);
        }


    }
}