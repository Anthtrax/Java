package com.cmc.repaso.entidades;

public class Estudiantes {
	private String nombre;
	private double nota;
	private String resultado;
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public Estudiantes(String nombre) {
		this.nombre=nombre;
	}
	public String calificar(double nota) {
		this.nota=nota;
		if(nota<8) {
		this.resultado="F";
		}else if (nota>=8) {
		this.resultado="A";
		}
		return resultado;
	}
}
