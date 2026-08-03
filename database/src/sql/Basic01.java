package sql;

import java.sql.*;

public class Basic01 {
	public static void main(String[] args) throws SQLException {
		
		
		String url = "jdbc:sqlserver://10206-TZD-TRNG:1433;databaseName=coforge;integratedSecurity=true;encrypt=false;trustServerCertificate=true";
		
		Connection conn = DriverManager.getConnection(url);
		Statement start = conn.createStatement();
		//int row = start.executeUpdate("insert into employee values (109,'mayank')");
		ResultSet result = start.executeQuery("select * from employee");

		while(result.next()) {
			System.out.println(result.getInt("empid")+" "+result.getString("empname"));
		}
		
		
	}
}
