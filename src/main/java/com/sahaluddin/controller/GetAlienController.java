package com.sahaluddin.controller;

import com.sahaluddin.model.Alien;
import com.sahaluddin.dao.AlienDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

    @WebServlet(name = "GetAlienController")
    public class GetAlienController extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            int aid = Integer.parseInt(request.getParameter("aid"));

            AlienDao dao = new AlienDao();
            Alien a1 = dao.getAlien(aid);

            HttpSession session = request.getSession();
            session.setAttribute("alien", a1);

            response.sendRedirect("showAlien.jsp");

//            request.setAttribute("alien", a1);

//            RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
//            rd.forward(request, response);
        }




    }

