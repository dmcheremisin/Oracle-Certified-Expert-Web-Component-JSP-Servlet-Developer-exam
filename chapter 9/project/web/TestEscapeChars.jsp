<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1 align="center">Test Escape Characters</h1>
<c:set value="<b></b> tags make things bold!" var="currentTip" scope="page" />

<h2>Tip of the day:</h2>
<p>${pageScope.currentTip}</p>
<p>c:out with explicit true flag <c:out value='${pageScope.currentTip}' escapeXml="true" /></p>
<p>c:out with default true flag <c:out value='${pageScope.currentTip}' /></p>

<h2>Default value test:</h2>
<p>Hello: <c:out value="${user}" default="Guest"/> </p>
<p>The same as: <c:out value="${user}">Guest</c:out></p>


</body>
</html>