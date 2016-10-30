package web;

import domain.Waffle;
import service.OrderStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/modified")
public class ModifiedOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        response.setCharacterEncoding("ISO-8859-2");
        PrintWriter out = response.getWriter();

        Waffle waffle = new Waffle();
        waffle.setPrice(request.getParameter("topping"),
                request.getParameter("sugar"),
                request.getParameter("cream"),
                request.getParameter("fruit"));
        waffle.setType();

        out.println("<html><body><h2>Twoje zamówienie zostało zmodyfikowane</h2>" +
                "<br />Rodzaj: " + waffle.getType() +
                "<br />Cukier puder: " + waffle.getSugar() +
                "<br />Polewa: " + waffle.getTopping() +
                "<br />Śmietana: " + waffle.getCream() +
                "<br />Owoce: " + waffle.getFruit() +
                "<br />Cena: " + waffle.getPrice() + " zł" +
                "<a href='order'>Wróć</a>" +
                "<a href='showOrder'>Pokaż inne zamówienia</a>" +
                "</body></html>");
        out.close();

        String[] id = request.getParameterValues("order");
        OrderStorage order = new OrderStorage();
        order.modifyOrder(waffle,id[0]);
    }
}
