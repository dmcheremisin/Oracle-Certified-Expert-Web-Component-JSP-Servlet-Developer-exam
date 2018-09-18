<html>
<body>
<h1 align="center">JSP variable declarations</h1>
<%! int count = 0; %>
<%!
    int incCount() {
        count++;
        return count;
    }
%>

<h2>The page count is: <%=incCount()%></h2>

</body>
</html>