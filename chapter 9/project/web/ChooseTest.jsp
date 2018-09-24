<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:set var="userPref">
    performance
</c:set>

<h1>User tip:</h1>
<c:choose>
    <c:when test="${userPref eq 'performance' }" >
        Now you can stop even if you <em>do</em> drive insanely fast.
    </c:when>
    <c:when test="${userPref eq 'safety'}" >
        Our brakes will never lock up, no matter how bad a driver you are.
    </c:when>
    <c:when test="${userPref eq 'maitanance'}" >
        You won’t have to service these brakes for at least three years.
    </c:when>
    <c:otherwise>
        Our brakes are the best.
    </c:otherwise>
</c:choose>

</body>
</html>