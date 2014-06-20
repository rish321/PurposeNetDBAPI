import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;


public class Test
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException, FileNotFoundException
	{
		JDBC jdbc = new JDBC();
		String url = "jdbc:mysql://127.0.0.1:3306/", dbName = "AC", username="rishabh", password = "mysql123";
		Connection conn = jdbc.createdbconn(url, dbName, username, password);
		Artifact at = new Artifact();
		//ArrayList<String> al = new ArrayList<String>();
		at.name = "mode_button";
		PurposeNet.list.add(at.name);
		PurposeNet.list_object.add(at);
		Boolean temp = new Boolean(false);
		PurposeNet.list_print.add(temp);
		at.leveltraverse(conn, 2);
		at.print(0);
		/*ArrayList<String> art = PurposeNet.list_artifact(conn);
		for(int i = 0; i < art.size(); i++)
		{
			if(!art.get(i).equals(""))
			{
				Artifact at_temp = new Artifact();
				at_temp.name = art.get(i);
				PurposeNet.list.add(at_temp.name);
				PurposeNet.list_object.add(at_temp);
				Boolean temp = new Boolean(false);
				PurposeNet.list_print.add(temp);
				at_temp.leveltraverse(conn, 1);
				PrintStream out = new PrintStream(new FileOutputStream(new File("/home/rishabh/Desktop/pnet/" + at_temp.name)));
				System.setOut(out);
				at_temp.print(0);
				PurposeNet.list.clear();
				PurposeNet.list_object.clear();
				PurposeNet.list_print.clear();
			}	
		}
		ArrayList<String> an = PurposeNet.list_action(conn);
		for(int i = 0; i < an.size(); i++)
		{
			if(!an.get(i).equals(""))
			{
				Action an_temp = new Action();
				an_temp.name = an.get(i);
				PurposeNet.list.add(an_temp.name);
				PurposeNet.list_object.add(an_temp);
				Boolean temp = new Boolean(false);
				PurposeNet.list_print.add(temp);
				an_temp.leveltraverse(conn, 1);
				PrintStream out = new PrintStream(new FileOutputStream(new File("/home/rishabh/Desktop/pnet/" + an_temp.name)));
				System.setOut(out);
				an_temp.print(0);
				PurposeNet.list.clear();
				PurposeNet.list_object.clear();
				PurposeNet.list_print.clear();
			}
			
		}*/
		//al = PurposeNet.list_artifact(conn);



		//		Action an = new Action();
		//		ArrayList<String> action = new ArrayList<String>();
		//		
		//		an.name = "Transport_using_car";
		//		an.leveltraverse(conn, 1);
		//		
		//System.out.println(al);
		jdbc.closeConnection(conn);
	}
}
