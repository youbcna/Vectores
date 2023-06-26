package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio04_04 {

	public static void main(String[] args) {
		// Dado un array de enteros de tamaño N, rotar sus valores una posición a la izquierda, es decir, si tenemos un array 
		// como el siguiente: 5 -1 -3 15 4,  el resultado deberá ser el arrayrotado a la izquierda: -1 -3 15 4 5. 

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de elementos para le vector");
		int num = teclado.nextInt();
		
		int numeros[] = new int[num];
		System.out.println("Introduce el vector:");
		FuncionesVectores.pedirVector(numeros);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(numeros);
		
		
		FuncionesVectores.RotarIzquierda(numeros);
		
		System.out.println("El vector rotado a la izquierda es:");
		FuncionesVectores.mostrarVector(numeros);
		
		teclado.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
