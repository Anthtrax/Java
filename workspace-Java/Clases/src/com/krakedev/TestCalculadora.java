package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDividir;
		double resultadoPromedio;
		
		calcu = new Calculadora();
		
		resultadoSuma = calcu.obtenerSuma(5, 3);
		resultadoResta = calcu.obtenerResta(10, 3);
		resultadoMultiplicacion = calcu.obtenerMultiplicacion(10, 50);
		resultadoDividir = calcu.obtenerDivision(30, 3);
		resultadoPromedio = calcu.obtenerPromedio(10, 8, 9);
		
		System.out.println("RESULTADO SUMA: " + resultadoSuma);
		System.out.println("RESULTADO RESTA: " + resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: " + resultadoMultiplicacion);
		System.out.println("RESULTADO DIVISION: " + resultadoDividir);
		System.out.println("RESULTADO PROMEDIO: " + resultadoPromedio);
		
		
	}
}
