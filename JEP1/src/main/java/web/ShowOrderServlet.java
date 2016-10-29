package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import service.OrderStorage;
import domain.Waffle;

@WebServlet(urlPatterns = "/showOrder")
public class ShowOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        response.setCharacterEncoding("ISO-8859-2");
        PrintWriter out = response.getWriter();
        int id = 0;

        out.println("<style> table,td{border:1px solid black;text-align:center;} </style>");
        out.println("<html><body><h2>Lista oczekujących zamówień</h2>" +
                "<table><tr><td>Który w kolejce</td><td>Rodzaj</td><td>Cena</td><td>Cukier Puder</td><td>Śmietana</td><td>Owoce</td><td>Polewa</td></tr>");
                for (Waffle waffle : OrderStorage.getOrders())
                    out.println("<tr><td>"+ ++id +"</td><td>" + waffle.getType() +
                    "</td><td>" + waffle.getPrice() +
                    " zł</td><td>" + waffle.getSugar() +
                    "</td><td>" + waffle.getCream() +
                    "</td><td>" + waffle.getFruit() +
                    "</td><td>" + waffle.getTopping() +
                    "</td></tr>");
        out.println("</table></body></html>");
        out.close();
    }
}
