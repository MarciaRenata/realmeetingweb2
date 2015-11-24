<%@page import="model.Grupo" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/SessionControl.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="grupo" class="model.Grupo"></jsp:useBean> 
<!DOCTYPE html>
<html>
    <head>
        <%grupo = (Grupo) request.getAttribute("grupo"); %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Grupos</title>
    </head>
    <body>
        ${grupo.nome}  
        
        <h1>Grupo 1</h1>
    </body>
</html>
