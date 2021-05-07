package OkulExamples;

import java.sql.*;

public class CreateSchool {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
String yol = "jdbc:oracle:thin:@localhost:1521/xe"; // yolun bir string e esitledik, kolaylik olsun diye
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		Connection con = DriverManager.getConnection(yol, "hr", "hr");
		
		Statement st = con.createStatement();

	}

}
