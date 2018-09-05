<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center" >Beer Selection Advice</h1>
<h3>Recommendations: </h3>
<p>
    <%
        List<String> styles = (List<String>) request.getAttribute("styles");
        for (String style : styles) {
    %>
    <br>try: <%=style%> </br>
    <%
        }
    %>
</p>
</body>
</html>