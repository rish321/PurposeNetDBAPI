import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Action 
{
	String name;
	ArrayList<Artifact> agent;
	ArrayList<Artifact> destination;
	ArrayList<Artifact> instrument;
	ArrayList<Artifact> location;
	ArrayList<Artifact> patient;
	ArrayList<Artifact> product;
	ArrayList<Artifact> source;
	ArrayList<Artifact> theme;
	ArrayList<Artifact> invbirth;
	ArrayList<Artifact> invdestruction;
	ArrayList<Artifact> invpurpose;
	ArrayList<Artifact> invfirst_time_setup;
	ArrayList<Artifact> invsubsequent_setup;
	ArrayList<Artifact> invsetup;
	ArrayList<Action> precondition;
	ArrayList<Action> invprecondition;
	ArrayList<Action> subaction;
	ArrayList<Action> invsubaction;
	ArrayList<Action> outcome;
	ArrayList<Action> invoutcome;
	ArrayList<Action> result;
	ArrayList<Action> invresult;	
	ArrayList<Action> sideeffect;
	ArrayList<Action> invsideeffect;
	ArrayList<Action> wear_and_tear;
	ArrayList<Action> invwear_and_tear;
	ArrayList<Action> general_maintenance;
	ArrayList<Action> invgeneral_maintenance;
	ArrayList<Action> repair_maintenance;
	ArrayList<Action> invrepair_maintenance;
	ArrayList<Action> maintenance;
	ArrayList<Action> invmaintenance;


	public void findagent(Connection conn) throws ClassNotFoundException, SQLException
	{
		agent = new ArrayList<Artifact>();
		find_query(conn, name , agent ,"ActionName","agent","agent");
	}
	public void finddestination(Connection conn) throws ClassNotFoundException, SQLException
	{
		destination = new ArrayList<Artifact>();
		find_query(conn, name , destination ,"ActionName","destination","destination");
	}

	public void findinstrument(Connection conn) throws ClassNotFoundException, SQLException
	{
		instrument = new ArrayList<Artifact>();
		find_query(conn, name , instrument ,"ActionName","instrument","instrument");
	}
	public void findlocation(Connection conn) throws ClassNotFoundException, SQLException
	{
		location = new ArrayList<Artifact>();
		find_query(conn, name , location ,"ActionName","location","location");
	}

	public void findpatient(Connection conn) throws ClassNotFoundException, SQLException
	{
		patient = new ArrayList<Artifact>();
		find_query(conn, name , patient ,"ActionName","patient","patient");
	}
	public void findproduct(Connection conn) throws ClassNotFoundException, SQLException
	{
		product = new ArrayList<Artifact>();
		find_query(conn, name , product ,"ActionName","product","product");
	}
	public void findsource(Connection conn) throws ClassNotFoundException, SQLException
	{
		source = new ArrayList<Artifact>();
		find_query(conn, name , source ,"ActionName","source","source");
	}
	public void findtheme(Connection conn) throws ClassNotFoundException, SQLException
	{
		theme = new ArrayList<Artifact>();
		find_query(conn, name , theme ,"ActionName","theme","theme");
	}
	public void findinvbirth(Connection conn, String birth_name) throws ClassNotFoundException, SQLException
	{
		invbirth = new ArrayList<Artifact>();
		find_query(conn, birth_name, invbirth, "birth", "ArtifactName", "birth");
	}
	public void findinvdestruction(Connection conn, String birth_name) throws ClassNotFoundException, SQLException
	{
		invdestruction = new ArrayList<Artifact>();
		find_query(conn, birth_name, invdestruction, "destruction", "ArtifactName", "destruction");
	}
	public void findinvpurpose(Connection conn, String purpose_name) throws ClassNotFoundException, SQLException
	{
		invpurpose = new ArrayList<Artifact>();
		find_query(conn, purpose_name, invpurpose, "purpose", "ArtifactName" , "purpose");
	}
	public void findinvfirst_time_setup(Connection conn, String first_time_setup_name) throws ClassNotFoundException, SQLException
	{
		invfirst_time_setup = new ArrayList<Artifact>();
		find_query(conn, first_time_setup_name, invfirst_time_setup, "first_time_setup", "ArtifactName" , "first_time_setup");
	}
	public void findinvsubsequent_setup(Connection conn, String general_setup_name) throws ClassNotFoundException, SQLException
	{
		invsubsequent_setup = new ArrayList<Artifact>();
		find_query(conn, general_setup_name, invsubsequent_setup, "subsequent_setup", "ArtifactName" , "subsequent_setup");
	}
	public void findinvsetup(Connection conn, String setup_name) throws ClassNotFoundException, SQLException
	{
		invsetup = new ArrayList<Artifact>();
		find_query(conn, setup_name, invsetup, "setup", "ArtifactName" , "setup");
	}

	public void findprecondition(Connection conn) throws ClassNotFoundException, SQLException
	{
		precondition = new ArrayList<Action>();
		find_query(conn, name , precondition ,"ActionName","precondition","precondition");
	}
	public void findinvprecondition(Connection conn, String precondition_name) throws ClassNotFoundException, SQLException
	{
		invprecondition = new ArrayList<Action>();
		find_query(conn, precondition_name, invprecondition ,"precondition","ActionName","precondition");
	}

	public void findsubaction(Connection conn) throws ClassNotFoundException, SQLException
	{
		subaction= new ArrayList<Action>();
		find_query(conn, name , subaction ,"ActionName","subaction","subaction");
	}
	public void findinvsubaction(Connection conn, String subaction_name) throws ClassNotFoundException, SQLException
	{
		invsubaction = new ArrayList<Action>();
		find_query(conn, subaction_name, invsubaction ,"subaction","ActionName","subaction");
	}

	public void findoutcome(Connection conn) throws ClassNotFoundException, SQLException
	{
		outcome= new ArrayList<Action>();
		find_query(conn, name , outcome ,"ActionName","outcome","outcome");
	}
	public void findinvoutcome(Connection conn, String outcome_name) throws ClassNotFoundException, SQLException
	{
		invoutcome = new ArrayList<Action>();
		find_query(conn, outcome_name, invoutcome ,"outcome","ActionName","outcome");
	}

	public void findresult(Connection conn) throws ClassNotFoundException, SQLException
	{
		result = new ArrayList<Action>();
		find_query(conn, name , result ,"ActionName","result","result");
	}
	public void findinvresult(Connection conn, String result_name) throws ClassNotFoundException, SQLException
	{
		invresult = new ArrayList<Action>();
		find_query(conn, result_name, invresult ,"result","ActionName","result");
	}

	public void findsideeffect(Connection conn) throws ClassNotFoundException, SQLException
	{
		sideeffect = new ArrayList<Action>();
		find_query(conn, name , sideeffect ,"ActionName","sideeffect","sideeffect");
	}
	public void findinvsideeffect(Connection conn, String sideeffect_name) throws ClassNotFoundException, SQLException
	{
		invsideeffect = new ArrayList<Action>();
		find_query(conn, sideeffect_name, invsideeffect ,"sideeffect","ActionName","sideeffect");
	}

	public void findwear_and_tear(Connection conn) throws ClassNotFoundException, SQLException
	{
		wear_and_tear = new ArrayList<Action>();
		find_query(conn, name , wear_and_tear ,"ActionName","wear_and_tear","wear_and_tear");
	}
	public void findinvwear_and_tear(Connection conn, String wearandtear_name) throws ClassNotFoundException, SQLException
	{
		invwear_and_tear = new ArrayList<Action>();
		find_query(conn, wearandtear_name, invwear_and_tear ,"wear_and_tear","ActionName","wear_and_tear");
	}

	public void findgeneral_maintenance(Connection conn) throws ClassNotFoundException, SQLException
	{
		general_maintenance = new ArrayList<Action>();
		find_query(conn, name , general_maintenance ,"ActionName","general_maintenance","general_maintenance");
	}
	public void findinvgeneral_maintenance(Connection conn, String wearandtear_name) throws ClassNotFoundException, SQLException
	{
		invgeneral_maintenance = new ArrayList<Action>();
		find_query(conn, wearandtear_name, invgeneral_maintenance ,"general_maintenance","ActionName","general_maintenance");
	}

	public void findrepair_maintenance(Connection conn) throws ClassNotFoundException, SQLException
	{
		repair_maintenance = new ArrayList<Action>();
		find_query(conn, name , repair_maintenance ,"ActionName","repair_maintenance","repair_maintenance");
	}
	public void findinvrepair_maintenance(Connection conn, String wearandtear_name) throws ClassNotFoundException, SQLException
	{
		invrepair_maintenance = new ArrayList<Action>();
		find_query(conn, wearandtear_name, invrepair_maintenance ,"repair_maintenance","ActionName","repair_maintenance");
	}

	public void findmaintenance(Connection conn) throws ClassNotFoundException, SQLException
	{
		maintenance = new ArrayList<Action>();
		find_query(conn, name , maintenance ,"ActionName","maintenance","maintenance");
	}
	public void findinvmaintenance(Connection conn, String wearandtear_name) throws ClassNotFoundException, SQLException
	{
		invmaintenance = new ArrayList<Action>();
		find_query(conn, wearandtear_name, invmaintenance ,"maintenance","ActionName","maintenance");
	}

	private void find_query(Connection conn, String arg, ArrayList<?> attr, String col1, String col2, String table) throws SQLException
	{
		ResultSet rs;
		Statement st;
		ArrayList<String> al = new ArrayList<String>();
		if (col2.equals("ActionName") || col2.equals("ArtifactName"))
		{	

			String query="Select "+ col2 +" from " + conn.getCatalog() + "." + table + " where  " +  col1  +"  like  "+"'" +arg+"%' ";
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
	public void convert_string(ArrayList<?> attr, String col, ArrayList<String> al) throws SQLException
	{
		if(col.equals("birth") || col.equals("purpose") || col.equals("destruction") || col.equals("agent") || col.equals("destination") || col.equals("instrument") || col.equals("location") || col.equals("patient") || col.equals("product") || col.equals("source") || col.equals("theme"))
			Artifact.string2artifact(al, col, (ArrayList<Artifact>) attr);
		else
			Action.string2action(al, col, (ArrayList<Action>) attr);
	}

	public void findallinfo(Connection conn) throws ClassNotFoundException, SQLException
	{
		this.findagent(conn);
		this.finddestination(conn);
		this.findinstrument(conn);
		this.findlocation(conn);
		this.findpatient(conn);
		this.findproduct(conn);
		this.findsource(conn);
		this.findtheme(conn);
		this.findinvbirth(conn, this.name);
		this.findinvpurpose(conn, this.name);
		this.findinvfirst_time_setup(conn, this.name);
		this.findinvsubsequent_setup(conn, this.name);
		this.findinvsetup(conn, this.name);

		this.findprecondition(conn);
		this.findinvprecondition(conn, this.name);

		this.findsubaction(conn);
		this.findinvsubaction(conn, this.name);

		this.findoutcome(conn);
		this.findinvoutcome(conn, this.name);

		this.findresult(conn);
		this.findinvresult(conn, this.name);

		this.findsideeffect(conn);
		this.findinvsideeffect(conn, this.name);

		this.findwear_and_tear(conn);
		this.findinvwear_and_tear(conn, this.name);

		this.findgeneral_maintenance(conn);
		this.findinvgeneral_maintenance(conn, this.name);

		this.findrepair_maintenance(conn);
		this.findinvrepair_maintenance(conn, this.name);

		this.findmaintenance(conn);
		this.findinvmaintenance(conn, this.name);
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
			if(agent != null)
			{
				for(int i =0 ; i < agent.size() ;i++)
					agent.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(destination != null)
			{
				for(int i =0 ; i < destination.size() ;i++)
					destination.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(instrument != null)
			{
				for(int i =0 ; i < instrument.size() ;i++)
					instrument.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(location != null)
			{
				for(int i =0 ; i < location.size() ;i++)
					location.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(patient != null)
			{
				for(int i =0 ; i < patient.size() ;i++)
					patient.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(product != null)
			{
				for(int i =0 ; i < product.size() ;i++)
					product.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(source != null)
			{
				for(int i =0 ; i < source.size() ;i++)
					source.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(theme != null)
			{
				for(int i =0 ; i < theme.size() ;i++)
					theme.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invbirth != null)
			{
				for(int i =0 ; i < invbirth.size() ;i++)
					invbirth.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invpurpose != null)
			{
				for(int i =0 ; i < invpurpose.size() ;i++)
					invpurpose.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invfirst_time_setup != null)
			{
				for(int i =0 ; i < invfirst_time_setup.size() ;i++)
					invfirst_time_setup.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invsubsequent_setup != null)
			{
				for(int i =0 ; i < invsubsequent_setup.size() ;i++)
					invsubsequent_setup.get(i).leveltraverse(conn, levelorder-1);
			}
			if(invsetup != null)
			{
				for(int i =0 ; i < invsetup.size() ;i++)
					invsetup.get(i).leveltraverse(conn, levelorder-1);
			}

			if(precondition != null)
			{
				for(int i =0 ; i < precondition.size() ;i++)
					precondition.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(invprecondition != null)
			{
				for(int i =0 ; i < invprecondition.size() ;i++)
					invprecondition.get(i).leveltraverse(conn, levelorder-1);
			}	

			if(subaction != null)
			{
				for(int i =0 ; i < subaction.size() ;i++)
					subaction.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(invsubaction != null)
			{
				for(int i =0 ; i < invsubaction.size() ;i++)
					invsubaction.get(i).leveltraverse(conn, levelorder-1);
			}	

			if(outcome != null)
			{
				for(int i =0 ; i < outcome.size() ;i++)
					outcome.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(invoutcome != null)
			{
				for(int i =0 ; i < invoutcome.size() ;i++)
					invoutcome.get(i).leveltraverse(conn, levelorder-1);
			}	

			if(result != null)
			{
				for(int i =0 ; i < result.size() ;i++)
					result.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(invresult != null)
			{
				for(int i =0 ; i < invresult.size() ;i++)
					invresult.get(i).leveltraverse(conn, levelorder-1);
			}

			if(sideeffect != null)
			{
				for(int i =0 ; i < sideeffect.size() ;i++)
					sideeffect.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(invsideeffect != null)
			{
				for(int i =0 ; i < invsideeffect.size() ;i++)
					invsideeffect.get(i).leveltraverse(conn, levelorder-1);
			}	

			if(wear_and_tear != null)
			{
				for(int i =0 ; i < wear_and_tear.size() ;i++)
					wear_and_tear.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(invwear_and_tear != null)
			{
				for(int i =0 ; i < invwear_and_tear.size() ;i++)
					invwear_and_tear.get(i).leveltraverse(conn, levelorder-1);
			}	

			if(general_maintenance != null)
			{
				for(int i =0 ; i < general_maintenance.size() ;i++)
					general_maintenance.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(invgeneral_maintenance != null)
			{
				for(int i =0 ; i < invgeneral_maintenance.size() ;i++)
					invgeneral_maintenance.get(i).leveltraverse(conn, levelorder-1);
			}

			if(repair_maintenance != null)
			{
				for(int i =0 ; i < repair_maintenance.size() ;i++)
					repair_maintenance.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(invrepair_maintenance != null)
			{
				for(int i =0 ; i < invrepair_maintenance.size() ;i++)
					invrepair_maintenance.get(i).leveltraverse(conn, levelorder-1);
			}

			if(maintenance != null)
			{
				for(int i =0 ; i < maintenance.size() ;i++)
					maintenance.get(i).leveltraverse(conn, levelorder-1);
			}	
			if(invmaintenance != null)
			{
				for(int i =0 ; i < invmaintenance.size() ;i++)
					invmaintenance.get(i).leveltraverse(conn, levelorder-1);
			}

		}
	}
	public static void string2action(ArrayList<String> al, String name, ArrayList<Action> list)  throws SQLException 
	{
		while (!al.isEmpty()) 
		{
			int ind = PurposeNet.list.indexOf(al.get(0));
			if(ind >= 0)
			{
				//System.out.println(al.get(0) + " " + ind + " "  + name);
				list.add((Action) PurposeNet.list_object.get(ind));
			}
			else
			{
				PurposeNet.list.add(al.get(0));
				Action temp = new Action();
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
			//PurposeNet.print_name(Boolean.toString(agent == null), n);
			Boolean temp = new Boolean(true);
			PurposeNet.list_print.remove(ind);
			PurposeNet.list_print.add(ind, temp);
			if(agent != null)
			{
				PurposeNet.print_name("--agent", n);
				for(int i =0 ; i < agent.size() ;i++)
					agent.get(i).print(n+1);
			}	
			if(destination != null)
			{
				PurposeNet.print_name("--destination", n);
				for(int i =0 ; i < destination.size() ;i++)
					destination.get(i).print(n+1);
			}	
			if(instrument != null)
			{
				PurposeNet.print_name("--instrument", n);
				for(int i =0 ; i < instrument.size() ;i++)
					instrument.get(i).print(n+1);
			}	
			if(location != null)
			{
				PurposeNet.print_name("--location", n);
				for(int i =0 ; i < location.size() ;i++)
					location.get(i).print(n+1);
			}	
			if(patient != null)
			{
				PurposeNet.print_name("--patient", n);
				for(int i =0 ; i < patient.size() ;i++)
					patient.get(i).print(n+1);
			}	
			if(product != null)
			{
				PurposeNet.print_name("--product", n);
				for(int i =0 ; i < product.size() ;i++)
					product.get(i).print(n+1);
			}	
			if(source != null)
			{
				PurposeNet.print_name("--source", n);
				for(int i =0 ; i < source.size() ;i++)
					source.get(i).print(n+1);
			}	
			if(theme != null)
			{
				PurposeNet.print_name("--theme", n);
				for(int i =0 ; i < theme.size() ;i++)
					theme.get(i).print(n+1);
			}
			if(invbirth != null)
			{
				PurposeNet.print_name("--invbirth", n);
				for(int i =0 ; i < invbirth.size() ;i++)
					invbirth.get(i).print(n+1);
			}
			if(invpurpose != null)
			{
				PurposeNet.print_name("--invpurpose", n);
				for(int i =0 ; i < invpurpose.size() ;i++)
					invpurpose.get(i).print(n+1);
			}
			if(invfirst_time_setup != null)
			{
				PurposeNet.print_name("--invfirst_time_setup", n);
				for(int i =0 ; i < invfirst_time_setup.size() ;i++)
					invfirst_time_setup.get(i).print(n+1);
			}
			if(invsubsequent_setup != null)
			{
				PurposeNet.print_name("--invsubsequent_setup", n);
				for(int i =0 ; i < invsubsequent_setup.size() ;i++)
					invsubsequent_setup.get(i).print(n+1);
			}
			if(invsetup != null)
			{
				PurposeNet.print_name("--invsetup", n);
				for(int i =0 ; i < invsetup.size() ;i++)
					invsetup.get(i).print(n+1);
			}

			if(precondition != null)
			{
				PurposeNet.print_name("--precondition", n);
				for(int i =0 ; i < precondition.size() ;i++)
					precondition.get(i).print(n+1);
			}	
			if(invprecondition != null)
			{
				PurposeNet.print_name("--invprecondition", n);
				for(int i =0 ; i < invprecondition.size() ;i++)
					invprecondition.get(i).print(n+1);
			}	

			if(subaction != null)
			{
				PurposeNet.print_name("--subaction", n);
				for(int i =0 ; i < subaction.size() ;i++)
					subaction.get(i).print(n+1);
			}	
			if(invsubaction != null)
			{
				PurposeNet.print_name("--invsubaction", n);
				for(int i =0 ; i < invsubaction.size() ;i++)
					invsubaction.get(i).print(n+1);
			}	

			if(outcome != null)
			{
				PurposeNet.print_name("--outcome", n);
				for(int i =0 ; i < outcome.size() ;i++)
					outcome.get(i).print(n+1);
			}	
			if(invoutcome != null)
			{
				PurposeNet.print_name("--invoutcome", n);
				for(int i =0 ; i < invoutcome.size() ;i++)
					invoutcome.get(i).print(n+1);
			}	

			if(result != null)
			{
				PurposeNet.print_name("--result", n);
				for(int i =0 ; i < result.size() ;i++)
					result.get(i).print(n+1);
			}	
			if(invresult != null)
			{
				PurposeNet.print_name("--invresult", n);
				for(int i =0 ; i < invresult.size() ;i++)
					invresult.get(i).print(n+1);
			}

			if(sideeffect != null)
			{
				PurposeNet.print_name("--sideeffect", n);
				for(int i =0 ; i < sideeffect.size() ;i++)
					sideeffect.get(i).print(n+1);
			}
			if(invsideeffect != null)
			{
				PurposeNet.print_name("--invsideeffect", n);
				for(int i =0 ; i < invsideeffect.size() ;i++)
					invsideeffect.get(i).print(n+1);
			}

			if(wear_and_tear != null)
			{
				PurposeNet.print_name("--wear_and_tear", n);
				for(int i =0 ; i < wear_and_tear.size() ;i++)
					wear_and_tear.get(i).print(n+1);
			}	
			if(invwear_and_tear != null)
			{
				PurposeNet.print_name("--invwear_and_tear", n);
				for(int i =0 ; i < invwear_and_tear.size() ;i++)
					invwear_and_tear.get(i).print(n+1);
			}
			
			if(general_maintenance != null)
			{
				PurposeNet.print_name("--general_maintenance", n);
				for(int i =0 ; i < general_maintenance.size() ;i++)
					general_maintenance.get(i).print(n+1);
			}	
			if(invgeneral_maintenance != null)
			{
				PurposeNet.print_name("--invgeneral_maintenance", n);
				for(int i =0 ; i < invgeneral_maintenance.size() ;i++)
					invgeneral_maintenance.get(i).print(n+1);
			}
			
			if(repair_maintenance != null)
			{
				PurposeNet.print_name("--repair_maintenance", n);
				for(int i =0 ; i < repair_maintenance.size() ;i++)
					repair_maintenance.get(i).print(n+1);
			}	
			if(invrepair_maintenance != null)
			{
				PurposeNet.print_name("--invrepair_maintenance", n);
				for(int i =0 ; i < invrepair_maintenance.size() ;i++)
					invrepair_maintenance.get(i).print(n+1);
			}
			
			if(maintenance != null)
			{
				PurposeNet.print_name("--maintenance", n);
				for(int i =0 ; i < maintenance.size() ;i++)
					maintenance.get(i).print(n+1);
			}	
			if(invmaintenance != null)
			{
				PurposeNet.print_name("--invmaintenance", n);
				for(int i =0 ; i < invmaintenance.size() ;i++)
					invmaintenance.get(i).print(n+1);
			}
		}
		else
			return;
	}
}
