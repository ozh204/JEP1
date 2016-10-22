package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.Waffle;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      service.WaffleTypes allWaffles = null;
      synchronized (_jspx_page_context) {
        allWaffles = (service.WaffleTypes) _jspx_page_context.getAttribute("allWaffles", PageContext.PAGE_SCOPE);
        if (allWaffles == null){
          allWaffles = new service.WaffleTypes();
          _jspx_page_context.setAttribute("allWaffles", allWaffles, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
 allWaffles.initialize(); 
      out.write("\n");
      out.write("<style>\n");
      out.write("    table,td{border:1px solid black;text-align:center;}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Lista gofrów</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h2>Lista Gofrów</h2>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("        <td>Typ</td>\n");
      out.write("        <td>Cena</td>\n");
      out.write("    </tr>\n");
      out.write("    ");

        for (Waffle waffle : allWaffles.getAllWaffles())
            out.println("<tr><td>" + waffle.getType() + "</td><td>" + waffle.getPrice() + " zł</td></tr>");
    
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<p><a href=\"index.jsp\">Wróć</a></p>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
