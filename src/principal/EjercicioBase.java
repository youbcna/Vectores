package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class EjercicioBase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuantos elementos quieres?");
		int num = teclado.nextInt();
		
		int numeros[] = new int[num];
		System.out.println(numeros);
		System.out.println("Introduce el vector:");
		FuncionesVectores.pedirVector(numeros);
		
		int otro[] = FuncionesVectores.pedirVector(num);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(numeros);
		

	}

}
