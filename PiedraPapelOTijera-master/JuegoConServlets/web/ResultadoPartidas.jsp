<%-- 
    Document   : ResultadoPartidas
    Created on : 07-nov-2017, 12:23:03
    Author     : PCCom
--%>

<%@page import="es.ayesa.cursoweb.Partida"%>
<%@page import="es.ayesa.cursoweb.GestorPartidas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <%
        String name = request.getParameter("nombreJugador");
        String id = request.getParameter("id");
        String play = request.getParameter("jugada");        
        String ganador = GestorPartidas.completarPartida(id, name, play);
    %>
    <body>
        <%--<form actionServlets="http://localhost:8080/JuegoConServlets/Partidas.jsp">--%>
        <form action="http://localhost:8080/JuegoConServlets/Partidas.jsp" method="get" target="_blank">
            <h1>Resultado</h1>
            <%--<%out.println(ganador);%>--%>
            <input type="submit" value="Jugar otra vez">
            <%--<a href = "http://localhost:8080/JuegoConServlets/Partidas.jsp"><input type="submit" value="Jugar otra vez"></a>--%>
        </form>
        <%out.println("El ganador es: " + ganador);%><br/>
        <h1>Partidas terminadas</h1>
        <% for (Partida opcion : GestorPartidas.getTerminadas()) {%>

            <%=opcion.getFechaCreacion()%>,<%=opcion.getJugadorA()%>,<%=opcion.getJugadorB()%><br/>
        
        <% }%>
    </body>
</html>
