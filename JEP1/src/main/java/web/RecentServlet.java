package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import service.WaffleTypes;
import domain.Waffle;

@WebServlet(urlPatterns = "/recent")
public class RecentServlet extends HttpServlet  {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("ISO-8859-2");
        PrintWriter out = response.getWriter();

        WaffleTypes type = new WaffleTypes();
        Waffle waffle = new Waffle();
        waffle.setPrice(!request.getParameter("topping").equals("none"),
                request.getParameter("sugar").equals("yes"),
                request.getParameter("cream").equals("yes"),
                !request.getParameter("fruit").equals("none"));





        out.println("cena: " + waffle.getPrice() + " <br/> typ: " + waffle.getType());

//        for (waffle : type.getAllWaffles())
//        {
//            if(waffle.getPrice() == price)
//            {
//
//            }
//        }



        out.println("<html><body><h2>Twoje zamówienie</h2>" +
                "<p>Rodzaj: " + request.getParameter("type") + "<br />" +
                "<p>Polewa: " + request.getParameter("topping") + "<br />" +
                "</body></html>");
        out.close();
    }
}
