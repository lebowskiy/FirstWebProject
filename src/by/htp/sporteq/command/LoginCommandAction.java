package by.htp.sporteq.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.sporteq.logic.io.MyReader;
import by.htp.sporteq.logic.parser.DOMParser;

public class LoginCommandAction implements CommandAction {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		String page = "";
		if ("user".equals(login) && "user".equals(pass)) {
			page = "/user.jsp";
			List<ArrayList<String>> equip = (List<ArrayList<String>>) DOMParser.readXML();
			request.setAttribute("list", equip);
			// список оборудования, доступного к прокату из XML/файла (каталог)
		} else if ("admin".equals(login) && "admin".equals(pass)) {
			page = "/admin.jsp";
			List<ArrayList<String>> clients = (List<ArrayList<String>>) MyReader.readReport();
			request.setAttribute("list", clients);
			// отчет за текущий день (оборудование, отданное в прокат)
		} else {
			page = "/error.jsp";
		}
		return page;
	}

}
