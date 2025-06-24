package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiantes;

public class TestEstudiantes {

	public static void main(String[] args) {
		Estudiantes estudiante=new Estudiantes("Anthony");
		estudiante.calificar(7);
		System.out.println(estudiante.getResultado());
	}

}
