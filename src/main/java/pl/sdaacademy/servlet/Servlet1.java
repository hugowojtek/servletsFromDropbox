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

    //public ServletContext context = this.getServletContext();

    @Override
    public void init() throws ServletException {
        //context = this.getServletContext();
    }

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {

        ServletContext context = this.getServletContext();


        PrintWriter writer = resp.getWriter();
        writer.print("<p>servlet1<p>");
        writer.print("<html><body>");


        context.setAttribute("name2", "ala");
        String str = (String)context.getAttribute("name2");
        writer.print(str);



//        Enumeration<String> attributeNames = context.getAttributeNames();
//        while (attributeNames.hasMoreElements()) {
//            String attributeName = attributeNames.nextElement();
//            writer.print("<p>" + attributeName + ": " + (String)context.getAttribute(attributeName) + "<p>");
//        }
//        writer.print("</body></html>");
    }
}
