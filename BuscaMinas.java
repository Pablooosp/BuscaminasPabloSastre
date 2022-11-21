package arraysmultidimensionales;

import java.util.Scanner;

public class BuscaMinas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tablero[][] = new String[5][5]; //Creamos el array
		int fila = 0; //Inicializamos variable fila
		int columna = 0; //Inicializamos variable columna
		int bombas = 0; //Inicializamos variable bombas (contador)

		for (int i = 0; i < tablero.length; i++) { //Bucle para preguntar el contenido del array
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.println("Introduzca coordenada (" + i + "," + j + "): ");
				tablero[i][j] = sc.nextLine();
			}
		}
		System.out.println("Fila a comprobar:");
		fila = sc.nextInt();
		System.out.println("Columna a comprobar:");
		columna = sc.nextInt();

		if (tablero[fila][columna] == "*") { //9 if para comprobar si en la posicion hay mina o no
			bombas++;
		}
		if (tablero[fila - 1][columna - 1] == "*" && fila > 0 && columna > 0) {
			bombas++;
		}
		if (tablero[fila][columna - 1] == "*" && columna > 0) {
			bombas++;
		}
		if (tablero[fila + 1][columna - 1] == "*" && columna > 0 && fila < 4) {
			bombas++;
		}
		if (tablero[fila - 1][columna] == "*" && fila > 0) {
			bombas++;
		}
		if (tablero[fila + 1][columna] == "*" && fila < 4) {
			bombas++;
		}
		if (tablero[fila - 1][columna + 1] == "*" && fila > 0 && columna < 4) {
			bombas++;
		}
		if (tablero[fila][columna + 1] == "*" && columna < 4) {
			bombas++;
		}
		if (tablero[fila + 1][columna + 1] == "*" && fila < 4 && columna < 4) {
			bombas++;
		}
		sc.close();
		System.out.println(bombas);
		for (int i = 0; i < tablero.length; i++) { //Bucle para imprimir el array

			for (int j = 0; j < tablero[i].length; j++) {

				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}

	}

}
