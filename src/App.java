package src;

import java.util.Scanner;

import com.duolingo.clasificador.Clasificador;

public class App {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int menu = -1;
        int opciones;
        Clasificador palabra = new Clasificador();
        String enunciadoMenu = "";

        enunciadoMenu += "1. Añadir palabra" + "\n";
        enunciadoMenu += "2. Eliminar palabra" + "\n";
        enunciadoMenu += "3. Comprobar si existe una palabra" + "\n";
        enunciadoMenu += "4. Mostrar la iniciales disponibles" + "\n";
        enunciadoMenu += "5. Ver palabras por inicial" + "\n";
        enunciadoMenu += "6. Cerrar el programa" + "\n";

        while (menu != 0) {
            System.out.println(enunciadoMenu);
            opciones = teclado.nextInt();
            teclado.nextLine();
            switch (opciones) {
                case 1:
                    System.out.println("Introduce la palabra a añadir");
                    String palabraAñadida = teclado.nextLine();
                    palabra.anadirPalabra(palabraAñadida);
                    break;
            
                case 2:
                    System.out.println("Introduce la palabra a eliminar");
                    String palabraEliminada = teclado.nextLine();
                    palabra.eliminarPalabra(palabraEliminada);
                    break;
                
                case 3:
                    System.out.println("Introduce la palabra para comprobar si existe");
                    String palabraComprobada = teclado.nextLine();
                    palabra.comprobarExistePalabra(palabraComprobada);
                    break;
                
                case 4:
                    System.out.println("No disponible por el momento");
                    break;
                
                case 5:
                    System.out.println("Introduce una letra para mostrar las palabras que empiecen con ella");
                    String listaLetras = teclado.nextLine();
                    palabra.mostrarPalabrasInicial(listaLetras);
                    break;

                case 6:
                    System.out.println("Cerrando programa, aaaadios");
                    menu = 0;
                    break;
                default:
                    System.out.println("Mi loco, eso no es una opción");
                    break;
            }
        }

        teclado.close();
    }
}