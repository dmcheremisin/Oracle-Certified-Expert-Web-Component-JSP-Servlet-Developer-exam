<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Servlet parameter values</h1>
<h2>Context parameters</h2>
<ul>
    <%
        ServletContext ctx = request.getServletContext();
        Enumeration<String> contextParams = ctx.getInitParameterNames();
        while (contextParams.hasMoreElements()) {
            String name = contextParams.nextElement();
    %>
    <li><%=name%> : <%=ctx.getInitParameter(name)%></li>
    <%
        }
    %>
</ul>

<h2>Servlet init parameters</h2>
<%
    String userMail = (String) request.getAttribute("otherMail");
%>
<p>User email: <%=userMail%> </p>
</body>
</html>