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
				"<input type='radio' name='topping' value='none' checked>Bez polewy<br />" +
				"<input type='radio' name='topping' value='chocolate'>Czekoladowa<br />" +
				"<input type='radio' name='topping' value='toffi'>Toffi<br />" +
				"<input type='radio' name='topping' value='raspberry'>Malinowa<br />" +
				"<input type='radio' name='topping' value='blueberry'>Jagodowa<br />" +
				"<input type='radio' name='topping' value='strawberry'>Truskawkowa<br />" +
				"Cukier puder:<br />" +
				"<input type='radio' name='sugar' value='yes'>Tak<br />" +
				"<input type='radio' name='sugar' value='no' checked>Nie<br />" +
				"Śmietana :<br />" +
				"<input type='radio' name='cream' value='yes'>Tak<br />" +
				"<input type='radio' name='cream' value='no' checked>Nie<br />" +
				"Owoce :<br />" +
				"<input type='radio' name='fruit' value='none' checked>Bez owoców<br />" +
				"<input type='radio' name='fruit' value='strawberry'>Truskawki<br />" +
				"<input type='radio' name='fruit' value='raspberry'>Maliny<br />" +
				"<input type='radio' name='fruit' value='blueberry'>Borówki<br />" +
				"<input type='submit' value=' OK ' />" +
				"</form>" +
				"</body></html>");
		out.close();
	}
}
