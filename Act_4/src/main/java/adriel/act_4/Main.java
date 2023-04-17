package adriel.act_4;

import java.util.Scanner;

/**
 *
 * @author Adriel Sanchez 219220991 @ Unison
 */
public class Main {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Scanner entrada = new Scanner(System.in);

        arbol.postOrden(arbol.raiz);
        int opcion;
        do {
            System.out.println("Arbol Binario");
            System.out.println("1. Añadir nodos");
            System.out.println("2. Recorrer inorden");
            System.out.println("3. Recorrer preorden");
            System.out.println("4. Recorrer postorden");
            System.out.println("5. Salir");

            opcion = entrada.nextInt();
            int indice;
            Object contenido;

            switch (opcion) {
                case 1 -> {
                    System.out.println("Primero inserte indice, despues contenido:");
                    indice = entrada.nextInt();
                    contenido = entrada.next();
                    arbol.insertar(indice, contenido);
                }
                case 2 -> {
                    System.out.println("Recorrer inorden");
                    arbol.inOrden(arbol.raiz);
                }
                case 3 -> {
                    System.out.println("Recorrer preorden");
                    arbol.preOrden(arbol.raiz);
                }
                case 4 -> {
                    System.out.println("Recorrer postorden");
                    arbol.postOrden(arbol.raiz);
                }
                case 5 -> System.out.println("Gracias por usar mi programa");
            }
            
        } while (opcion != 5);
    }
}
