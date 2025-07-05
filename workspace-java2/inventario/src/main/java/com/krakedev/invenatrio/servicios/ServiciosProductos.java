package com.krakedev.invenatrio.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

public class ServiciosProductos {
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println(">>>>>>>"+producto);
	}
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto){
		System.out.println("ACTUALIZANDO PRODUCTO>>>>>>>"+producto);
	}
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public void recuperarTodo(){
		ArrayList<Producto> productos =new ArrayList<Producto>();
		Categoria categoria=new Categoria("Electronicos");
		productos.add(new Producto("P2458","Cable par trensado ",categoria,562.74,60));
		productos.add(new Producto("P2187","Cable UTP",categoria,265.74,80));
		productos.add(new Producto("P7895","CPU",categoria,785.46,10));
	
	}
}

