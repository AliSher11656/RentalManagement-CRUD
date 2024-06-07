<%@ include file="home.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>User Login</h2>
<form:form method="post" action="http://localhost:8080/Project_war_exploded/user">
    Email: <input type="text" name="email"><br>
    <br>
    Password: <input type="password" name="password"><br>
    <input type="submit" value="Login">
</form:form>
</body>
</html>
