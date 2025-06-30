package com.krakedev.test;

import com.krakedev.evaluacion.CalculadoraAmortizacion;
import com.krakedev.evaluacion.Prestamo;

public class TestCalculadora {

	public static void main(String[] args) {
		 Prestamo prestamo = new Prestamo(5000, 12, 12);

	        CalculadoraAmortizacion.GenerarTabla(prestamo);
	        CalculadoraAmortizacion.mostrarTabla(prestamo);
	    }
}