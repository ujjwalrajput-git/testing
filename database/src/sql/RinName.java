package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RinName {
public static void main(String[] args) throws SQLException {
	
	String url = "jdbc:sqlserver://10206-TZD-TRNG:1433;databaseName=nov;integratedSecurity=true;encrypt=false;trustServerCertificate=true";
	
	Connection conn = DriverManager.getConnection(url);
	Statement start = conn.createStatement();
	
	String query = "SELECT * FROM employee WHERE empName LIKE ?";
	PreparedStatement prep = conn.prepareStatement(query);
	prep.setString(1, "%j%");
	
	ResultSet result = prep.executeQuery();
	
	while(result.next()) {
		System.out.println(result.getInt("empid")+" "+result.getString("empname"));
	}
	
	
	
}
}
