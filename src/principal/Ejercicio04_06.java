package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio04_06 {

	public static void main(String[] args) {
		// Dado un array de enteros de tamaño N, se debe buscar el primer elemento del array mayor que un número A, y a 
		// partir de él inclusive, visualizar todos los valores de los siguientes hasta el último elemento del array.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de elementos para le vector");
		int num = teclado.nextInt();
		
		int numeros[] = new int[num];
		System.out.println("Introduce el vector:");
		FuncionesVectores.pedirVector(numeros);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(numeros);
		
		
		System.out.println("Introduce el numero maximo: ");
		int maximo=teclado.nextInt();
		System.out.printf("La cadena siguiente al numero maximo a buscar: ");
		FuncionesVectores.mostrarMayor(numeros,maximo);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
