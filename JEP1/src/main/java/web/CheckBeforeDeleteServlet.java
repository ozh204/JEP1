package web;

import service.OrderStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/check")
public class CheckBeforeDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        response.setCharacterEncoding("ISO-8859-2");
        PrintWriter out = response.getWriter();

        String[] items = request.getParameterValues("delete");
        boolean check = OrderStorage.checkIfExists(items);

        if(check)
        {
            request.getRequestDispatcher("/delete").forward(request, response);
        }
        else
        {
            out.println("<h2>Gofr o takim id nie istnieje bądź nie wybrałeś żadnego</h2>");
            request.getRequestDispatcher("/showOrder").include(request, response);
        }
        out.close();
    }
}
