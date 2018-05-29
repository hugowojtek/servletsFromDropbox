package pl.sdaacademy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParametersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletParam = getServletConfig().getInitParameter("name");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<h1>Servlet param is " + servletParam + "!</h1><br>");

        String contextParam = getServletContext().getInitParameter("name");

        out.print("<h1>Context param is " + contextParam + "!</h1>");
    }
}
