package com.krakedev.presistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	private static final Logger LOGGER=LogManager.getLogger(ConexionBDD.class);
	private final static String DRIVER="org.postgresql.Driver";
	private final static  String URL="jdbc:postgresql://localhost:5432/postgres";
	private final static String USUARIO="postgres";
	private final static String CLAVE="12345678";
	
	public static Connection conectar() throws Exception{
		Connection connection=null;
		try {
			Class.forName(DRIVER);
			connection=DriverManager.getConnection(URL,USUARIO,CLAVE);
			LOGGER.debug("conexion exitosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la infraestructura",e);
			throw new Exception("Error en la infraestructura");
		} catch (SQLException e) {
			LOGGER.error("Error al conectarse, revirse usuario y clave",e);
			throw new Exception("Error al conectarse, revirse usuario y clave");
		}
		return connection;
	}
}
