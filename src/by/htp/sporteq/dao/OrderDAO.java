package by.htp.sporteq.dao;

import java.util.List;

import by.htp.sporteq.entity.Order;

public interface OrderDAO {

	// boolean createOrder(User user, Equipment equip, Date start, Date end);
	boolean createOrder(Order order);

	List<Order> fetchAll();
}
