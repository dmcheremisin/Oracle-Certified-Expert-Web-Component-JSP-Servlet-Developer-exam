<html>
<body>
<h1 align="center">Test bean</h1>

<!-- Type is abstract class Person, actual class is Employee -->
<jsp:useBean id="personOne" type="com.example.model.Person" class="com.example.model.Employee">
    <jsp:setProperty name="personOne" property="id" value='<%=request.getParameter("id")%>' />
    <jsp:setProperty name="personOne" property="name" value='<%=request.getParameter("name")%>' />
</jsp:useBean>
<p>Person One id: <jsp:getProperty name="personOne" property="id" /></p>
<p>Person One name: <jsp:getProperty name="personOne" property="name" /></p>

<!-- This is the same as: -->
<jsp:useBean id="personTwo" type="com.example.model.Person" class="com.example.model.Employee" >
    <jsp:setProperty name="personTwo" property="id" param="id" />
    <jsp:setProperty name="personTwo" property="name" param="name" />
</jsp:useBean>
<p>Person Two id: <jsp:getProperty name="personTwo" property="id" /></p>
<p>Person Two name: <jsp:getProperty name="personTwo" property="name" /></p>

<!-- Case when all form field names correspond to bean field names: -->
<jsp:useBean id="personThree" class="com.example.model.Employee" >
    <!-- This will set all corresponding fields (form-bean) to each other (name==>name) -->
    <jsp:setProperty name="personThree" property="*" />
</jsp:useBean>
<p>Person Three id: <jsp:getProperty name="personThree" property="id" /></p>
<p>Person Three name: <jsp:getProperty name="personThree" property="name" /></p>
<p>Person Three position: <jsp:getProperty name="personThree" property="position" /></p>

</body>
</html>