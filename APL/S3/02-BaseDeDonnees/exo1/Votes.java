import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Votes {

  private int oui;
  private int non;
  private int x;
  private Connection co;

  public Votes() {
  	try {
  		Class.forName("org.mariadb.jdbc.Drive");
  	} catch (ClassNotFoundException e1){ 
    	System.out.println(e1.getMessage());		     
	}
  	this.oui=1;
  	this.non=1;
  	try {
	  	Connection co = DriverManager.getConnection(
	  		"jdbc:mariadb://dwarves.arda/wattelet",
	  		"wattelet", "444719");
	  		this.co=co;
	} catch (SQLException e2){ 
    	System.out.println(e2.getMessage());		     
	}
  
  }

  public void closeSQL() {
  	try {
  		this.co.close();
	} catch (SQLException e3){ 
    	System.out.println(e3.getMessage());		     
	}
  }

  public void addOui() {
    //this.oui++;
    add("oui");
  }

  public void addNon() {
    //this.non++;
    add("non");
  }

  public void add(String word) {
  	String query = "UPDATE Vote SET valeur = valeur + 1 where nom=?";
  	try {
  		PreparedStatement requete = this.co.prepareStatement(query);
  		requete.setString(1, word);
  		ResultSet res = requete.executeQuery();
  		requete.close();
	} catch (SQLException e4){ 
    	System.out.println(e4.getMessage());		     
	}
  }

  public int getProportion() {
  	String query = "SELECT valeur from Vote where nom=?";
  	try {
  		PreparedStatement requete = this.co.prepareStatement(query);

  		requete.setString(1, "oui");
  		ResultSet res = requete.executeQuery();
	  	res.first();
	  	this.oui=res.getInt(1);

  		requete.setString(1, "non");
  		res = requete.executeQuery();
	  	res.first();
	  	this.non=res.getInt(1);

  		requete.close();
	} catch (SQLException e4){ 
    	System.out.println(e4.getMessage());		     
	}
	x=(this.non*360)/(this.oui+this.non);
    return x;
  }
}