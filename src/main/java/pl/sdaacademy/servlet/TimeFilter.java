package pl.sdaacademy.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TimeFilter implements Filter {

    public SimpleDateFormat simpleDateFormat;

    public void init(FilterConfig filterConfig) throws ServletException {
        String timeFormatParameter = filterConfig.getInitParameter("time-format");

        if (timeFormatParameter != null) {
            this.simpleDateFormat = new SimpleDateFormat(timeFormatParameter);
        } else {
            this.simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        servletResponse.getWriter().println(simpleDateFormat.format(new Date()));



        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {}
}
