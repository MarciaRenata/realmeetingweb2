<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<%@include file="/SessionControl.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="PagPrincipalUsuarioLogado.css">
        <title>RealMeeting</title>
    </head>
    <body>
        <br/><br/><br/><br/><br/><br/>
        <img src="realmeeting2.png" id="logo1" alt="logo"/>
        <h1><img src="Foto.png" id="fotoPerfil" alt="FPerfil"/> <c:out value="    ${nome}" /></h1>
        
        <p></p>
        <h3><a href ="GrupoServlet">Meus Grupos</a></h3>
        <h3><a href ="CriarGrupoServlet.jsp">Criar Grupos</a></h3>
        <h3><a href ="PesquisarGrupoServlet.jsp">Pesquisar Grupos</a></h3>
        
        <a href ="GrupoServlet"><img src="Grupo1.png" id="grupo1" alt="grupo1"/></a>
        <a><img src="Grupo2.png" id="grupo2" alt="grupo2"/></a>
        <a><img src="Grupo3.png" id="grupo3" alt="grupo3"/></a>
        <p></p>
        <a><img src="Grupo4.png" id="grupo4" alt="grupo4"/></a>
        <a><img src="Grupo5.png" id="grupo5" alt="grupo5"/></a>
        <a><img src="Grupo6.png" id="grupo6" alt="grupo6"/></a>
        <br/><br/>
        <div id="divBusca">
            <input type="text" id="txtBusca" placeholder="Buscar Grupos..."/>
        </div>
        <p></p>
<input type="button" value="Sair" onclick="location.href = 'Logout.jsp'" />
    </body>
</html>
