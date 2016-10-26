<%--
  Created by IntelliJ IDEA.
  User: pcthomas
  Date: 25/10/2016
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="Header.jsp" %>

<h1>Bienvenue sur la boutique</h1>
test
<p>${listeCoffre[1].getLocalisation()}</p>

<c:forEach items="${listeCoffre}" varStatus="loopCounter"  var='c'>

    <div style="border: 1px solid black;">
        <ul>
                ${c.getLocalisation()}
                ${loopCounter.count}
             <br />
             <br />
            <li></li>
        </ul>
    </div>
</c:forEach>

<%@ include file="Footer.jsp" %>