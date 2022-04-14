package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EpsilonDB {

	public static void main(String[] args) throws Exception {
  		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
		
		String sql="Select count(*) from apprenant";
		Statement state=con.createStatement();
		ResultSet result=state.executeQuery(sql);
		
		while(result.next()) {
			int count=result.getInt(1);
			System.out.println("Le nombre d'enregistrement =>"+count);
		}
		
		String sql2="Select prenom from apprenant";
		Statement state2=con.createStatement();
		ResultSet result2=state2.executeQuery(sql2);
		
		while(result2.next()) {
			String prenom=result2.getString("prenom");
			System.out.println("\n"+prenom);
			
		}
		
		String sql3="Select id,prenom,nom,tel from apprenant";
		Statement state3=con.createStatement();
		ResultSet result3=state3.executeQuery(sql3);
		
		while(result3.next()) {
			int id=result3.getInt("id");
			String prenom=result3.getString("prenom");
			String nom=result3.getString("nom");
			String tel=result3.getString("tel");
			System.out.println(id+"=> "+prenom+"=> "+nom+"=> "+tel);
		}
		
		String sql4="Select id,prenom,nom,tel from apprenant where id=?";
		PreparedStatement prepare=con.prepareStatement(sql4);
		prepare.setInt(1, 2);
		result=prepare.executeQuery();
		
		while(result.next()) {
			int id=result.getInt("id");
			String prenom=result.getString("prenom");
			String nom=result.getString("nom");
			String tel=result.getString("tel");
			
			System.out.println("la selection \n"+id+"=>"+prenom+"=>"+nom+"=>"+tel);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
