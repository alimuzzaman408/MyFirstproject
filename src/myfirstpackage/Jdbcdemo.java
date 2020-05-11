package myfirstpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcdemo {

	public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/marsqlclass";
        String un="root";
        String pas="root";
		Connection con=DriverManager.getConnection(url,un,pas);
		Statement stmt=con.createStatement();
		//String s="insert into department values(50,'Caretaker')";
		//String s="update department set DepartmentName ='CEO' where DepartmentID=46;";
		//String s="delete from department where DepartmentID=46";
		String s="select * from department";
		//stmt.execute(s);
		ResultSet rs=stmt.executeQuery(s);
		while(rs.next()) {

			int dept=rs.getInt("DepartmentID");
			String dname=rs.getString("DepartmentName");
			System.out.println(dept+".........."+dname);


		}

		con.close();
		System.out.println("Program completed");


	}

}
