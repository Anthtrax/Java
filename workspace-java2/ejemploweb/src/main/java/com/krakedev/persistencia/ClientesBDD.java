package com.krakedev.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.krakedev.entidades.Cliente;
import com.krakedev.utils.ConexionBDD;

public class ClientesBDD {
	public void insertar(Cliente cliente) {
		Connection con=ConexionBDD.obtenerConexion();
		try {
			PreparedStatement ps=
		con.prepareStatement("insert into clientes(cedula,nombre,numeroHijos) values(?,?,?)");
			ps.setString(1, cliente.getCedula());
			ps.setString(2, cliente.getNombre());
			ps.setInt(3, cliente.getNumeroHijos());
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
