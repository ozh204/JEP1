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
import java.util.List;

@WebServlet(urlPatterns = "/modify")
public class ModifyOrderServlet extends HttpServlet {
    Waffle waffle = new Waffle();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        response.setCharacterEncoding("ISO-8859-2");

        List<Waffle> list = OrderStorage.getOrders();
        String[] order = request.getParameterValues("order");

        waffle = list.get(Integer.parseInt(order[0])-1);

        PrintWriter out = response.getWriter();
        out.println("<html><body><h2>Modyfikuj zamówienie</h2>" +
                "<form action='modified' method='POST'>" +
                "<input type='hidden' name='order' value='"+order[0]+"'>" +
                "Polewa:<br />" +
                "<input type='radio' name='topping' value='Brak'" + checkTopping("Brak") + ">Bez polewy<br />" +
                "<input type='radio' name='topping' value='Czekoladowa'" + checkTopping("Czekoladowa") + ">Czekoladowa<br />" +
                "<input type='radio' name='topping' value='Toffi'" + checkTopping("Toffi") + ">Toffi<br />" +
                "<input type='radio' name='topping' value='Malinowa'" + checkTopping("Malinowa") + ">Malinowa<br />" +
                "<input type='radio' name='topping' value='Jagodowa'" + checkTopping("Jagodowa") + ">Jagodowa<br />" +
                "<input type='radio' name='topping' value='Truskawkowa'" + checkTopping("Truskawkowa") + ">Truskawkowa<br />" +
                "Cukier puder:<br />" +
                "<input type='radio' name='sugar' value='Tak'" + checkSugar("Tak") + ">Tak<br />" +
                "<input type='radio' name='sugar' value='Nie'" + checkSugar("Nie") + ">Nie<br />" +
                "Śmietana :<br />" +
                "<input type='radio' name='cream' value='Tak'" + checkCream("Tak") + ">Tak<br />" +
                "<input type='radio' name='cream' value='Nie'" + checkCream("Nie") + ">Nie<br />" +
                "Owoce :<br />" +
                "<input type='radio' name='fruit' value='Brak'" + checkFruit("Brak") + ">Bez owoców<br />" +
                "<input type='radio' name='fruit' value='Truskawki'" + checkFruit("Truskawki") + ">Truskawki<br />" +
                "<input type='radio' name='fruit' value='Maliny'" + checkFruit("Maliny") + ">Maliny<br />" +
                "<input type='radio' name='fruit' value='Jagody'" + checkFruit("Jagody") + ">Jagody<br />" +
                "<input type='submit' value=' OK ' />" +
                "</form>" +
                "<a href='showOrder'>Pokaż inne zamówienia</a>" +
                "<a href='showOrder'>Pokaż inne zamówienia</a>" +
                "<p><a href='list.jsp'>Wypisz listę dostępnych gofrów</a></p>" +
                "<p><a href='index.jsp'>Strona główna</a></p>" +
                "</body></html>");
        out.close();
    }

    private String checkTopping(String ingredient)
    {
        if(ingredient.equals(waffle.getTopping())) return "checked";
        return "";
    }
    private String checkSugar(String ingredient)
    {
        if(ingredient.equals(waffle.getSugar())) return "checked";
        return "";
    }
    private String checkCream(String ingredient)
    {
        if(ingredient.equals(waffle.getCream())) return "checked";
        return "";
    }
    private String checkFruit(String ingredient)
    {
        if(ingredient.equals(waffle.getFruit())) return "checked";
        return "";
    }
}