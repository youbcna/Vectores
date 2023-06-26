package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio04_05 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		// Dado un array de enteros detamaño N, rotar sus valores una posición a la derecha, es decir, si tenemos un array como 
		// el siguiente: 5 -1 -3 15 4, el resultado deberá ser el array rotado a la derecha: 4 5 -1 -3 15.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de elementos para le vector");
		int num = teclado.nextInt();
		
		int numeros[] = new int[num];
		System.out.println("Introduce el vector:");
		FuncionesVectores.pedirVector(numeros);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(numeros);
		
		
		FuncionesVectores.RotarDerecha(numeros);
		
		System.out.println("El vector rotado a la derecha es:");
		FuncionesVectores.mostrarVector(numeros);
		
		teclado.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
