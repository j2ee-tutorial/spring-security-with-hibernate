<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Spring MVC 5 + Spring Security 5 + Hibernate 5 example</h1>
<h2>${message}</h2>

<form action="${pageContext.request.contextPath}/logout" method="post">
    <input value="Logout" type="submit">
</form>

<a href="product/index">Products</a>

</body>
</html>
