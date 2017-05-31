package by.htp.sporteq.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.sporteq.dao.EquipDAOImpl;

import static by.htp.sporteq.util.ConstantValue.*;

public class MakeOrderAction implements CommandAction{
	
	private EquipDAOImpl equipService;
	
	public MakeOrderAction() {
		equipService = new EquipDAOImpl();
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

			
		request.setAttribute("map", equipService.showEquip(request.getParameter("bike")));
		
		return PAGE_EXACT_ORDER;
	}

}
