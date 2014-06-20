import java.sql.*;
import java.util.ArrayList;


public class PurposeNet
{
	static ArrayList<String> list  = new ArrayList<String>();
	static ArrayList<Object> list_object = new ArrayList<Object>();
	static ArrayList<Boolean> list_print  = new ArrayList<Boolean>();
	static ArrayList<String> list_artifact(Connection conn) throws SQLException
	{
		ResultSet rs;
		Statement st;
		ArrayList<String> al = new ArrayList<String>();
		String query = "Select ArtifactName from purposenet.purpose;";
		st = conn.createStatement();
		rs = st.executeQuery(query);
		String name = "ArtifactName";
		al = JDBC.resultSet2String(rs,name);
		return al;
	}
	static ArrayList<String> list_action(Connection conn) throws SQLException
	{
		ResultSet rs;
		Statement st;
		ArrayList<String> al = new ArrayList<String>();
		String query = "Select purpose from purposenet.purpose;";
		st = conn.createStatement();
		rs = st.executeQuery(query);
		String name = "purpose";
		al = JDBC.resultSet2String(rs,name);
		System.out.println(al.size());
		return al;
	}
	public static void print_name(String name, int n)
	{
		for(int i = 0; i < n; i++)
			System.out.print("\t");
		System.out.println(name);
	}
	static ArrayList<String> find_query(Connection conn, String arg, String col1, String col2, String table) throws SQLException
	{
		ResultSet rs;
		Statement st;
		ArrayList<String> al = new ArrayList<String>();
		if (col2.equals("ArtifactName") || col2.equals("ActionName"))
		{	
			String query="Select "+ col2 + " from " + conn.getCatalog() + "." + table + " where " + col1 +" like "+"'"+arg+"%'";
			//System.out.println(query);
			st = conn.createStatement();
			rs = st.executeQuery(query);
			al = JDBC.resultSet2String(rs , col2);
		}
		else
		{
			String query="Select "+ col2 +" from " + conn.getCatalog() + "." + table + " where " + col1 +"="+"'"+arg+"'";
			//System.out.println(query);
			st = conn.createStatement();
			rs = st.executeQuery(query);
			al = JDBC.resultSet2String(rs , col2);
		}
		return al;
	}
}
