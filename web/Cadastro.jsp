<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="t" %>
<!DOCTYPE html>
<html>
    
    <head>    
        <title>Real Meeting</title>    
        <link rel="stylesheet" type="text/css" href="PagPrincipalUsuarioLogado.css">
    </head>
    
    <body>
        <br/><br/><br/><br/><br/><br/><br/>
        <img src="realMeeting1.png" id="logo1" alt="logo"/>
                    <h2>Cadastro</h2>  
                    <form id="conteudo" action='CadastroServlet' method='POST'>
                       
                            Nome: <input type='text' name='nome'>
                            <br/>
                            E-mail: <input type='text' name='email'>
                            <br/>
                            Senha:<input type='password' name='senha'>
                            <br/>
                            Confirme Senha:<input type='password' name='confirmeSenha'>
                            <br/>
                            <input type='submit' value='Confirmar'>
                        </form>
                            <a href="<c:url value='PaginaInicial.jsp' />">Página Inicial</a>
                            <a href="<c:url value='Login.jsp' />">Login</a>
          
    </body>
</html>