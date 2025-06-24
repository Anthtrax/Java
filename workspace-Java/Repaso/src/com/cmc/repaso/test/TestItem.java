package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item tienda = new Item();
		tienda.setNombre("Salchicha");
		tienda.setProductosActuales(20);
		tienda.setProductosDevueltos(10);
		tienda.setProductosVendidos(5);
		System.out.println("Item");
		tienda.imprimir();
		
	}

}
