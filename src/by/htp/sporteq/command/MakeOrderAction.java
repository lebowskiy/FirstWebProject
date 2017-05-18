package by.htp.sporteq.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static by.htp.sporteq.util.ConstantValue.*;

public class MakeOrderAction implements CommandAction{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

		return PAGE_ORDER_CREATE;
	}

}
