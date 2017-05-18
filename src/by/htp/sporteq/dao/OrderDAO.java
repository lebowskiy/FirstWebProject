package by.htp.sporteq.dao;

import java.sql.Date;
import java.util.List;

import by.htp.sporteq.entity.Equipment;
import by.htp.sporteq.entity.Order;
import by.htp.sporteq.entity.User;

public interface OrderDAO {

	//boolean createOrder(User user, Equipment equip, Date start, Date end);
	boolean createOrder(Order order);
	List<Order> fetchAll();
}
