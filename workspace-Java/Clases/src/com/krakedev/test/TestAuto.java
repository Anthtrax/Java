package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		Auto auto3;
		Auto auto4;
		Auto auto5;
		
		auto3=new Auto("lamborghini");
		System.out.println(auto3.getMarca());
		System.out.println("-----------------");
		auto1=new Auto("lamborghini");
		auto1.setMarca("lamborghini");
		auto1.setAnio(1963);
		auto1.setPrecio(200.0);
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Anio: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		
		System.out.println("-------------------");
		
		auto4=new Auto("porsche" , 1948);
		System.out.println(auto4.getMarca());
		System.out.println(auto4.getAnio());
		
		System.out.println("-------------------");
		auto2=new Auto("porsche" , 1948);
		auto2.setMarca("porsche");
		auto2.setAnio(1948);
		auto2.setPrecio(3.228);
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Anio: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());
		
		System.out.println("-------------------");
		
		auto5=new Auto("mercedes",1886,615.00);
		System.out.println("Marca: "+auto5.getMarca());
		System.out.println("Anio: "+auto5.getAnio());
		System.out.println("Precio: "+auto5.getPrecio());
	}

}
