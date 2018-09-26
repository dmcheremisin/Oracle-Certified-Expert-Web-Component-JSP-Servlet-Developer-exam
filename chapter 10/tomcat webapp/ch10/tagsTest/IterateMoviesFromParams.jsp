<%@ taglib prefix="it" uri="iterateParamTag" %>
<html>
<body>

<table>
    <it:drawTable movieList="${movies}">
        <tr>
            <td>${movie}</td>
        </tr>
    </it:drawTable>
</table>

</body>
</html>