package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDividir;
		
		calcu=new Calculadora();
		
		resultadoSuma=calcu.sumar(5,3);
		resultadoResta=calcu.restar(10,3);
		resultadoMultiplicacion=calcu.multiplicar(10,50);
		resultadoDividir=calcu.dividir(30,3);
		
		
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: "+resultadoMultiplicacion);
		System.out.println("RESULTADO DIVISION: "+resultadoDividir );

	}

}
