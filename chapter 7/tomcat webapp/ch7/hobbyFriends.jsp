<%@ page import="java.util.List" %>
<html>
<body>
<h1 align="center">The friends who share your hobby of <%=request.getAttribute("hobby")%> are:</h1>
<ul>
    <%
        List<String> friends = (List<String>) request.getAttribute("friends");
        for (String friend : friends) {
    %>
    <li><%=friend%></li>
    <%
        }
    %>
</ul>

</body>
</html>