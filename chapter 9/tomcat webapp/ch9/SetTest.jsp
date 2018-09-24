<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:set target="${dogs}" property="Rex" value="Biglie" />

<h1>Set to map test:</h1>
<p>${dogs.Rex}</p>

</body>
</html>