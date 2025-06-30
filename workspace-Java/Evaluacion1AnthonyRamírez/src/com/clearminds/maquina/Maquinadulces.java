package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class Maquinadulces {
	private ArrayList<Celda> celdas = new ArrayList<>();
	private double saldo;

	public ArrayList<Celda> getCelda() {
		return celdas;
	}

	public void setCelda(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda codigo) {
		celdas.add(codigo);
	}

	public void mostrarConfiguracion() {
		Celda celda;
		for (int i = 0; i < celdas.size(); i++) {
			celda = celdas.get(i);
			System.out.println(celda.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda celda1 = null;
		Celda celda2;
		for (int i = 0; i < celdas.size(); i++) {
			celda2 = celdas.get(i);
			if (codigo.equals(celda2.getCodigo())) {
				celda1 = celda2;
			}
		}
		return celda1;
	}

	public void cargarProducto(Producto atributo, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(atributo, cantidad);
	}

	public void mostrarProducto() {
		Celda celda1;
		Producto celda2 = null;
		for (int i = 0; i < celdas.size(); i++) {
			celda1 = celdas.get(i);
			celda2 = celda1.getProducto();
			System.out.println("Celda: " + celda1.getCodigo() + " Stock: " + celda1.getStock());
			if (celda2 != null) {
				System.out.println("Producto: " + celda2.getNombre() + " Precio: " + celda2.getPrecio());
			} else {
				System.out.println("Sin producto asignado");
			}

		}
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Producto producto1 = null;
		Celda celda1 = null;
		for (int i = 0; i < celdas.size(); i++) {
			celda1 = celdas.get(i);
			if (codigo.equals(celda1.getCodigo())) {
				return producto1 = celda1.getProducto();
			}
		}
		return producto1;
	}

	public double consultarPrecio(String codigo) {
		Celda celda1=null;
		Producto producto1 = null;
		for (int i = 0; i < celdas.size(); i++) {
			celda1 = celdas.get(i);
			if (codigo.equals(celda1.getCodigo())) {
				producto1 = celda1.getProducto();
				return producto1.getPrecio();
			}
		}
		return 0.0;
	}

	public Celda BuscarCeldaProducto(String codigo) {
		Celda celda1 = null;
		Producto producto1;
		for (int i = 0; i < celdas.size(); i++) {
			celda1 = celdas.get(i);
			producto1 = celda1.getProducto();
			if (producto1 != null && codigo.equals(producto1.getCodigo())) {
				return celda1;
			}
		}
		return celda1;
	}
	public void incrementarProductos(String codigo,int items) {
		Celda celdaEncontrada=BuscarCeldaProducto(codigo);
			celdaEncontrada.setStock(items);
	}
	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		mostrarProducto();
		
	}
	public double venderConCambio(String codigo,double saldo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		mostrarProducto();
		double cambio = saldo - celdaEncontrada.getProducto().getPrecio();
		mostrarProducto();
		return cambio;
	}
	public ArrayList<Producto> BuscarMenores(double limite) {
		ArrayList<Producto> menores=new ArrayList<Producto>();
		Celda celda1=null;
		Producto producto1=null;
		for(int i=0;i<celdas.size();i++) {
			celda1=celdas.get(i);
			producto1=celda1.getProducto();
			if(producto1.getPrecio()<=limite) {
				menores.add(producto1);
			}
		}
		return menores;
	}
}