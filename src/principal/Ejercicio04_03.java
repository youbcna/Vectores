package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio04_03 {

	public static void main(String[] args) {
		/**
		 * Dado un array de reales del tamaño N, visualizar por pantalla todos los elementos del mismo cuyo 
		 * valor pertenezca al intervalo [a,b).
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de elementos para le vector");
		int num = teclado.nextInt();
		
		int numeros[] = new int[num];
		System.out.println("Introduce el vector:");
		FuncionesVectores.pedirVector(numeros);
		

		
		System.out.println("Introduce el numero minimo a mostrar");
		int minimo = teclado.nextInt();
		System.out.println("Introduce el numero maximo a mostrar");
		int maximo = teclado.nextInt();
		
		FuncionesVectores.NumerosIntervalo(minimo, maximo, numeros);

	}

}
