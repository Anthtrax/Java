package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.Maquinadulces;

public class TestBuscarCeldaProducto {

	public static void main(String[] args) {
		Maquinadulces maquina = new Maquinadulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));

		Producto producto = new Producto("Papitas", 0.85, "KE34");
		maquina.cargarProducto(producto, "B1", 4);

		Celda celda = maquina.BuscarCeldaProducto("KE34");
		System.out.println("Celda que contiene el producto: " + celda.getCodigo());

	}

}