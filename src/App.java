package src;

import java.util.Scanner;

import com.duolingo.clasificador.Clasificador;

public class App {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un nombre");
        String nombre = teclado.nextLine();

        Clasificador micClasificador = new Clasificador(nombre);

        
        micClasificador.anadirPalabra();
        micClasificador.mostrarLista();
    }
}