package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Productos productoA;
		Productos productoB;
		Productos productoC;
		productoA = new Productos();
		productoA.nombre = "Curitas";
		productoA.descripcion = "Es una pequena tira adhesiva con un aposito esteril en el centro";
		productoA.precio = 0.15;
		productoA.stockActual = 100;
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripcion: " + productoA.descripcion);
		System.out.println("Precio:" + productoA.precio);
		System.out.println("stockActual: " + productoA.stockActual);
		System.out.println("--------------------");
		productoB = new Productos();
		productoB.nombre = "Jarabe para la tos";
		productoB.descripcion = "Solucion liquida que se administra por via oral para tratar diferentes tipos de tos";
		productoB.precio = 1.50;
		productoB.stockActual = 500;
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripcion: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("stockActual: " + productoB.stockActual);
		System.out.println("--------------------");
		productoC = new Productos();
		productoC.nombre = "pastillas anticonceptivas";
		productoC.descripcion = "Son un método seguro y efectivo para evitar temporalmente el embarazo";
		productoC.precio = 2.50;
		productoC.stockActual = 1000;
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripcion: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("stockActual: " + productoC.stockActual);

	}

}
