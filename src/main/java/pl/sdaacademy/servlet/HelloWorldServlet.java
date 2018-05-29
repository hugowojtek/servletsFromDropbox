package pl.sdaacademy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

    private List<String> messages;

    @Override
    public void init() throws ServletException {
        this.messages = new ArrayList<>();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        this.messages.add(req.getParameter("para1"));
        this.messages.add(req.getParameter("para2"));
        this.messages.add(req.getParameter("para3"));

        out.print("<h1>Hello World!11</h1>");

        printer(out, messages);
    }

    private void printer(PrintWriter out, List<String> messages) {
        for (String s:messages){
            out.print("<h3>"+s+"</h3>");
        }
    }
}
