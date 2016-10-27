package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/order")
public class OrderServlet extends HttpServlet 
{
private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		response.setCharacterEncoding("ISO-8859-2");

		PrintWriter out = response.getWriter();

		out.println("<html><body><h2>Złóż zamówienie</h2>" +
				"<form action='recent' method='POST'>" +
				"Polewa:<br />" +
				"<input type='radio' name='topping' value='Brak' checked>Bez polewy<br />" +
				"<input type='radio' name='topping' value='Czekoladowa'>Czekoladowa<br />" +
				"<input type='radio' name='topping' value='Toffi'>Toffi<br />" +
				"<input type='radio' name='topping' value='Malinowa'>Malinowa<br />" +
				"<input type='radio' name='topping' value='Jagodowa'>Jagodowa<br />" +
				"<input type='radio' name='topping' value='Truskawkowa'>Truskawkowa<br />" +
				"Cukier puder:<br />" +
				"<input type='radio' name='sugar' value='Tak'>Tak<br />" +
				"<input type='radio' name='sugar' value='Nie' checked>Nie<br />" +
				"Śmietana :<br />" +
				"<input type='radio' name='cream' value='Tak'>Tak<br />" +
				"<input type='radio' name='cream' value='Nie' checked>Nie<br />" +
				"Owoce :<br />" +
				"<input type='radio' name='fruit' value='Brak' checked>Bez owoców<br />" +
				"<input type='radio' name='fruit' value='Truskawki'>Truskawki<br />" +
				"<input type='radio' name='fruit' value='Maliny'>Maliny<br />" +
				"<input type='radio' name='fruit' value='Borówki'>Borówki<br />" +
				"<input type='submit' value=' OK ' />" +
				"</form>" +
				"</body></html>");
		out.close();
	}
}
