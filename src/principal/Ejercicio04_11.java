package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio04_11 {

	public static void main(String[] args) {
		// Dados dos vectores, calcular la suma de ambos. 

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de elementos para le vector");
		int num = teclado.nextInt();
		
		int numeros1[] = new int[num];
		int numeros2[] = new int[num];
		System.out.println("Introduce el vector1:");
		FuncionesVectores.pedirVector(numeros1);
		
		System.out.println("Introduce el vector2:");
		FuncionesVectores.pedirVector(numeros2);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(numeros1);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(numeros2);
		
		System.out.println("El resultado es:");
		FuncionesVectores.SumarVector(numeros1,numeros2);

	}

}
