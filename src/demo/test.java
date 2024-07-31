package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class test {
	static final String DB_URL="jdbc:mysql://localhost/dbms_miniproject";
	static final String USER="root";
	static final String PASS="root123";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		int n=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to the database");
			
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt=conn.createStatement();

}catch(Exception e) {
	System.out.println(e);
	}
}
}
