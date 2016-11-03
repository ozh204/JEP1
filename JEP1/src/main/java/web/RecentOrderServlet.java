package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import domain.Waffle;
import service.OrderStorage;

@WebServlet(urlPatterns = "/recent")
public class RecentOrderServlet extends HttpServlet  {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("ISO-8859-2");
        PrintWriter out = response.getWriter();

        Waffle waffle = new Waffle();
        waffle.setPrice(request.getParameter("topping"),
                request.getParameter("sugar"),
                request.getParameter("cream"),
                request.getParameter("fruit"));
        waffle.setType();

        out.println("<html><body><h2>Twoje zamówienie zostało dodane</h2>" +
                "<br />Rodzaj: " + waffle.getType() +
                "<br />Cukier puder: " + waffle.getSugar() +
                "<br />Polewa: " + waffle.getTopping() +
                "<br />Śmietana: " + waffle.getCream() +
                "<br />Owoce: " + waffle.getFruit() +
                "<br />Cena: " + waffle.getPrice() + " zł" +
                "<p><a href='order'>Wróć</a></p>" +
                "<p><a href='showOrder'>Pokaż inne zamówienia</a></p>" +
                "<p><a href='list.jsp'>Wypisz listę dostępnych gofrów</a></p>" +
                "<p><a href='index.jsp'>Strona główna</a></p>" +
                "</body></html>");
        out.close();

        OrderStorage order = new OrderStorage();
        order.addOrder(waffle);
    }
}
