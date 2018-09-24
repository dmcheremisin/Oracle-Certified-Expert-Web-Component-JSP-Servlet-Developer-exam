<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1 align="center">Test Remove value</h1>
<c:set value="first" var="one"  />
<c:set value="second" var="two"  />

<p>One: ${one}</p>
<p>Two: ${two}</p>

<c:remove var="two" />

<h2>After second is removed</h2>

<p>One: ${one}</p>
<p>Two: ${two}</p>


</body>
</html>