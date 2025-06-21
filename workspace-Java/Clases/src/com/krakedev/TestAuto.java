package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		auto1=new Auto();
		auto1.marca ="lamborghini";
		auto1.anio = 1963;
		auto1.precio=200.0;
		System.out.println("Marca: "+auto1.marca);
		System.out.println("Anio: "+auto1.anio);
		System.out.println("Precio: "+auto1.precio);
		
		auto2=new Auto();
		System.out.println("-------------------");
		auto2.marca="porsche";
		auto2.anio=1948;
		auto2.precio=3.228;
		System.out.println("Marca: "+auto2.marca);
		System.out.println("Anio: "+auto2.anio);
		System.out.println("Precio: "+auto2.precio);

	}

}
