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

        out.println("<html>");
        out.println("<style> table,td{border:1px solid black;text-align:center;} </style>");
        out.println("<body>");
        out.println("<h2>Lista oczekujących zamówień</h2>");
        out.println("<form action='delete' method='POST'>");
        out.println("<table>");
        out.println("   <tr>");
        out.println("       <td>Który w kolejce</td><td>Rodzaj</td><td>Cena</td><td>Cukier Puder</td><td>Śmietana</td><td>Owoce</td><td>Polewa</td><td>Usuń</td>");
        out.println("   </tr>");
                for (Waffle waffle : OrderStorage.getOrders())
                {
                    out.println("<tr><td>" + ++id + "</td><td>" + waffle.getType() +
                            "</td><td>" + waffle.getPrice() +
                            " zł</td><td>" + waffle.getSugar() +
                            "</td><td>" + waffle.getCream() +
                            "</td><td>" + waffle.getFruit() +
                            "</td><td>" + waffle.getTopping() +
                            "</td><td><input type='checkbox' name='delete' value='" + id + "'></td><td><a href='modify?order=" + id + "'>Modfikuj</a></td></tr>");
                }
        out.println("</table>");
        out.println("<input type='submit' value='Usuń zaznaczone'/>");
        out.println("<p><a href='order'>Wróć</a></p>" +
                "<p><a href='showOrder'>Pokaż inne zamówienia</a></p>" +
                "<p><a href='list.jsp'>Wypisz listę dostępnych gofrów</a></p>" +
                "<p><a href='index.jsp'>Strona główna</a></p>");
        out.println("</form></body></html>");
        out.close();
    }
}
