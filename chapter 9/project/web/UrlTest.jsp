<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<p>
<h1 align="center">Test Url</h1>

<c:set var="first" value="Hidden Cursor" />
<c:set var="last" value="Crouching Pixels" />

<c:url value="InputComments.jsp?first=${first}&last=${last}" var="inputUrl" />
<p>The url using params is: ${inputUrl}</p>
<p>
    <a href="${inputUrl}"> Generated url </a>
</p>

<h2>Another way</h2>
<c:url value="InputComments.jsp" var="anotherUrl" >
    <c:param name="first" value="${first}" />
    <c:param name="last" value="${last}" />
</c:url>
<p>The url using another approach is: ${anotherUrl}</p>


</body>
</html>