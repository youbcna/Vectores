package funciones;

import java.util.Scanner;

public class FuncionesVectores {

	
	public static int[] pedirVector(int num) {
		int[] vector = new int[num];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=teclado.nextInt();
		}
		return vector;
	}
	
	public static int[] pedirVector() {
		return pedirVector(10);
	}
	
	/* no se puede sobrecargar si sólo cambia en el parametro de devolución
	public static double[] pedirVectorDouble(int num) {
		double[] vector = new double[num];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=teclado.nextDouble();
		}
		return vector;
	}*/
	
	public static void pedirVector(int [] vector) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(vector);
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=teclado.nextInt();
		}
	}
	public static void pedirVector(double[] vector) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(vector);
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=teclado.nextDouble();
		}
		
	}
	
	public static void mostrarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%d ",vector[i]);
		}
		System.out.println();
	}
	
	public static void mostrarVector(double vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%.2f ",vector[i]);
		}
		System.out.println();
	}
	
	
	public static int cuentaPositivos(int vector[]) {
		int contador=0;
		for (int i=0;i<vector.length;i++) {
			if (vector[i]>0) contador++;
		}
		return contador;
	}

	/**
	 * Función que calcula la media de los elementos de un vector
	 * @param vector double[] con los datos cuya media se quiere calcular
	 * @return double con la media de los elementos del vector
	 */
	public static double media(double[] vector) {
		double suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma = suma+vector[i];
		}
		return suma/vector.length;
	}

	public static void NumeroMaximo(int[] numeros, int maximo) {
		// TODO Esbozo de método generado automáticamente
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i] < maximo) { 
				System.out.println(numeros[i]);
			}
		
		
			}
			
		}

	public static void NumerosIntervalo(int minimo, int maximo, int[] numeros) {
		// TODO Esbozo de método generado automáticamente
		
		for(int i=0;i<numeros.length;i++) {
			if ((numeros[i]<=maximo) && (numeros[i]>=minimo)){
				System.out.println(numeros[i]);
			}
		}
		
	}

	public static void RotarIzquierda(int[] numeros) {
		// TODO Rotar a la izquierda el ultimo numero de la cadena
		
		int aux;
		aux=numeros[0];
		for(int i=0;i<numeros.length-1;i++) {
			numeros[i]=numeros[i+1];
		}
		numeros[numeros.length-1]=aux;
		
	}

	public static void RotarDerecha(int[] numeros) {
		// TODO Rotar a la derecha el primer numero de la cadena
		int aux;
		aux=numeros[numeros.length-1];
		for( int i=numeros.length-1; i>0;i--) {
			numeros[i]= numeros[i-1];
		}
		numeros[0]=aux;

	}

	public static void mostrarMayor(int[] numeros, int maximo) {
		// TODO Esbozo de método generado automáticamente
		int i=0;
		for(i=0;i<numeros.length;i++) {
			if (maximo==numeros[i]) {
				break;
			}
		}
		for (int n = i; i < numeros.length; i++) {
			System.out.print(numeros[i]);
		}
		
				
		}

	public static boolean VectorParalelo(int[] numeros1, int[] numeros2) {
		// TODO Esbozo de método generado automáticamente
	
		
		int i;
		double resultado =numeros1[0]/(double)numeros2[0];
		double res;
				
				
		for( i=1; i<numeros1.length; i++) {
			res=numeros1[i]/(double)numeros2[i];
			
			if (resultado!=res)  {
				return false;
			} 
			
		}
		
		return true;
	}

	public static void SumarVector(int[] numeros1, int[] numeros2) {
		// TODO Suma de vectores
		
		
		in
		
	}
	}
	


	




