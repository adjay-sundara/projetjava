package projetjava;

import java.sql.SQLException;
import java.sql.Statement;


import Inscri.Etudiant;
public class Test {

	public static void main(String[] args) {
		//Authentification("admin","admin");
	//	addUser("jay","jay",1);
		Etudiant i1=new Etudiant("sun", "jay", 'm',8,9,1994, "ee", "ee", "ee");
		System.out.println(i1.toString());
	
	}

	public static void Authentification(String user,String pass){
		JDBC.getInstance();
		JDBC.getConnexion();
		try{

			String sql = "SELECT * FROM auth WHERE user ='"+user+"' and pass='"+pass+"'";
			JDBC.st = JDBC.connexion.createStatement();
			JDBC.rs = JDBC.st.executeQuery(sql);
			if(JDBC.rs.next()){
				System.out.println(JDBC.rs.getInt("level"));
			}
			else{
				System.out.println("echec");
			}
		}
		catch(SQLException e){
			System.out.println("Erreur");;
			e.printStackTrace();
		}
	}
	public static void addUser(String user,String pass,int level){
		JDBC.getInstance();
		JDBC.getConnexion();
		try {
			String sql="INSERT INTO auth(user,pass,level) VALUES(?,?,?);";

			JDBC.ps =JDBC.connexion.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			JDBC.ps.setString(1, user);
			JDBC.ps.setString(2, pass);
			JDBC.ps.setInt(3, level);
			JDBC.ps.executeUpdate();
			JDBC.rs=JDBC.ps.getGeneratedKeys();
			if(JDBC.rs.next()){
				System.out.println(JDBC.rs.getInt(1));
			}

		} catch (SQLException e) {
			int errCode = e.getErrorCode();
			if(errCode == 1062) {
				System.out.println("user deja existant");
				//inserer code alerte
			}
			else {
				System.out.println("erreur");
			}
		}
	}
}

