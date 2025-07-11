package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("Nombre de los productos actuales: " + nombre);
		System.out.println("Productos actuales: " + productosActuales);
		System.out.println("Productos vendidos: " + productosVendidos);
		System.out.println("Productos devueltos: " + productosDevueltos);
	}

	public void vender(int cantidad) {
		if (productosActuales >= cantidad) {
			productosActuales -= cantidad;
			productosVendidos += cantidad;
		}
	}
	public void devolver(int cantidad) {
		productosActuales +=cantidad;
		productosDevueltos +=cantidad;
		productosVendidos -=cantidad;
	}
}
