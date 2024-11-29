
//Este código genera un array de 20 números aleatorios entre 20 y 400. 
//Luego, solicita al usuario que elija entre resaltar los múltiplos de 5 o los múltiplos de 7. 
//Según la opción elegida, el programa recorre el array e imprime los números, resaltando entre corchetes 
//aquellos que sean múltiplos del número seleccionado. Finalmente, cierra el Scanner para liberar los recursos. Este código permite al usuario destacar ciertos números en una secuencia aleatoria.



package codigo6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Estabab mal declarado el array
		int[] n = new int[20];

        // Generar números aleatorios entre 20 y 400
        for (int i = 0; i < 20; i++) {
            n[i] = (int) (Math.random() * 381) + 20;
            System.out.print(n[i] + " ");
        }
        //Sacamos el system out fuera del cicloo
        System.out.println("\n¿Qué números quiere resaltar?");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

        //agregamos scanner para las entradas del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        // Determinar el múltiplo según la opción
        int multiplo = (opcion == 1) ? 5 : 7;

        //Usamos for en lugar foreach porque nos ayuda a entrar al indice del array
        // Recorrer el array y resaltar los números
        for (int e : n) {
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {
                System.out.print(e + " ");
            }
        }

        scanner.close(); // Cerrar el Scanner
	}

}
