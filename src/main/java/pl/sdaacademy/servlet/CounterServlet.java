package pl.sdaacademy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CounterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();

        Object object = session.getAttribute("count");
        Long counter;

        if (object instanceof Long) {
            counter = (Long) object;
            counter++;
        } else {
            counter = 1L;
        }

        out.println("<h1>To Twoja " + counter + " wizyta");

        session.setAttribute("count", counter);
    }
}
