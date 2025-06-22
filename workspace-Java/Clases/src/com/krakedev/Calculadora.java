package com.krakedev;

public class Calculadora {
	
	private int sumar(int valor1,int valor2) {
		int resultado;//declarar la variable
		resultado=valor1+valor2;
		return resultado;
	}
	private double restar(int valor1,int valor2) {
		double resultado;
		resultado=valor1-valor2;
		return resultado;
	}
	private double multiplicar(double valor1,double valor2) {
		double resultado;
		resultado=valor1*valor2;
		return resultado;
	}
	private double dividir(double dividendo,double divisor ) {
		double resultado;
		resultado=dividendo/divisor;
		return resultado;
	}
	private double promediar(double valor1, double valor2, double valor3) {
		double resultado;
		resultado=(valor1+valor2+valor3)/3;
		return resultado;
	}
	public void mostrarResultado() {
		System.out.println("Ahorita no joven,Salí al almuerzo. Regreso en 15 minutos");
	}
	
		public int obtenerSuma(int valor1, int valor2) {
			return sumar(valor1, valor2);
		}
		
		public double obtenerResta(int valor1, int valor2) {
			return restar(valor1, valor2);
		}
		
		public double obtenerMultiplicacion(double valor1, double valor2) {
			return multiplicar(valor1, valor2);
		}
		
		public double obtenerDivision(double dividendo, double divisor) {
			return dividir(dividendo, divisor);
		}
		
		public double obtenerPromedio(double valor1, double valor2, double valor3) {
			return promediar(valor1, valor2, valor3);
		}
}
