<%-- 
    Document   : IniciarPartidas
    Created on : 06-nov-2017, 20:16:20
    Author     : TIC
--%>

<%@page import="es.ayesa.cursoweb.Partida"%>
<%@page import="es.ayesa.cursoweb.GestorPartidas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    GestorPartidas gestor = new GestorPartidas();
    <body>
        <!Crear partida>
        

    <!Completar partida>
    <ul>
        <%for (Partida opcion : GestorPartidas.getComenzadas()) {%>
        <li><%=opcion.getFechaCreacion()%>,<%=opcion.getJugadorA()%>
            <a href = "CompletarPartida.jsp?id=<%=opcion.getId()%>>">
            </a>
        </li>

        <%{%>
    </ul>
</body>
</html>
