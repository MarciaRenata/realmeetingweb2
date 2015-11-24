<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<html>
    <title>Real Meeting</title>
      
    </head>

  <body>



    <div id="pageheader">
      <jsp:invoke fragment="header"/>
    </div>
    <div class="container" id="body">
      <div class="col-lg-12">
        <div class="row" id="body">
          <jsp:doBody/>
        </div>
      <div class="row" id="pagefooter">
      <hr>
        <jsp:invoke fragment="footer"/>
      </div>
      </div>
    </div>
  </body>
</html>