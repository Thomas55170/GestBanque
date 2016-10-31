<%--
  Created by IntelliJ IDEA.
  User: pcthomas
  Date: 30/10/2016
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="Header.jsp" %>

<h1>Bienvenue sur la page de commande</h1>

<form accept-charset="UTF-8" method="post" role="form" action="connexion">
    <fieldset>
        <select>
            <c:forEach items="${listeCoffre}" varStatus="loopCounter"  var='c'>
                <option name="${c.getId()}">${c.getTypeCoffre()}</option>
            </c:forEach>
        </select>
        <button class="btn btn-lg btn-primary btn-block" value="Commander" type="submit">Commander</button>
    </fieldset>
</form>

<%@ include file="Footer.jsp" %>