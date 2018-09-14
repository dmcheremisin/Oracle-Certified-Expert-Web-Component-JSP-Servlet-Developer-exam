<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Servlet parameter values</h1>
<h2>Context parameters</h2>
<ul>
    <%
        Enumeration<String> contextParams = request.getServletContext().getInitParameterNames();
        while (contextParams.hasMoreElements()) {
    %>
    <li><%=contextParams.nextElement()%></li>
    <%
        }
    %>
</ul>

<h2>Servlet init parameters</h2>
<%
    String userMail = (String) request.getAttribute("userMail");
%>
<p>User email: <%=userMail%> </p>
</body>
</html>