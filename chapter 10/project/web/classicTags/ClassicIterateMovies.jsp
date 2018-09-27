<%@ taglib prefix="it" uri="classicIterateMovies" %>
<html>
<body>

<table>
    <it:iterateMovies>
        <tr>
            <td>${movie}</td>
        </tr>
    </it:iterateMovies>
</table>

</body>
</html>