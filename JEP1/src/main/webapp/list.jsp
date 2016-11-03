<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="allWaffles" class="service.WaffleTypes" scope="application" />
<jsp:useBean id="waffle" class="domain.Waffle" scope="application" />

<style>
    table,td{border:1px solid black;text-align:center;}
</style>

<html>
<head>
    <title>Lista gofrów</title>
</head>
<body>
<h2>Lista Gofrów</h2>
<table>
    <tr>
        <td>Typ</td>
        <td>Cena</td>
    </tr>
    <c:forEach items="${allWaffles.allWaffles}" var="element">
        <tr><td><c:out value="${element.type}"/></td><td><c:out value="${element.price} zł"/></td></tr>
    </c:forEach>
</table>

<p><a href="index.jsp">Wróć</a></p>

</body>
</html>
