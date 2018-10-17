import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.OracleDriver;


public class DBconnect {
	


public static Connection connect() throws Exception{
	
	String path="config.properties";
	ClassLoader loader =Thread.currentThread().getContextClassLoader();
	InputStream input =loader.getResourceAsStream(path);
	
	Properties p= new Properties();
	p.load(input);
	
	//Class.forName("oracle.jdbc.driver.OracleDriver");
	String url=p.getProperty("db_url");
	String user=p.getProperty("db_username");;
	String password=p.getProperty("db_password");
	DriverManager.registerDriver(new OracleDriver());
	Connection con =DriverManager.getConnection(url, user, password);
	
	if(con!=null){
		System.out.println("Database connect !!!");
	}
	
	return con;
} 


public static void Disconnect(Connection con, PreparedStatement ps, ResultSet rs) throws SQLException{
	if(con!=null){
		con.close();
	}
	
	if(ps !=null){
		ps.close();
		
	}
	if(rs !=null){
		rs.close();
	}
}
}
