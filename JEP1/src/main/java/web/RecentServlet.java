package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import domain.Waffle;

@WebServlet(urlPatterns = "/recent")
public class RecentServlet extends HttpServlet  {
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

        out.println("<html><body><h2>Twoje zamówienie</h2>" +
                "<p>Rodzaj: " + waffle.getType() + "<br />" +
                "<p>Cukier puder: " + waffle.getSugar() + "<br />" +
                "<p>Polewa: " + waffle.getTopping() + "<br />" +
                "<p>Śmietana: " + waffle.getCream() + "<br />" +
                "<p>Owoce: " + waffle.getFruit() + "<br />" +
                "<p>Cena: " + waffle.getPrice() + " zł<br />" +
                "</body></html>");
        out.close();
    }
}
