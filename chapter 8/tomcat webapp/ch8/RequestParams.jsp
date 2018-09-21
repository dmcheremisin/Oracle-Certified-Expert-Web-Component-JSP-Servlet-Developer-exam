<html>
<body>
<h1 align="center">Test request params</h1>

<h2>Form params</h2>
<p>Name: ${param.name}</p>
<p>Name through param values: ${paramValues.name[0]}</p>
<p>Food: ${param.food}</p>
<p>First food: ${paramValues.food[0]}</p>
<p>Second food: ${paramValues.food[1]}</p>

<h2>Request param host</h2>
<p>Host with scriplet: <%=request.getHeader("host")%> </p>
<p>Host with EL dot: ${header.host} </p>
<p>Host with EL bracket: ${header["host"]} </p>

<h2>Request param method</h2>
<p>Method with scriplet: <%=request.getMethod()%> </p>
<p>Method with EL dot: ${pageContext.request.method} </p>

<h2>Context param</h2>
<p>Context param with scriplet: email is: <%= application.getInitParameter("mainEmail") %> </p>
<p>Context param with EL dot: ${ initParam.mainEmail} </p>

<h2>Cookie param</h2>
<p>Cookie with EL dot: ${ cookie.JSESSIONID.value} </p>


</body>
</html>