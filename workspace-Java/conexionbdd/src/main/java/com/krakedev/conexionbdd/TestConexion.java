package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TestConexion {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","12345678");
			System.out.println("conexion exitosa");
			ps=connection.prepareStatement("insert into personas (cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
					+ "	values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, "1710404490");
			ps.setString(2, "Sandra");
			ps.setString(3, "Amancha");
			ps.setString(4, "U");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.56);
			ps.setBigDecimal(7, new BigDecimal(1200.45));
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr="2020/03/22 10:05:04";
			try {
				Date fecha=sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis=fecha.getTime();
				System.out.println(fechaMilis);
				//crea un java.sqlDate, partiendo de una java.util.Date
				java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time timeSQL=new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(8,fechaSQL);
				ps.setTime(9,timeSQL);
				
				ps.executeUpdate();
				System.out.println("ejecuta insert");	
			} catch (ParseException e) {
				e.printStackTrace();
			}
			ps=connection.prepareStatement("insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento)"
					+ "	values(?,?,?,?,?)");
			ps.setString(1, "1735476810");
			ps.setString(2, "Sofia");
			ps.setString(3, "Jimenes");
			ps.setString(4, "SofiJz22@gmail.com");
			SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaSr="2001/01/22 10:05:04";
			try {
				Date fecha=sf.parse(fechaSr);
				System.out.println(fecha);
				long fechaMili=fecha.getTime();
				System.out.println(fechaMili);
				//crea un java.sqlDate, partiendo de una java.util.Date
				java.sql.Date fechaSQL=new java.sql.Date(fechaMili);
				System.out.println(fechaSQL);
				
				Time timeSQL=new Time(fechaMili);
				System.out.println(timeSQL);
				
				ps.setDate(5,fechaSQL);
				
				ps.executeUpdate();
				System.out.println("ejecuta insert");	
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
