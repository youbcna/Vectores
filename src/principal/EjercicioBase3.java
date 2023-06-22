package principal;

import funciones.FuncionesVectores;

public class EjercicioBase3 {

	public static void main(String[] args) {
		System.out.println("Suma de datos de precipitaciones");

		double lluvias [] = new double [12];
		System.out.println("Introduce los datos de lluvia de cada mes");
		FuncionesVectores.pedirVector(lluvias);
		
		System.out.println("Los datos de lluvia del año son: ");
		FuncionesVectores.mostrarVector(lluvias);
		
		double res= FuncionesVectores.media(lluvias);
		System.out.printf("La media de precipietacion anual es de %.2f",res);
		
	}

}
