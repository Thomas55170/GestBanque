<%--
  Created by IntelliJ IDEA.
  User: pcthomas
  Date: 25/10/2016
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="Header.jsp" %>
<h1>Bienvenue sur la boutique</h1>

<p>${listeCoffre.getListeCoffresBoutique()[1]}</p>

<c:forEach items='${listeCoffre.getListeCoffresBoutique()}' var='coffre'>
    <div style="border: 1px solid black;">
        <ul>
            <li><c:out value ='${coffre}' /></li>
        </ul>
    </div>
</c:forEach>


<%@ include file="Footer.jsp" %>