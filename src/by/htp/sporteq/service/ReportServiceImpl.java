package by.htp.sporteq.service;

import java.util.List;

import by.htp.sporteq.dao.ReportDAO;
import by.htp.sporteq.dao.ReportDAOImpl;
import by.htp.sporteq.entity.Report;

public class ReportServiceImpl implements ReportService {

	private ReportDAO reportDAO;

	public ReportServiceImpl() {
		reportDAO = new ReportDAOImpl();
	}

	@Override
	public List<Report> showReport() {
		List<Report> allOrders = reportDAO.showAllOrders();
		return allOrders;
	}

}
