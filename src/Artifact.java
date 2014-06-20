import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Artifact 
{
	String name;
	ArrayList<Action> birth;
	ArrayList<Action> destruction;
	ArrayList<Action> purpose;
	ArrayList<Action> first_time_setup;
	ArrayList<Action> subsequent_setup;
	ArrayList<Action> setup;
	ArrayList<Action> invagent;
	ArrayList<Action> invdestination;
	ArrayList<Action> invinstrument;
	ArrayList<Action> invlocation;
	ArrayList<Action> invpatient;
	ArrayList<Action> invproduct;
	ArrayList<Action> invsource;
	ArrayList<Action> invtheme;

	ArrayList<Artifact> core_component;
	ArrayList<Artifact> invcore_component;

	ArrayList<Artifact> non_purpose_serving_accessory;
	ArrayList<Artifact> invnon_purpose_serving_accessory;

	ArrayList<Artifact> purpose_serving_accessory;
	ArrayList<Artifact> invpurpose_serving_accessory;

	ArrayList<Artifact> subtype;
	ArrayList<Artifact> invsubtype;

	ArrayList<Artifact> instance;
	ArrayList<Artifact> invinstance;

	ArrayList<Artifact> accessory;
	ArrayList<Artifact> invaccessory;
	
	ArrayList<Artifact> component;
	ArrayList<Artifact> invcomponent;
	
	ArrayList<Artifact> naccessory;
	ArrayList<Artifact> invnaccessory;

	public void findbirth(Connection conn) throws ClassNotFoundException, SQLException
	{
		birth = new ArrayList<Action>();
		find_query(conn, name, birth, "ArtifactName", "birth", "birth");
	}
	public void finddestruction(Connection conn) throws ClassNotFoundException, SQLException
	{
		destruction = new ArrayList<Action>();
		find_query(conn, name, destruction, "ArtifactName", "destruction", "destruction");
	}
	public void findpurpose(Connection conn) throws ClassNotFoundException, SQLException
	{
		purpose = new ArrayList<Action>();
		find_query(conn, name, purpose, "ArtifactName", "purpose", "purpose");
	}
	public void findfirst_time_setup(Connection conn) throws ClassNotFoundException, SQLException
	{
		first_time_setup = new ArrayList<Action>();
		find_query(conn, name, first_time_setup, "ArtifactName", "first_time_setup", "first_time_setup");
	}
	public void findsubsequent_setup(Connection conn) throws ClassNotFoundException, SQLException
	{
		subsequent_setup = new ArrayList<Action>();
		find_query(conn, name, subsequent_setup, "ArtifactName", "subsequent_setup", "subsequent_setup");
	}
	public void findsetup(Connection conn) throws ClassNotFoundException, SQLException
	{
		setup = new ArrayList<Action>();
		find_query(conn, name, setup, "ArtifactName", "setup", "setup");
	}
	public void findinvagent(Connection conn, String agent_name) throws ClassNotFoundException, SQLException
	{
		invagent = new ArrayList<Action>();
		find_query(conn, agent_name, invagent ,"agent","ActionName","agent");
	}
	public void findinvdestination(Connection conn, String destination_name) throws ClassNotFoundException, SQLException
	{
		invdestination = new ArrayList<Action>();
		find_query(conn, destination_name, invdestination ,"destination","ActionName","destination");
	}
	public void findinvinstrument(Connection conn, String instrument_name) throws ClassNotFoundException, SQLException
	{
		invinstrument = new ArrayList<Action>();
		find_query(conn, instrument_name, invinstrument ,"instrument","ActionName","instrument");
	}
	public void findinvlocation(Connection conn, String location_name) throws ClassNotFoundException, SQLException
	{
		invlocation = new ArrayList<Action>();
		find_query(conn, location_name, invlocation ,"location","ActionName","location");
	}
	public void findinvpatient(Connection conn, String patient_name) throws ClassNotFoundException, SQLException
	{
		invpatient = new ArrayList<Action>();
		find_query(conn, patient_name, invpatient ,"patient","ActionName","patient");
	}

	public void findinvproduct(Connection conn, String product_name) throws ClassNotFoundException, SQLException
	{
		invproduct = new ArrayList<Action>();
		find_query(conn, product_name, invproduct ,"product","ActionName","product");
	}

	public void findinvsource(Connection conn, String source_name) throws ClassNotFoundException, SQLException
	{
		invsource = new ArrayList<Action>();
		find_query(conn, source_name, invsource ,"source","ActionName","source");
	}

	public void findinvtheme(Connection conn, String theme_name) throws ClassNotFoundException, SQLException
	{
		invtheme = new ArrayList<Action>();
		find_query(conn, theme_name, invtheme ,"theme","ActionName","theme");
	}


	public void findcore_component(Connection conn) throws ClassNotFoundException, SQLException
	{
		core_component = new ArrayList<Artifact>();
		find_query(conn, name, core_component, "ArtifactName", "core_component", "core_component");
	}
	public void findinvcore_component(Connection conn, String core_name) throws ClassNotFoundException, SQLException
	{
		invcore_component = new ArrayList<Artifact>();
		find_query(conn, core_name, invcore_component, "core_component", "ArtifactName", "core_component");
	}
	public void findnon_purpose_serving_accessory(Connection conn) throws ClassNotFoundException, SQLException
	{
		non_purpose_serving_accessory = new ArrayList<Artifact>();
		find_query(conn, name, non_purpose_serving_accessory, "ArtifactName", "non_purpose_serving_accessory", "non_purpose_serving_accessory");
	}
	public void findinvnon_purpose_serving_accessory(Connection conn, String npsa_name) throws ClassNotFoundException, SQLException
	{
		invnon_purpose_serving_accessory = new ArrayList<Artifact>();
		find_query(conn, npsa_name, invnon_purpose_serving_accessory, "non_purpose_serving_accessory", "ArtifactName", "non_purpose_serving_accessory");
	}
	public void findpurpose_serving_accessory(Connection conn) throws ClassNotFoundException, SQLException
	{
		purpose_serving_accessory = new ArrayList<Artifact>();
		find_query(conn, name, purpose_serving_accessory, "ArtifactName", "purpose_serving_accessory", "purpose_serving_accessory");
	}
	public void findinvpurpose_serving_accessory(Connection conn, String psa_name) throws ClassNotFoundException, SQLException
	{
		invpurpose_serving_accessory = new ArrayList<Artifact>();
		find_query(conn, psa_name, invpurpose_serving_accessory, "purpose_serving_accessory", "ArtifactName", "purpose_serving_accessory");
	}
	public void findsubtype(Connection conn) throws ClassNotFoundException, SQLException
	{
		subtype = new ArrayList<Artifact>();
		find_query(conn, name, subtype, "ArtifactName", "subtype", "subtype");
	}
	public void findinvsubtype(Connection conn, String subtype_name) throws SQLException
	{
		invsubtype = new ArrayList<Artifact>();
		find_query(conn, subtype_name, invsubtype ,"subtype", "ArtifactName","subtype");
	}
	public void findinstance(Connection conn) throws ClassNotFoundException, SQLException
	{
		instance = new ArrayList<Artifact>();
		find_query(conn, name, instance, "ArtifactName", "instance", "instance");
	}
	public void findinvinstance(Connection conn, String instance_name) throws SQLException
	{
		invinstance = new ArrayList<Artifact>();
		find_query(conn, instance_name, invinstance ,"instance", "ArtifactName","instance");
	}
	public void findcomponent(Connection conn) throws ClassNotFoundException, SQLException
	{
		component = new ArrayList<Artifact>();
		find_query(conn, name, component, "ArtifactName", "component", "component");
	}
	public void findinvcomponent(Connection conn, String core_name) throws ClassNotFoundException, SQLException
	{
		invcomponent = new ArrayList<Artifact>();
		find_query(conn, core_name, invcomponent, "component", "ArtifactName", "component");
	}
	public void findaccessory(Connection conn) throws ClassNotFoundException, SQLException
	{
		accessory = new ArrayList<Artifact>();
		find_query(conn, name, accessory, "ArtifactName", "accessory", "accessory");
	}
	public void findinvaccessory(Connection conn, String core_name) throws ClassNotFoundException, SQLException
	{
		invaccessory = new ArrayList<Artifact>();
		find_query(conn, core_name, invaccessory, "accessory", "ArtifactName", "accessory");
	}
	public void findnaccessory(Connection conn) throws ClassNotFoundException, SQLException
	{
		naccessory = new ArrayList<Artifact>();
		find_query(conn, name, naccessory, "ArtifactName", "naccessory", "naccessory");
	}
	public void findinvnaccessory(Connection conn, String core_name) throws ClassNotFoundException, SQLException
	{
		invnaccessory = new ArrayList<Artifact>();
		find_query(conn, core_name, invnaccessory, "naccessory", "ArtifactName", "naccessory");
	}
	



	private void find_query(Connection conn, String arg, ArrayList<?> attr, String col1, String col2, String table) throws SQLException
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
			convert_string(attr, col1, al);
		}
		else
		{
			String query="Select "+ col2 +" from " + conn.getCatalog() + "." + table + " where " + col1 +"="+"'"+arg+"'";
			//System.out.println(query);
			st = conn.createStatement();
			rs = st.executeQuery(query);
			al = JDBC.resultSet2String(rs , col2);
			convert_string(attr, col2, al);
		}
	}
	@SuppressWarnings("unchecked")
	private void convert_string(ArrayList<?> attr, String col, ArrayList<String> al) throws SQLException
	{
		if(col.equals("birth") || col.equals("destruction") || col.equals("purpose") || col.equals("agent") || col.equals("destination") || col.equals("location") || col.equals("patient") || col.equals("product") || col.equals("source") || col.equals("theme"))
			Action.string2action(al, col, (ArrayList<Action>) attr);
		else
			Artifact.string2artifact(al, col, (ArrayList<Artifact>) attr);
	}
	public void findallinfo(Connection conn) throws ClassNotFoundException, SQLException
	{
		this.findbirth(conn);
		this.finddestruction(conn);
		this.findpurpose(conn);
		this.findfirst_time_setup(conn);
		this.findsubsequent_setup(conn);
		this.findsetup(conn);
		this.findinvagent(conn, this.name);
		this.findinvdestination(conn, this.name);
		this.findinvinstrument(conn, this.name);
		this.findinvlocation(conn, this.name);
		this.findinvpatient(conn, this.name);
		this.findinvproduct(conn,this.name);
		this.findinvsource(conn, this.name);
		this.findinvtheme(conn, this.name);

		this.findcore_component(conn);
		this.findinvcore_component(conn, this.name);

		this.findnon_purpose_serving_accessory(conn);
		this.findinvnon_purpose_serving_accessory(conn, this.name);

		this.findpurpose_serving_accessory(conn);
		this.findinvpurpose_serving_accessory(conn, this.name);

		this.findsubtype(conn);
		this.findinvsubtype(conn, this.name);
		
		this.findcomponent(conn);
		this.findinvcomponent(conn, this.name);
		
		this.findaccessory(conn);
		this.findinvaccessory(conn, this.name);
		
		this.findnaccessory(conn);
		this.findinvnaccessory(conn, this.name);
	}
	public void leveltraverse(Connection conn, int levelorder) throws ClassNotFoundException, SQLException
	{
		//System.out.println(this.name + " " + levelorder);
		if(levelorder <= 0)
			return;
		if(levelorder == 1)
		{
			this.findallinfo(conn);
			return;
		}
		else
		{
			this.findallinfo(conn);
			if(birth != null)
			{
				for(int i = 0; i < birth.size(); i++)
					birth.get(i).leveltraverse(conn, levelorder-1);
			}
			if(destruction != null)
			{	
				for(int i = 0; i < destruction.size(); i++)
					destruction.get(i).leveltraverse(conn, levelorder-1);
			}
			if(purpose != null)
			{	
				for(int i = 0; i < purpose.size(); i++)
					purpose.get(i).leveltraverse(conn, levelorder-1);
			}
			if(first_time_setup != null)
			{	
				for(int i = 0; i < first_time_setup.size(); i++)
					first_time_setup.get(i).leveltraverse(conn, levelorder-1);
			}
			if(subsequent_setup != null)
			{	
				for(int i = 0; i < subsequent_setup.size(); i++)
					subsequent_setup.get(i).leveltraverse(conn, levelorder-1);
			}
			if(setup != null)
			{	
				for(int i = 0; i < setup.size(); i++)
					setup.get(i).leveltraverse(conn, levelorder-1);
			}

			if(invagent != null)
			{		
				for(int i = 0; i < invagent.size(); i++)
					invagent.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invdestination != null)
			{
				for(int i = 0; i < invdestination.size(); i++)
					invdestination.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invinstrument != null)
			{
				for(int i = 0; i < invinstrument.size(); i++)
					invinstrument.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invlocation != null)
			{
				for(int i = 0; i < invlocation.size(); i++)
					invlocation.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invpatient != null)
			{	
				for(int i = 0; i < invpatient.size(); i++)
					invpatient.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invproduct != null)
			{
				for(int i = 0; i < invproduct.size(); i++)
					invproduct.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invsource != null)
			{
				for(int i = 0; i < invsource.size(); i++)
					invsource.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invtheme != null)
			{
				for(int i = 0; i < invtheme.size(); i++)
					invtheme.get(i).leveltraverse(conn, levelorder-1);
			}
			if(core_component != null)
			{
				for(int i = 0; i < core_component.size(); i++)
					core_component.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invcore_component != null)
			{
				for(int i = 0; i < invcore_component.size(); i++)
					invcore_component.get(i).leveltraverse(conn, levelorder-1);
			}
			if(non_purpose_serving_accessory != null)
			{
				for(int i = 0; i < non_purpose_serving_accessory.size(); i++)
					non_purpose_serving_accessory.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invnon_purpose_serving_accessory != null)
			{
				for(int i = 0; i < invnon_purpose_serving_accessory.size(); i++)
					invnon_purpose_serving_accessory.get(i).leveltraverse(conn, levelorder-1);
			}

			if(purpose_serving_accessory != null)
			{
				for(int i = 0; i < purpose_serving_accessory.size(); i++)
					purpose_serving_accessory.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invpurpose_serving_accessory != null)
			{
				for(int i = 0; i < invpurpose_serving_accessory.size(); i++)
					invpurpose_serving_accessory.get(i).leveltraverse(conn, levelorder-1);
			}

			if(subtype != null)
			{
				for(int i = 0; i < subtype.size(); i++)
					subtype.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invsubtype != null)
			{
				for(int i = 0; i < invsubtype.size(); i++)
					invsubtype.get(i).leveltraverse(conn, levelorder-1);
			}
			
			if(component != null)
			{
				for(int i = 0; i < component.size(); i++)
					component.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invcomponent != null)
			{
				for(int i = 0; i < invcomponent.size(); i++)
					invcomponent.get(i).leveltraverse(conn, levelorder-1);
			}
			
			if(accessory != null)
			{
				for(int i = 0; i < accessory.size(); i++)
					accessory.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invaccessory != null)
			{
				for(int i = 0; i < invaccessory.size(); i++)
					invaccessory.get(i).leveltraverse(conn, levelorder-1);
			}
			
			if(naccessory != null)
			{
				for(int i = 0; i < naccessory.size(); i++)
					naccessory.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invnaccessory != null)
			{
				for(int i = 0; i < invnaccessory.size(); i++)
					invnaccessory.get(i).leveltraverse(conn, levelorder-1);
			}
		}
	}

	public static void string2artifact(ArrayList<String> al,String name, ArrayList<Artifact> list)  throws SQLException 
	{
		while (!al.isEmpty()) 
		{
			int ind = PurposeNet.list.indexOf(al.get(0));
			if(ind >= 0)
				list.add((Artifact) PurposeNet.list_object.get(ind));
			else
			{
				PurposeNet.list.add(al.get(0));
				Artifact temp = new Artifact();
				temp.name = al.get(0);
				list.add(temp);
				PurposeNet.list_object.add(temp);
				Boolean temp_bool = new Boolean(false);
				PurposeNet.list_print.add(temp_bool);
			}
			al.remove(0);
		}
	}

	public void print(int n)
	{
		PurposeNet.print_name(this.name, n);
		int ind = PurposeNet.list_object.indexOf(this);
		if(PurposeNet.list_print.size() > 0 && PurposeNet.list_print.get(ind).booleanValue() == false)
		{
			//PurposeNet.print_name(Integer.toString(n), n);
			Boolean temp = new Boolean(true);
			PurposeNet.list_print.remove(ind);
			PurposeNet.list_print.add(ind, temp);
			if(birth != null)
			{
				PurposeNet.print_name("--birth", n);
				for(int i = 0; i < birth.size(); i++)
					birth.get(i).print(n+1);
			}
			if(destruction != null)
			{	
				PurposeNet.print_name("--destruction", n);
				for(int i = 0; i < destruction.size(); i++)
					destruction.get(i).print(n+1);
			}
			if(purpose != null)
			{	
				PurposeNet.print_name("--purpose", n);
				for(int i = 0; i < purpose.size(); i++)
					purpose.get(i).print(n+1);
			}
			if(first_time_setup != null)
			{	
				PurposeNet.print_name("--first_time_setup", n);
				for(int i = 0; i < first_time_setup.size(); i++)
					first_time_setup.get(i).print(n+1);
			}
			if(subsequent_setup != null)
			{	
				PurposeNet.print_name("--subsequent_setup", n);
				for(int i = 0; i < subsequent_setup.size(); i++)
					subsequent_setup.get(i).print(n+1);
			}
			if(setup != null)
			{	
				PurposeNet.print_name("--setup", n);
				for(int i = 0; i < setup.size(); i++)
					setup.get(i).print(n+1);
			}

			if(invagent != null)
			{		
				PurposeNet.print_name("--invagent", n);
				for(int i = 0; i < invagent.size(); i++)
					invagent.get(i).print(n+1);
			}
			if(invdestination != null)
			{
				PurposeNet.print_name("--invdestination", n);
				for(int i = 0; i < invdestination.size(); i++)
					invdestination.get(i).print(n+1);
			}
			if(invinstrument != null)
			{
				PurposeNet.print_name("--invinstrument", n);
				for(int i = 0; i < invinstrument.size(); i++)
					invinstrument.get(i).print(n+1);
			}
			if(invlocation != null)
			{
				PurposeNet.print_name("--invlocation", n);
				for(int i = 0; i < invlocation.size(); i++)
					invlocation.get(i).print(n+1);
			}
			if(invpatient != null)
			{	
				PurposeNet.print_name("--invpatient", n);
				for(int i = 0; i < invpatient.size(); i++)
					invpatient.get(i).print(n+1);
			}
			if(invproduct != null)
			{
				PurposeNet.print_name("--invproduct", n);
				for(int i = 0; i < invproduct.size(); i++)
					invproduct.get(i).print(n+1);
			}
			if(invsource != null)
			{
				PurposeNet.print_name("--invsource", n);
				for(int i = 0; i < invsource.size(); i++)
					invsource.get(i).print(n+1);
			}
			if(invtheme != null)
			{
				PurposeNet.print_name("--invtheme", n);
				for(int i = 0; i < invtheme.size(); i++)
					invtheme.get(i).print(n+1);
			}
			if(core_component != null)
			{
				PurposeNet.print_name("--core_component", n);
				for(int i = 0; i < core_component.size(); i++)
					core_component.get(i).print(n+1);
			}
			if(invcore_component != null)
			{
				PurposeNet.print_name("--invcore_component", n);
				for(int i = 0; i < invcore_component.size(); i++)
					invcore_component.get(i).print(n+1);
			}
			if(non_purpose_serving_accessory != null)
			{
				PurposeNet.print_name("--non_purpose_serving_accessory", n);
				for(int i = 0; i < non_purpose_serving_accessory.size(); i++)
					non_purpose_serving_accessory.get(i).print(n+1);
			}
			if(invnon_purpose_serving_accessory != null)
			{
				PurposeNet.print_name("--invnon_purpose_serving_accessory", n);
				for(int i = 0; i < invnon_purpose_serving_accessory.size(); i++)
					invnon_purpose_serving_accessory.get(i).print(n+1);
			}

			if(purpose_serving_accessory != null)
			{
				PurposeNet.print_name("--purpose_serving_accessory", n);
				for(int i = 0; i < purpose_serving_accessory.size(); i++)
					purpose_serving_accessory.get(i).print(n+1);
			}
			if(invpurpose_serving_accessory != null)
			{
				PurposeNet.print_name("--invpurpose_serving_accessory", n);
				for(int i = 0; i < invpurpose_serving_accessory.size(); i++)
					invpurpose_serving_accessory.get(i).print(n+1);
			}

			if(subtype != null)
			{
				PurposeNet.print_name("--subtype", n);
				for(int i = 0; i < subtype.size(); i++)
					subtype.get(i).print(n+1);
			}
			if(invsubtype != null)
			{
				PurposeNet.print_name("--invsubtype", n);
				for(int i = 0; i < invsubtype.size(); i++)
					invsubtype.get(i).print(n+1);
			}
			
			if(component != null)
			{
				PurposeNet.print_name("--component", n);
				for(int i = 0; i < component.size(); i++)
					component.get(i).print(n+1);
			}
			if(invcomponent != null)
			{
				PurposeNet.print_name("--invcomponent", n);
				for(int i = 0; i < invcomponent.size(); i++)
					invcomponent.get(i).print(n+1);
			}
			
			if(accessory != null)
			{
				PurposeNet.print_name("--accessory", n);
				for(int i = 0; i < accessory.size(); i++)
					accessory.get(i).print(n+1);
			}
			if(invaccessory != null)
			{
				PurposeNet.print_name("--invaccessory", n);
				for(int i = 0; i < invaccessory.size(); i++)
					invaccessory.get(i).print(n+1);
			}
			
			if(naccessory != null)
			{
				PurposeNet.print_name("--naccessory", n);
				for(int i = 0; i < naccessory.size(); i++)
					naccessory.get(i).print(n+1);
			}
			if(invnaccessory != null)
			{
				PurposeNet.print_name("--invnaccessory", n);
				for(int i = 0; i < invnaccessory.size(); i++)
					invnaccessory.get(i).print(n+1);
			}
		}
		else
			return;
	}
}