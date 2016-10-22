<%@page import="domain.Waffle"%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="allWaffles" class="service.WaffleTypes" scope="page" />
<% allWaffles.initialize(); %>
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
    <%
        for (Waffle waffle : allWaffles.getAllWaffles())
            out.println("<tr><td>" + waffle.getType() + "</td><td>" + waffle.getPrice() + " zł</td></tr>");
    %>
</table>

<p><a href="index.jsp">Wróć</a></p>

</body>
</html>
