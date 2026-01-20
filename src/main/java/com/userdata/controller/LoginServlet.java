package com.userdata.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        if (user.equals("admin") && pass.equals("admin")) {
            RequestDispatcher rd = req.getRequestDispatcher("form.jsp");
            rd.forward(req, res);
        } else {
            res.getWriter().println("Invalid Login");
        }
    }
}
