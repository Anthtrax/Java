package com.krakedev.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConexionBDD {
	public static Connection obtenerConexion() {
		Context ctx = null;
		DataSource ds = null;
		Connection con = null;
		try {
			ctx = new InitialContext();
			// JNDI
			ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/ConexionPG");
			try {
				con = ds.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (NamingException e) {
			e.printStackTrace();
		}
		return con;
	}
}
