import java.sql.*;
import java.util.*;
public class JDBC
{

	public static ArrayList<String> resultSet2String(ResultSet rs , String name) throws SQLException 
	{
		ArrayList<String> al = new ArrayList<String>();
		//System.out.println(name);
		while (rs.next()) 
		{
			//System.out.println(rs.getString(1));
			String data = rs.getString(name);
			//System.out.println(data);
			if(data.endsWith("\r") || data.endsWith("\n"))
				data = data.substring(0, data.length()-1);
			al.add(data);
			
		}
		return al;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		JDBC jdbc = new JDBC();
		String url = "jdbc:mysql://127.0.0.1:3306/", dbName = "purposenet", username="rishabh", password = "mysql123";
		Connection conn = jdbc.createdbconn(url, dbName, username, password);
		
//		Artifact at = new Artifact();
//		at.name= "Car";
//		at.leveltraverse(conn , 1);
//		at.print(0);
		jdbc.closeConnection(conn);
	}
	public void closeConnection(Connection conn) throws SQLException
	{
		conn.close();
	}
	public Connection createdbconn(String url, String dbName, String userName, String password) throws ClassNotFoundException, SQLException
	{
		Connection conn;
		String driver = "com.mysql.jdbc.Driver";
		Class.forName(driver);
		conn = DriverManager.getConnection(url+dbName,userName,password);
		return conn;
	}
	
	
}