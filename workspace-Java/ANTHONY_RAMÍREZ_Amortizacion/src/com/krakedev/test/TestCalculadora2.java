package com.krakedev.test;

import com.krakedev.evaluacion.CalculadoraAmortizacion;
import com.krakedev.evaluacion.Prestamo;

public class TestCalculadora2 {

	public static void main(String[] args) {
		Prestamo prestamo = new Prestamo(5000, 12, 15);

        CalculadoraAmortizacion.GenerarTabla(prestamo);
        CalculadoraAmortizacion.mostrarTabla(prestamo);
    }
}