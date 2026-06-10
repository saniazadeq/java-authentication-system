package org.example.finalproject.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.finalproject.model.carrier.LoginRequestCarrier;
import org.example.finalproject.model.carrier.SignupRequestCarrier;
import org.example.finalproject.model.service.UserService;

import java.io.IOException;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException , IOException {
        LoginRequestCarrier carrier =new LoginRequestCarrier(req.getParameter("username"), req.getParameter("password"));
        UserService userService = new UserService();
        if (userService.login(carrier)){
            resp.getWriter().println("Login Successful");
        }else
            resp.getWriter().println("Login Failed");

        SignupRequestCarrier signupCarrier = new SignupRequestCarrier(req.getParameter("username"),req.getParameter("password"),req.getParameter("email"));
        if (userService.signup(signupCarrier)){
            resp.getWriter().println("Signup Successful");
        }else
            resp.getWriter().println("Signup failed");
    }
}

