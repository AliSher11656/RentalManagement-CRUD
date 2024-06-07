<!DOCTYPE html>
<html>
<head>
    <title>Navbar</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<nav>
    <ul>
        <li><a href="http://localhost:8080/Project_war_exploded/home.html">Home</a></li>
        <li><a href="http://localhost:8080/Project_war_exploded/user/profile">Profile</a></li>
        <li><a href="http://localhost:8080/Project_war_exploded/item/add">Add Item</a></li>
        <li><a href="http://localhost:8080/Project_war_exploded/item/list">Item List</a></li>
        <li><a href="http://localhost:8080/Project_war_exploded/favorite/list?userId=${user.id}">Favorites</a></li>
        <li><a href="http://localhost:8080/Project_war_exploded/user/requests?userId=${user.id}">Requested Items</a></li>
        <li><a href="http://localhost:8080/Project_war_exploded/user/rentals?userId=${user.id}">Rented Items</a></li>
        <li><a href="http://localhost:8080/Project_war_exploded/user/logout">Logout</a></li>
    </ul>
</nav>
</body>
</html>
