package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import es.ayesa.cursoweb.GestorPartidas;
import es.ayesa.cursoweb.Partida;

public final class Partidas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Inicio</title>\n");
      out.write("    </head>\n");
      out.write("    ");
GestorPartidas gestor = new GestorPartidas();
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
Partida comp = new Partida();
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1>Crear partida</h1>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <form actionServlets=\"/CompletarPartida.jsp\">\n");
      out.write("            <ul>\n");
      out.write("                <label for=\"nombreJugador\">Nombre:</label><input name=\"nombreJugador\" required> <br/>\n");
      out.write("                <label for=\"jugada\">Jugada:</label><br/>\n");
      out.write("                <input type=\"radio\" name=\"jugada\" value=\"PIEDRA\" required>PIEDRA<br/>\n");
      out.write("                <input type=\"radio\" name=\"jugada\" value=\"PAPEL\">PAPEL<br/>\n");
      out.write("                <input type=\"radio\" name=\"jugada\" value=\"TIJERAS\">TIJERA<br/>\n");
      out.write("                <br/>\n");
      out.write("                <input type=\"submit\" value=\"Crear!\">                    ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </form>\n");
      out.write("        ");
String Id = gestor.crearPartida(request.getParameter("nombreJugador"), request.getParameter("jugada"));
      out.write("\n");
      out.write("        <h1>Listas de Partidas</h1>\n");
      out.write("        ");
 for (Partida opcion : GestorPartidas.getComenzadas()) {
      out.write("\n");
      out.write("\n");
      out.write("        ");
String Id2 = opcion.getId();
      out.write("\n");
      out.write("            ");
      out.print(opcion.getFechaCreacion());
      out.write(',');
      out.print(opcion.getJugadorA());
      out.write(",<a href = \"http://localhost:8080/JuegoConServlets/CompletarPartida.jsp?id=");
      out.print(Id2);
      out.write("\"><input type=\"submit\" value=\"Aceptar Desafio!\"></a><br/>\n");
      out.write("        \n");
      out.write("        ");
 }
      out.write("\n");
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
