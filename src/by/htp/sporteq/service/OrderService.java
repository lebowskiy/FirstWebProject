package by.htp.sporteq.service;

import java.sql.Date;

import by.htp.sporteq.entity.Equipment;
import by.htp.sporteq.entity.Order;
import by.htp.sporteq.entity.User;

public interface OrderService {
	
	Order makeOrder(User UserID, Equipment equipID, Date start, Date end);

}
