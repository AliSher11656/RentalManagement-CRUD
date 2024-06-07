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
<h2>Create New UsersRentedItems</h2>
<form:form method="post" action="http://localhost:8080/Project_war_exploded/saveUsersRentedItems.html">
    <table>
        <tr>
            <td><form:label path="id">ID</form:label> </td>
            <td><form:input path="id" readonly="true"/></td>
        </tr>
        <tr>
            <td><form:label path="createdAt">Created At</form:label></td>
            <td><form:input path="createdAt" value="${usersRentedItems.createdAt}"/></td>
        </tr>
        <tr>
            <td><form:label path="updatedAt">Updated AT</form:label></td>
            <td><form:input path="updatedAt" value="${usersRentedItems.updatedAt}"/></td>
        </tr>
        <tr>
            <td>
                <form:label path="usersByUserId.id">User Name:</form:label>
            </td>
            <td>
                <form:select path="usersByUserId.id" cssStyle="width: 150px;">
                    <option value="-1">Select User</option>
                    <c:forEach items="${userss}" var="users">
                        <option value="${users.id}">${users.name}</option>
                    </c:forEach>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="itemsByItemId.id">Item Name:</form:label>
            </td>
            <td>
                <form:select path="itemsByItemId.id" cssStyle="width: 150px;">
                    <option value="-1">Select a type</option>
                    <c:forEach items="${itemss}" var="items">
                        <option value="${items.id}">${items.itemName}</option>
                    </c:forEach>
                </form:select>
            </td>
        </tr>
        <tr>
        <tr>
            <td>&nbsp;</td>
            <td><input type="submit" value="SAVE"/></td>
        </tr>
    </table>
</form:form>
<br/>
<c:if test="${!empty usersRentedItemss}">
    <table align="center" border="1">
        <tr>
            <th>ID</th>
            <th>Created At</th>
            <th>Updated At</th>
            <th>Tournament name</th>
            <th>Event type name</th>

            <th>Options</th>
        </tr>
        <c:forEach items="${usersRentedItemss}" var="usersRentedItems">
            <tr>
                <td><c:out value="${usersRentedItems.id}"/></td>

                <td><c:out value="${usersRentedItems.createdAt}"/></td>
                <td><c:out value="${usersRentedItems.updatedAt}"/></td>

                <td><c:out value="${usersRentedItems.usersByUserId.name}"/></td>
                <td><c:out value="${usersRentedItems.itemsByItemId.itemName}"/></td>


                <td align="center"><a href="editUsersRentedItems.html?id=${usersRentedItems.id}">Edit</a> | <a href="deleteUsersRentedItems.html?id=${usersRentedItems.id}">Delete</a> </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<h2><a href="addUsersRequestedItems.html">View Users Requested Items</a></h2>
<h2><a href="home.html">Home</a></h2>

</body>
</html>
