package by.htp.sporteq.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import by.htp.sporteq.entity.Order;
import by.htp.sporteq.entity.User;
import static by.htp.sporteq.util.ConstantValue.*;

public class OrderDAOImpl implements OrderDAO{

	@Override
	public boolean createOrder(Order order) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String dbUrl = rb.getString("db.url");
		String dbUser = rb.getString("db.login");
		String dbPass = rb.getString("db.pass");
		String driverName = rb.getString("db.driver.name");
		
//		User user = null;

		try {
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			/*Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_STATEMENT_SELECT_USER);*/
			
			PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_ORDER_CREATE, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setLong(1, order.getUser().getUserID()); //TODO change Login for Id
			ps.setLong(2, order.getEquipment().getEquipID()); //TODO change Name for Id
			ps.setDate(3, order.getDateStart());
			ps.setDate(4, order.getDateEnd());
//			ps.setInt(1, login);
//			ps.setString(2, password);
			int id = ps.RETURN_GENERATED_KEYS;
			ps.executeUpdate();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Order> fetchAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
