package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws SQLException {
		
		Connection connection=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/jdbc",
				"root",
				""
				);
		System.out.println("La connection"+connection);
		
		String sql="SELECT count(*) from apprenant";
		Statement stm=connection.createStatement();
		ResultSet rlt=stm.executeQuery(sql);
		
		while(rlt.next()) {
			long count=rlt.getLong(1);
			System.out.println("Count ="+count);
		}
		
		String sql2="Select prenom from apprenant";
		rlt=stm.executeQuery(sql2);
		
		while(rlt.next()) {
			String prenom =rlt.getString("prenom");
			System.out.println(prenom);
			
		}
		
		String sql3="Select id,prenom from apprenant";
		rlt=stm.executeQuery(sql3);
		
		while(rlt.next()) {
			int id =rlt.getInt("id");
			String prenom =rlt.getString("prenom");
			System.out.println(id+"=>"+prenom);
			
		}  
		
		String sql4="select id, prenom from apprenant where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql4);
		preparedStatement.setInt(1, 1);
		rlt=preparedStatement.executeQuery();

		
		while(rlt.next()) {
			int id=rlt.getInt("id");
			String prenom=rlt.getString("prenom");
			System.out.println("id =>"+id+ ",Prenom=>"+prenom);
		}
		
		
		
		 
		
		
		
		
    
	}

}
