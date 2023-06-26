package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio04_07 {

	public static void main(String[] args) {
		//Dados dos arrays de reales de tamaño N, suponiendo que modelan dos vectores de un espacio N-dimensional, 
		// decir si son paralelos o no. Son paralelos si todos sus valores son proporcionales

		

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
		
		System.out.println("Es pararelo?");
		if (FuncionesVectores.VectorParalelo(numeros1,numeros2) == true) {
			System.out.println("Si, es paralelo");
		} else { System.out.println("No es paralelo");
		
		}


	
	
	
	
	
	}



}
