<html>
<body>
<%-- Include directive --%>
<%@include file="Header.jsp"%>

<jsp:include page="SubHeader.jsp">
    <jsp:param name="subTitle" value="We take the sting out of SOAP." />
</jsp:include>

<br>
<em>We can help.</em> <br><br>
Contact us at: ${initParam.mainEmail}

<%-- JSP standard action --%>
<jsp:include page="Footer.jsp" />

</body>
</html>