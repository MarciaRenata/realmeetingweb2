<%
    if (request.getAttribute("nome") == null) {
        request.getSession(false).setAttribute("nome", null);
        response.sendRedirect("Login.jsp");
    }
%>
