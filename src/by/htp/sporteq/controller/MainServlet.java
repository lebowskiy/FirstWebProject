package by.htp.sporteq.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.sporteq.command.CommandAction;
import by.htp.sporteq.command.CommandChooser;

/**
 * Servlet implementation class MainServlet2
 */
public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 3851531115522250658L;

	public MainServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
		System.out.println("doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
		System.out.println("doPost");
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(request.getParameter("action"));
		String page = null;
		if (action != null) {
			CommandAction currentAction = CommandChooser.chooseAction(action);
			page = currentAction.execute(request, response);
			RequestDispatcher disp = request.getRequestDispatcher(page);
			disp.forward(request, response);
		}
	}

}
