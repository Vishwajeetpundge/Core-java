package JdBC.App;

import java.sql.*;


public class DBCon1 {
	public static void main(String[]args)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection
			("jdbc:oracle:thin:@Localhost:1521:xe","System","admin");
			
			Statement stm = con.createStatement();
			
			ResultSet rs=stm.executeQuery("select * from BookDetails88");
			System.out.println("----BookDetails----");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"
						+rs.getString(2)+"\t"
						+rs.getString(3)+"\t"
						+rs.getFloat(4)+"\t"
						+rs.getInt(5));
				
			}
			con.close();
		}catch(Exception e)  {
			e.printStackTrace();
		}
	}
}