package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.Maquinadulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		Maquinadulces maquina=new Maquinadulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34",0.85,"Papitas");
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		//En la linea 17
		//La variable que da error es prod.getNombre
		System.out.println("Producto encontrado:"+prod.getNombre());
		
		
		
		
	}
}
