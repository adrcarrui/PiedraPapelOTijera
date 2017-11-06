
<%@page import="es.ayesa.cursoweb.Partida"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            response.setContentType("text/html;charset=UTF-8");
            String jugador = request.getParameter("nombreJugador");
            String jugada = request.getParameter("jugada");

            String jugadaMaquina = Partida.generarJugadaAleatoria();
            String nombreMaquina = "T1000";

            Partida partidaContraLaMaquina = new Partida(jugador, jugada, nombreMaquina, jugadaMaquina);
            String[] posiblesJugadas={"PIEDRA","PAPEL","TIJERA"};
        %>
        <h1><%=partidaContraLaMaquina.resultado()%></h1>
        JugadorHumano:<%=jugador%>, jugada <b><%=jugada%></b><br/>
        JugadorMaquina:<%=nombreMaquina%>, jugada <b><%=jugadaMaquina%></b><br/>
        <% if(partidaContraLaMaquina.getGanador().equals(jugador)){%>
        <h2>No me creo que le hayas ganado a <%=nombreMaquina%></h2>
        <%}%>
        
        Las opciones son:
        <%for(String opcion:posiblesJugadas){%>
            <li><%=opcion%></li>
        <%}%>
    </body>
</html>
