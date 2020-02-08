package com.octest.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.Auteur;


@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public test() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Auteur auteur = new Auteur();
		auteur.setPrenom("Antoine");
		auteur.setNom("Le Pape");
		auteur.setActif(true);
		request.setAttribute("auteur", auteur);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
