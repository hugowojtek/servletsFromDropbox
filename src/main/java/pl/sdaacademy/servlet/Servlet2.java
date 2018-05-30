package pl.sdaacademy.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

public class Servlet2 extends HttpServlet {



    @Override
    public void init() throws ServletException {


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter responseWriter = resp.getWriter();
        ServletContext context2 = this.getServletContext();

        String str = (String)context2.getAttribute("name2");

        responseWriter.print(str);

        String str2 = (String)context2.getInitParameter("name");
        responseWriter.print(str2);

//        responseWriter.print("<htm><body>");
        Map<String,String[]> map = req.getParameterMap();
        for (Map.Entry entry: map.entrySet())
        {
            responseWriter.write("<p>" + entry.getKey() + ": " + Arrays.toString((String[])entry.getValue()) +"<p>");
        }




//        responseWriter.print("</htm></body>");
    }
}
