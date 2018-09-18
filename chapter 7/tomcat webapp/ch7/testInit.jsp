<html>
<body>
<h1 align="center">Test init parameters</h1>
<%!
    public void jspInit() {
        ServletConfig config = getServletConfig();
        String email = config.getInitParameter("email");
        ServletContext servletContext = config.getServletContext();
        servletContext.setAttribute("mail", email);
    }
%>
<h2> Admin email: <%=application.getAttribute("mail")%> </h2>
</body>
</html>