package projetjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import javax.swing.JOptionPane;

public class JDBC {
	static String pilote="com.mysql.jdbc.Driver";
	static String url="jdbc:mysql://localhost:8889/test";
	static String user="root";
	static String mdp ="root";
	
	static Connection connexion = null;
	static Statement st =null;
	static PreparedStatement ps=null;
	static ResultSet rs =null;

	public static void getConnexion(){
		try {
			System.out.println("Connexion à la BD ...");
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection(url, user, mdp);
			System.out.println("Connexion réussi !!");
			//JOptionPane.showMessageDialog(null,
					//"Vous avez r�ussi vous connecter au serveur .","Message d\'erreur", JOptionPane.INFORMATION_MESSAGE);
		}
		catch (ClassNotFoundException e) {
			System.out.println("Echec de la connexion à la BD");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("Echec lors de l'identification");
			e.printStackTrace();
		}
	}
	public static Connection getInstance(){

		if(connexion == null){
			new JDBC();
			System.out.println("connexion unique");
		}
		//test du singleton 
		else{
			System.out.println("connexion multiple");
		}
		return connexion;   
	}
}