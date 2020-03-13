import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		Connection con = DriverManager.getConnection("jdbc:mysql://" +host+ ":" +3306+ "/saggu", "root", "sagar123");
		Statement st=con.createStatement();
		
		/* final String table ="CREATE TABLE food ("+ "UID INT NOT NULL," + "NAME VARCHAR(45) NOT NULL,"
                 + "DOB DATE NOT NULL,"
                 + "EMAIL VARCHAR(45) NOT NULL,"
                 + "PRIMARY KEY (UID))";
		 st.executeUpdate(table);*/
			
		ResultSet rs = st.executeQuery("select * from empinfo");
		ResultSetMetaData rm = rs.getMetaData();
		System.out.println(rm.getColumnName(2));
		/*rs.absolute(3);
		System.out.println(rs.getString("age"));
		/*PreparedStatement pr = con.prepareStatement("insert into empinfo values(?,?,?,?)");
		pr.setString(1, "sam");
		pr.setInt(2, 12);
		pr.setString(3, "belapur");
		pr.setInt(4, 30);
		pr.executeUpdate();*/

	}
 
}
