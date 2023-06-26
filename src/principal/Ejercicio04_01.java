package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio04_01 {

	public static void main(String[] args) {
		// TODO Rellenar un array de tamaño N con valores enteros dados por el usuario a través del teclado. 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuantos elementos quieres?");
		int num = teclado.nextInt();
		
		int numeros[] = new int[num];
		System.out.println("Introduce el vector:");
		FuncionesVectores.pedirVector(numeros);
				
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(numeros);

	}

}
