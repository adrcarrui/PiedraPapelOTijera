<%-- 
    Document   : CompletarPartida
    Created on : 06-nov-2017, 23:46:14
    Author     : PCCom
--%>
<%@page import="es.ayesa.cursoweb.Partida"%>
<%@page import="es.ayesa.cursoweb.GestorPartidas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Completa</title>
    </head>
    <body>
    <%String Id = request.getParameter("id");
    GestorPartidas ges = new GestorPartidas();
    
    
    %>

        <h1>Completa Partida</h1>
        <form action="http://localhost:8080/JuegoConServlets/ResultadoPartidas.jsp" method="get" target="_blank">
        <%--<form actionServlets="http://localhost:8080/JuegoConServlets/ResultadoPartidas.jsp">--%>
        <input type="hidden" value="<%=request.getParameter("id")%>" name="id">
            <label for="nombreJugador">Nombre:</label><input name="nombreJugador" required> <br/>
            <label for="jugada">Jugada:</label><br/>
            
            <input type="radio" name="jugada" value="PIEDRA" required>PIEDRA<br/>
            <input type="radio" name="jugada" value="PAPEL">PAPEL<br/>
            <input type="radio" name="jugada" value="TIJERAS">TIJERA<br/>
            <br/>
            <input type="submit" value="Jugar!">


        <%--</form>
        <% for (Partida opcion : GestorPartidas.getComenzadas()) {%>


        <%=opcion.getFechaCreacion()%>,<%=opcion.getJugadorA()%>,<%=opcion.getJugadorB()%><br/>

        <% }%>--%>
    </body>
</html>
