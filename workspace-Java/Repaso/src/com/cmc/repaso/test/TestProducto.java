package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto = new Producto("Estefan",50.0);

        // Pruebas
        producto.setPrecio(50.0);
        
        System.out.println("Precio original: " + producto.getPrecio());
        System.out.println("Precio con 20% de descuento: " + producto.calcularPromo(20)); // Debería ser 40.0
        System.out.println("Precio con 10% de descuento: " + producto.calcularPromo(10)); // Debería ser 45.0
        System.out.println("Precio con -5% de descuento: " + producto.calcularPromo(-5)); // Debería ser 50.0 (sin descuento)
        System.out.println("Precio con 150% de descuento: " + producto.calcularPromo(150)); // Debería ser 0.0
    }
}