<% //check se esta logado, caso contratio redireciona para pagina
    String user = null;
    if (request.getSession(false).getAttribute("nome") == null) {
        response.sendRedirect("Login.jsp");
    } else {
        user = (String) session.getAttribute("nome");
        String userName = null;
        String sessionID = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("nome")) {
                    userName = cookie.getValue();
                }
                if (cookie.getName().equals("JSESSIONID")) {
                    sessionID = cookie.getValue();
                }
            }
        } else {
            sessionID = session.getId();
        }
    }
%>
