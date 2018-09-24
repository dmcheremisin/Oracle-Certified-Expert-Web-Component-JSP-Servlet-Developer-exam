<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:set var="userType" value="member" />

<h1>Member comments:</h1>
<c:if test="${userType eq 'member'}" >
    <jsp:include page="InputComments.jsp" />
</c:if>

</body>
</html>