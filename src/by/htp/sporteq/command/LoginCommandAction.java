package by.htp.sporteq.command;


import java.util.List;
//import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp.sporteq.entity.Equipment;
import by.htp.sporteq.entity.User;
//import by.htp.sporteq.logic.io.MyReader;
//import by.htp.sporteq.logic.parser.DOMParser;
import by.htp.sporteq.service.EquipServiceImpl;
import by.htp.sporteq.service.EquipService;
import by.htp.sporteq.service.NoSuchUserException;
import by.htp.sporteq.service.UserService;
import by.htp.sporteq.service.UserServiceImpl;

import static by.htp.sporteq.util.ConstantValue.*;

public class LoginCommandAction implements CommandAction {

	private UserService userservice;
	private EquipService equipService;

	public LoginCommandAction() {
		this.userservice = new UserServiceImpl();
		this.equipService = new EquipServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String login = request.getParameter(REQUEST_PARAM_LOGIN);
		String pass = request.getParameter(REQUEST_PARAM_PASSWORD);
		String page = PAGE_DEFAULT;
		HttpSession session = request.getSession();

		
		User user;
		try {
			user = userservice.authorize(login, pass);
			session.setAttribute("user", user);
			if (!user.isRole()) {
				page = PAGE_USER_MAIN;
				// List<ArrayList<String>> equip = (List<ArrayList<String>>)
				// DOMParser.readXML();
				List<Equipment> equip = equipService.list();
				request.setAttribute(REQUEST_PARAM_LIST_EQ, equip);
				// список оборудования, доступного к прокату из XML/файла
				// (каталог)
			} else {
				page = PAGE_ADMIN_MAIN;
				// List<ArrayList<String>> clients = (List<ArrayList<String>>)
				// MyReader.readReport();
				// request.setAttribute("list", clients);
				// отчет за текущий день (оборудование, отданное в прокат)
			}
			// else {
			// page = PAGE_ERROR_MAIN;
			// }
		} catch (NoSuchUserException e) {
			page = PAGE_ERROR_MAIN;
			request.setAttribute(REQUEST_PARAM_ERROR_MSG, e.getMessage());
			e.printStackTrace();
		}

		return page;
	}
	
}
