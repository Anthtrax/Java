package com.krakedev.demo;

public class Producto {
	private int Codigo;
	private String Nombre;
	private String Descripcion;
	private double Peso;
	
	public Producto(String Nombre) {
		this.Nombre=Nombre;
	}
	
	public Producto(int Codigo) {
		this.Codigo=Codigo;
	}
	
	public Producto(int Codigo,String Nombre) {
		this.Nombre=Nombre;
		this.Codigo=Codigo;
	}
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	
	
}
