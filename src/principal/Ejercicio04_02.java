package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio04_02 {

	public static void main(String[] args) {
		/**
		 * Dado un array de enteros de tamaño N, visualizar por pantalla todos los elementos del mismo cuyo valor sea 
		 * menor que un número A. 
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de elementos para le vector");
		int num = teclado.nextInt();
		
		int numeros[] = new int[num];
		System.out.println("Introduce el vector:");
		FuncionesVectores.pedirVector(numeros);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(numeros);
		
		System.out.println("Introduce el numero maximo a mostrar");
		int maximo = teclado.nextInt();
		
		FuncionesVectores.NumeroMaximo(numeros, maximo);

	}

}
