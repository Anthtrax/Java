package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		auto1=new Auto();
		auto1.setMarca("lamborghini");
		auto1.setAnio(1963);
		auto1.setPrecio(200.0);
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Anio: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		
		auto2=new Auto();
		System.out.println("-------------------");
		auto2.setMarca("porsche");
		auto2.setAnio(1948);
		auto2.setPrecio(3.228);
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Anio: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());

	}

}
