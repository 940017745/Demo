package com.neu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.CardDao;
import com.neu.dao.CardDaoImpl;
import com.neu.dao.ScardDao;
import com.neu.dao.ScardDaoImpl;
import com.neu.entity.CardType;
import com.neu.entity.ScardInfo;
import com.neu.service.CardService;
import com.neu.service.CardServiceImpl;
import com.neu.service.ScardService;
import com.neu.service.ScardServiceImpl;

/**
 * Servlet implementation class ScardServlet
 */
@WebServlet("/ScardServlet")
public class ScardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String stype = request.getParameter("stype");
			String sname = request.getParameter("sname");
			String idcard = request.getParameter("idcard");
			
			CardService cardService=new CardServiceImpl();
			ScardService scardService=new ScardServiceImpl();
			
			try {
				
				 List<CardType> cardType = cardService.getAll();
				 List<ScardInfo> scardInfo = scardService.getAll();
				
				request.setAttribute("scardInfo", scardInfo);
				request.setAttribute("cardType", cardType);
				response.sendRedirect(request.getContextPath()+"/accp.jsp");
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
