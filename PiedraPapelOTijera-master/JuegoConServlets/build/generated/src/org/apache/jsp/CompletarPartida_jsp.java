package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import es.ayesa.cursoweb.Partida;
import es.ayesa.cursoweb.GestorPartidas;

public final class CompletarPartida_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Completa</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
String Id = request.getParameter("id");
    GestorPartidas ges = new GestorPartidas();
    
    
    
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Completa Partida</h1>\n");
      out.write("        <form action=\"http://localhost:8080/JuegoConServlets/ResultadoPartidas.jsp\" method=\"get\" target=\"_blank\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <input type=\"hidden\" value=\"");
      out.print(request.getParameter("id"));
      out.write("\" name=\"id\">\n");
      out.write("            <label for=\"nombreJugador\">Nombre:</label><input name=\"nombreJugador\" required> <br/>\n");
      out.write("            <label for=\"jugada\">Jugada:</label><br/>\n");
      out.write("            \n");
      out.write("            <input type=\"radio\" name=\"jugada\" value=\"PIEDRA\" required>PIEDRA<br/>\n");
      out.write("            <input type=\"radio\" name=\"jugada\" value=\"PAPEL\">PAPEL<br/>\n");
      out.write("            <input type=\"radio\" name=\"jugada\" value=\"TIJERAS\">TIJERA<br/>\n");
      out.write("            <br/>\n");
      out.write("            <input type=\"submit\" value=\"Jugar!\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        ");
 for (Partida opcion : GestorPartidas.getComenzadas()) {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.print(opcion.getFechaCreacion());
      out.write(',');
      out.print(opcion.getJugadorA());
      out.write(',');
      out.print(opcion.getJugadorB());
      out.write("<br/>\n");
      out.write("\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("    </body>\n");
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
