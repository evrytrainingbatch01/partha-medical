package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.PatientDao;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pName = request.getParameter("john");
		String age = request.getParameter("10");
		String bloodGroop = request.getParameter("bloodGroop");

		HttpSession session = request.getSession(true);
		try {
			PatientDao dao = new PatientDao();
			dao.addUserDetails(pName, bloodGroop, age);
			response.sendRedirect("Success");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
