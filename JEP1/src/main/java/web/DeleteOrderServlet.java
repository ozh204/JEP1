package web;

import service.OrderStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/delete")
public class DeleteOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String[] items = request.getParameterValues("delete");
        OrderStorage.deleteOrder(items);

        response.setContentType("text/html");
        response.setCharacterEncoding("ISO-8859-2");
        PrintWriter out = response.getWriter();

        out.print("Usunięto zamówienia o id");
        for(String a : items) out.print(" " + a);
    }
}
