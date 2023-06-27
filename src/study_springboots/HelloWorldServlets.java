package com.example.study_springboots;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/helloworld")
public class HelloWorldServlets extends HttpServlet {
        protected void doGet(HttpServletRequest request,
                            HttpServletResponse response) {
            System.out.println();
        }

    }
