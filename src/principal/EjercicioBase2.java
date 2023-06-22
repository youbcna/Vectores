package principal;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class EjercicioBase2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número de elemnentos:");
		int tam = teclado.nextInt();
		
		System.out.println("Introduce los datos: ");
		int vector[] = FuncionesVectores.pedirVector(tam);
		
		System.out.printf("Tu vector es: ");
		FuncionesVectores.mostrarVector(vector);
		
		int numPos = FuncionesVectores.cuentaPositivos(vector);
		System.out.printf("Hay %d números positivos",numPos);

	}

}
