package com.krakedev.test;

import com.krakedev.Productos;

public class TestProducto {

	public static void main(String[] args) {
		Productos productoA;
		Productos productoB;
		Productos productoC;
		productoA = new Productos("Curita");
		productoA.setNombre("Curitas");
		productoA.setDescripcion("Es una pequena tira adhesiva con un aposito esteril en el centro");
		productoA.setPrecio(0.15);
		productoA.setStockActual(100);
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio:" + productoA.getPrecio());
		System.out.println("stockActual: " + productoA.getStockActual());
		System.out.println("--------------------");
		productoB = new Productos("Jarabe","Solucion liquida");
		productoB.setNombre("Jarabe para la tos");
		productoB.setDescripcion("Solucion liquida que se administra por via oral para tratar diferentes tipos de tos");
		productoB.setPrecio(1.50);
		productoB.setStockActual(500);
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("stockActual: " + productoB.getStockActual());
		System.out.println("--------------------");
		productoC = new Productos("Pastillas anticonceptivas","Son un método seguro",2.50);
		productoC.setNombre("Pastillas anticonceptivas");
		productoC.setDescripcion("Son un método seguro y efectivo para evitar temporalmente el embarazo");
		productoC.setPrecio(2.50);
		productoC.setStockActual(1000);
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("stockActual: " + productoC.getStockActual());

	}

}
