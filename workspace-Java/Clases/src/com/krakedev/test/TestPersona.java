package com.krakedev.test;

import com.krakedev.Persona;

/*
 * Comentario de varias lineas
 * 
 * */
public class TestPersona {

	public static void main(String[] args) {
		Persona p;// 1. Declaro una variable llamada p de tipo Persona
		Persona p2 = new Persona();
		Persona p4=new Persona("Rocio",43,1.60);
		
		System.out.println("nombre:" + p4.getNombre());
		System.out.println("edad:" + p4.getEdad());
		System.out.println("estatura:" + p4.getEstatura());
		p = new Persona();// 2. Instaciar un objeto Persona, refernecialo con p

		// 3. Accedo a los atributos
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());

		// 4. Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		System.out.println("--------------------");
		// 5. Accedo a los atributos
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());

		p2.setNombre("Angelina");

		System.out.println("*********");
		System.out.println("p1.nombre: " + p.getNombre());
		System.out.println("p2.nombre: " + p2.getNombre());
	}

}
