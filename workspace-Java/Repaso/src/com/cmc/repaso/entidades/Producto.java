package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		if(precio < 0) {
			this.precio = precio*-1;
			System.out.println("Valor multiplicado por -1");
		}else {
			this.precio=precio;
		}
	}
	public double calcularPromo(double porcentajeDescuento) {
		if(porcentajeDescuento < 0) {
			porcentajeDescuento=0;
		}else if(porcentajeDescuento > 100) {
			porcentajeDescuento=100;
		}else {
			double descuento =(porcentajeDescuento / 100)*precio;
			return precio-descuento;
		}
		return porcentajeDescuento;
	}
	public Producto(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
}
