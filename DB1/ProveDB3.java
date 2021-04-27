import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class ProveDB3 {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	    Connection con = null;

	    String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
	    String username = "root";
	    String password = "";
	    Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password);
		
		/*
		
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************");
		System.out.println("*****INSERIMENTO DATI*******");
		System.out.println("****************************");
		System.out.print("Prego inserire ID:");
		int id = sc.nextInt();
		System.out.print("Prego inserire Cognome:");
		String cognome = sc.next();
		System.out.print("Prego inserire Nome:");
		String nome = sc.next();
		
		PreparedStatement stmt=con.prepareStatement("insert into studenti values(?,?,?)");  
		
		stmt.setInt(1,id);//1 specifies the first parameter in the query  
		stmt.setString(2,cognome);
		stmt.setString(3,nome);
		
		int i=stmt.executeUpdate();
		
		System.out.println("\n -->" +i+" Record inseriti");  
		
		*/ 
		
		System.out.println("\n****************************");
		System.out.println("***** LETTURA  DATI  *******");
		System.out.println("****************************");
		
		Statement stmt2=con.createStatement(); 
		//stmt.executeUpdate("insert into studenti values(33,'Irfan','Ivan')"); 
		ResultSet rs=stmt2.executeQuery("select * from studenti order by id");  
		while(rs.next())  
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
	    
	    

	   
	  }
	}