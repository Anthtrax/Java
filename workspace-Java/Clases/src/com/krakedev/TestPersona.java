package com.krakedev;

/*
 * Comentario de varias lineas
 * 
 * */
public class TestPersona {

	public static void main(String[] args) {
		Persona p;// 1. Declaro una variable llamada p de tipo Persona
		Persona p2 = new Persona();
		p = new Persona();// 2. Intaciar un objeto Persona, refernecialo con p

		// 3. Accedo a los atributos
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

		// 4. Modificar los atributos
		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.56;
		System.out.println("--------------------");
		// 5. Accedo a los atributos
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

		p2.nombre = "Angelina";

		System.out.println("*********");
		System.out.println("p1.nombre: " + p.nombre);
		System.out.println("p2.nombre: " + p2.nombre);
	}

}
