<%--
  Created by IntelliJ IDEA.
  User: jenny
  Date: 2022-09-09
  Time: 오전 2:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <h1>Todo List</h1>

<body>
<h1>List Page</h1>
<ul>
    <c:forEach var="dto" items="${list}">
        <li>${dto}</li>
    </c:forEach>
</ul>
</body>
</html>
