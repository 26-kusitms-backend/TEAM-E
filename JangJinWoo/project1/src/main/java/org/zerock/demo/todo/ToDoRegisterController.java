package org.zerock.demo.todo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="ToDoRegisterController", urlPatterns = "/todo/register")
public class ToDoRegisterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {

        resp.sendRedirect("/todo/list");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {


        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/register.jsp");

        dispatcher.forward(req,resp);
    }

}
