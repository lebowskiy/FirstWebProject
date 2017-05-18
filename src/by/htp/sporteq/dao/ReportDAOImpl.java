package by.htp.sporteq.dao;

import static by.htp.sporteq.util.ConstantValue.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import by.htp.sporteq.entity.Report;


public class ReportDAOImpl implements ReportDAO{

	@Override
	public List<Report> showAllOrders() {
		List<Report> list = new ArrayList<>();
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String dbUrl = rb.getString("db.url");
		String dbUser = rb.getString("db.login");
		String dbPass = rb.getString("db.pass");
		String driverName = rb.getString("db.driver.name");
		
		try {
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			/*Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_STATEMENT_SELECT_USER);*/
			
			PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_SHOW_REPORT);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				Report someReport = new Report();
				someReport.setOrderID(rs.getInt(1));
				someReport.setUserID(rs.getInt(2));
				someReport.setEquipID(rs.getInt(3));
				someReport.setDateStart(rs.getDate(4));
				someReport.setDateEnd(rs.getDate(5));
				
				list.add(someReport);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
