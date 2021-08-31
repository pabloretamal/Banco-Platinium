package Paquete;

import java.sql.*;


public class Conexion {
	// Definir la ruta de la base de datos
	private String dbUrl = "jdbc:mysql://localhost:3306/admin";
	 // Definir el nombre de usuario de la base de datos
	private String dbUser = "root";
	 // Definir la contraseña de la base de datos
	private String dbPassword = "123456";
	 // Definir controlador de carga
	private String jdbcName = "com.mysql.jdbc.Driver";
 
	 // Conéctate a la base de datos
	public Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(jdbcName);
		} catch (Exception e) {
			 System.out.println ("¡Error al cargar el controlador!");
		}
		try {
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
		} catch (SQLException ex) {
			 System.out.println ("¡Error al conectarse a la base de datos!");
		}
		return conn;
	}
 
	 // prueba
	public static void main(String[] args) {
		// System.out.println(new DBHelper().getConn());
		 System.out.println ("¡Conectado exitosamente a la base de datos!");
	}
 
}

