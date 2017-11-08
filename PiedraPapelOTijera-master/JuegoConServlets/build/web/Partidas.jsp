<%-- 
    Document   : Partidas
    Created on : 06-nov-2017, 13:00:58
    Author     : japar
--%>

<%@page import="java.util.List"%>
<%@page import="es.ayesa.cursoweb.GestorPartidas"%>
<%@page import="es.ayesa.cursoweb.Partida"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <%GestorPartidas gestor = new GestorPartidas();%>


    <%Partida comp = new Partida();%>
    <body>
        <h1>Crear partida</h1>
        <%--<form action="http://localhost:8080/JuegoConServlets/Partidas.jsp" method="get" target="_blank">--%>
        <form actionServlets="/CompletarPartida.jsp">
            <ul>
                <label for="nombreJugador">Nombre:</label><input name="nombreJugador" required> <br/>
                <label for="jugada">Jugada:</label><br/>
                <input type="radio" name="jugada" value="PIEDRA" required>PIEDRA<br/>
                <input type="radio" name="jugada" value="PAPEL">PAPEL<br/>
                <input type="radio" name="jugada" value="TIJERAS">TIJERA<br/>
                <br/>
                <input type="submit" value="Crear!">                    <%-- Al pulsar Jugar se debe añadir la partida actual a la lista de partida comenzadas 
                    Para añadir la partida a la lista de comenzadas, se usa el método crearPartida(String jugador, String jugada)
                    --%>
                    <%--<a href = "http://localhost:8080/JuegoConServlets/IniciarPartidas.jsp"><input type="submit" value="Jugar!"></a>--%>
            </ul>
        </form>
        <%String Id = gestor.crearPartida(request.getParameter("nombreJugador"), request.getParameter("jugada"));%>
        <h1>Listas de Partidas</h1>
        <% for (Partida opcion : GestorPartidas.getComenzadas()) {%>

        <%String Id2 = opcion.getId();%>
            <%=opcion.getFechaCreacion()%>,<%=opcion.getJugadorA()%>,<a href = "http://localhost:8080/JuegoConServlets/CompletarPartida.jsp?id=<%=Id2%>"><input type="submit" value="Aceptar Desafio!"></a><br/>
        
        <% }%>

    </body>
</html>
