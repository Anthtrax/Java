package com.krakedev.inventario.entidades;

public class Categoria {
	private int codigo;
	private String nombre;
	
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
