<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Create New Users</h2>
<form:form method="post" action="http://localhost:8080/Project_war_exploded/saveUsers.html">
    <table>
        <tr>
            <td><form:label path="id">User ID</form:label> </td>
            <td><form:input path="id" readonly="true"/></td>
        </tr>
        <tr>
            <td><form:label path="name">User Name</form:label></td>
            <td><form:input path="name" value="${users.name}"/></td>
        </tr>
        <tr>
            <td><form:label path="phoneNo">Phone Number</form:label></td>
            <td><form:input path="phoneNo" value="${users.phoneNo}"/></td>
        </tr>
        <tr>
            <td><form:label path="email">Email</form:label></td>
            <td><form:input path="email" value="${users.email}"/></td>
        </tr>
        <tr>
            <td><form:label path="password">Password</form:label></td>
            <td><form:input path="password" value="${users.password}"/></td>
        </tr>
        <tr>
            <td><form:label path="createdAt">Created At</form:label></td>
            <td><form:input path="createdAt" value="${users.createdAt}"/></td>
        </tr>
        <tr>
            <td><form:label path="updatedAt">Updated AT</form:label></td>
            <td><form:input path="updatedAt" value="${users.updatedAt}"/></td>
        </tr>
        <tr>
        <tr>
            <td>&nbsp;</td>
            <td><input type="submit" value="SAVE"/></td>
        </tr>
    </table>
</form:form>
<br/>
<c:if test="${!empty userss}">
    <table align="center" border="1">
        <tr>
            <th>User ID</th>
            <th>User Name</th>
            <th>Phone Number</th>
            <th>Email</th>
            <th>Password</th>
            <th>Created At</th>
            <th>Updated At</th>
            <th>Options</th>
        </tr>
        <c:forEach items="${userss}" var="users">
            <tr>
                <td><c:out value="${users.id}"/></td>
                <td><c:out value="${users.name}"/></td>
                <td><c:out value="${users.phoneNo}"/></td>
                <td><c:out value="${users.email}"/></td>
                <td><c:out value="${users.password}"/></td>
                <td><c:out value="${users.createdAt}"/></td>
                <td><c:out value="${users.updatedAt}"/></td>
                <td align="center"><a href="editUsers.html?id=${users.id}">Edit</a> | <a href="deleteUsers.html?id=${users.id}">Delete</a> </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<h2><a href="addItems.html">Add Items</a></h2>
<h2><a href="home.html">Home</a></h2>

</body>
</html>
