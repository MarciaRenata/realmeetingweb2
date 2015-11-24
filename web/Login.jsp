<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
    
    <head>    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="Login.css">
        <title>Real Meeting</title>    
    </head>
    
    <body>
        <br/><br/><br/><br/><br/><br/><br/>
            <img src="realMeeting1.png" id="logo1" alt="logo"/>
                    <form action="LoginServlet" method="POST">
                        <br>
                        <label for="inputEmail">E-mail</label>
                        <input type="text" name="login" placeholder="Digite o seu e-mail..." /> <br>
                        <label for="inputPassword">Senha</label>
                        <input type="password" name="password" placeholder="Digite a sua senha..." /><br>
                       
                        <br>
                        <br>
                    
                    
                        <input type="submit" value="Acessar"/>
                        <input type="button" value="Cadastrar-se" onclick="location.href = 'Cadastro.jsp'" />
                        <p>${mensagem}</p>  
                    
                    </form>
                
        
    </body>
</html>
