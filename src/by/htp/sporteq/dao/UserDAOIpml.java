package by.htp.sporteq.dao;

import by.htp.sporteq.entity.User;
import static by.htp.sporteq.util.ConstantValue.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;



public class UserDAOIpml implements UserDAO{

	@Override
	public User fetchByCredentials(String login, String password) {
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String dbUrl = rb.getString("db.url");
		String dbUser = rb.getString("db.login");
		String dbPass = rb.getString("db.pass");
		String driverName = rb.getString("db.driver.name");
		
		User user = null;

		try {
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			/*Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_STATEMENT_SELECT_USER);*/
			
			PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_SELECT_USER);
			ps.setString(1, login);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				String log = rs.getString(2);
				String pass = rs.getString(3);
				boolean role = rs.getBoolean(5);
				
				user = new User();
				user.setLogin(log);
				user.setPassword(pass);
				user.setRole(role);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
