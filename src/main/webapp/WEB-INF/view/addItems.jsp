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
<h2>Create New Items</h2>
<form:form method="post" action="http://localhost:8080/Project_war_exploded/saveItems.html">
    <table>
        <tr>
            <td><form:label path="id">Item ID</form:label> </td>
            <td><form:input path="id" readonly="true"/></td>
        </tr>
        <tr>
            <td><form:label path="itemName">Item Name</form:label></td>
            <td><form:input path="itemName" value="${items.itemName}"/></td>
        </tr>
        <tr>
            <td><form:label path="rentalPrice">Rental Price</form:label></td>
            <td><form:input path="rentalPrice" value="${items.rentalPrice}"/></td>
        </tr>
        <tr>
            <td><form:label path="description">Description</form:label></td>
            <td><form:input path="description" value="${items.description}"/></td>
        </tr>
        <tr>
            <td><form:label path="status">status</form:label></td>
            <td><form:input path="status" value="${items.status}"/></td>
        </tr>
        <tr>
            <td><form:label path="createdAt">Created At</form:label></td>
            <td><form:input path="createdAt" value="${items.createdAt}"/></td>
        </tr>
        <tr>
            <td><form:label path="updatedAt">Updated AT</form:label></td>
            <td><form:input path="updatedAt" value="${items.updatedAt}"/></td>
        </tr>
        <tr>
            <td><form:label path="keywords">Keywords</form:label></td>
            <td><form:input path="keywords" value="${items.keywords}"/></td>
        </tr>
        <tr>
            <td><form:label path="picture">Picture</form:label></td>
            <td><form:input path="picture" value="${items.picture}"/></td>
        </tr>
        <tr>
            <td>
                <form:label path="usersByUserId.id">User Name:</form:label>
            </td>
            <td>
                <form:select path="usersByUserId.id" cssStyle="width: 150px;">
                    <option value="-1">Select a type</option>
                    <c:forEach items="${users}" var="users">
                        <option value="${users.id}">${users.name}</option>
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
<c:if test="${!empty itemss}">
    <table align="center" border="1">
        <tr>
            <th>Item ID</th>
            <th>Item Name</th>
            <th>Rental Price</th>
            <th>Description</th>
            <th>Status</th>
            <th>Created At</th>
            <th>Updated At</th>
            <th>KeyWords</th>
            <th>User Name</th>
            <th>Picture</th>
            <th>Options</th>
        </tr>
        <c:forEach items="${itemss}" var="items">
            <tr>
                <td><c:out value="${items.id}"/></td>
                <td><c:out value="${items.itemName}"/></td>
                <td><c:out value="${items.rentalPrice}"/></td>
                <td><c:out value="${items.description}"/></td>
                <td><c:out value="${items.status}"/></td>
                <td><c:out value="${items.createdAt}"/></td>
                <td><c:out value="${items.updatedAt}"/></td>
                <td><c:out value="${items.keywords}"/></td>
                <td><c:out value="${items.usersByUserId.name}"/></td>
                <td><c:out value="${items.picture}"/></td>

                <td align="center"><a href="editItems.html?id=${items.id}">Edit</a> | <a href="deleteItems.html?id=${items.id}">Delete</a> </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<h2><a href="addUsersRentedItems.html">View User Rented Items</a></h2>
<h2><a href="home.html">Home</a></h2>

</body>
</html>
