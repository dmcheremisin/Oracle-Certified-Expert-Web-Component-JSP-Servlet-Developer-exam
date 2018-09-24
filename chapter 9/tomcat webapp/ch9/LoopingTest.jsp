<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<h1>Test loop</h1>

<h2>Single loop</h2>
<table>
    <c:forEach var="movie" items="${movieList}" varStatus="counter" >
        <tr>
            <td>${counter.count}</td>
            <td>${movie}</td>
        </tr>
    </c:forEach>
</table>

<h1>Nested loops:</h1>
<c:forEach var="movieSet" items="${allMovies}">
    <p><b>Set of movies:</b></p>
    <c:forEach var="movie" items="${movieSet}">
        <p>${movie}</p>
    </c:forEach>
</c:forEach>

</body>
</html>