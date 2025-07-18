package com.krakedev;

public class Productos {
	private String nombre;
	private String descripcion;
	private double precio;
	private int stockActual;
	
	public Productos(String nombre) {
		this.nombre=nombre;
	}
	public Productos(String nombre,String descripcion) {
		this.nombre=nombre;
		this.descripcion=descripcion;
	}
	public Productos(String nombre,String descripcion,double precio) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.precio=precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStockActual() {
		return stockActual;
	}
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
	
	
}
