package com.userdata.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.username.dao.UserDao;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String profession = req.getParameter("profession");

        UserDao dao = new UserDao();
        boolean result = dao.insertUser(name, age, profession);

        if (result) {
            res.sendRedirect("Success.jsp");
        } else {
            res.getWriter().println("Insertion Failed");
        }
    }
}
