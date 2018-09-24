<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<h1>Test catch block.</h1>

<c:catch var="myError">
    <% int x = 10 / 0 ; %>
</c:catch>

<c:if test="${myError != null}" >
    <p>There was an error, but we survived.</p>
</c:if>

</body>
</html>

