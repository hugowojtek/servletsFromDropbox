package pl.sdaacademy.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class Servlet1 extends HttpServlet {

    public ServletContext context;

    @Override
    public void init() throws ServletException {
        context = this.getServletContext();
    }

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {




        PrintWriter writer = resp.getWriter();
        writer.print("<p>servlet1<p>");
        writer.print("<html><body>");


        context.setAttribute("pl.samouczekprogramisty.servlet1", "servlet1 attribute");
        String str = (String)context.getAttribute("pl.samouczekprogramisty.servlet1");
        writer.print(str);
        context.setAttribute("name","ContextParam2");


//        Enumeration<String> attributeNames = context.getAttributeNames();
//        while (attributeNames.hasMoreElements()) {
//            String attributeName = attributeNames.nextElement();
//            writer.print("<p>" + attributeName + ": " + (String)context.getAttribute(attributeName) + "<p>");
//        }
//        writer.print("</body></html>");
    }
}
