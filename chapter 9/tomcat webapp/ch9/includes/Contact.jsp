<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<%-- Include directive --%>

<c:import url="Header.jsp">
    <c:param name="subTitle" value="We take the sting out of SOAP." />
</c:import>

<br>
<em>We can help.</em> <br><br>
Contact us at: ${initParam.mainEmail}

</body>
</html>