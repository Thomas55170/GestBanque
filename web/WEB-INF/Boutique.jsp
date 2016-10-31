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

<form accept-charset="UTF-8" method="post" role="form" action="boutique">
    <fieldset>
        <legend>Partie Commande</legend>
        <select name="select_commande">
            <c:forEach items="${listeCoffre}" varStatus="loopCounter"  var='c'>
                <option name="${c.getId()}">${c.getTypeCoffre()}</option>
            </c:forEach>
        </select>
        <button class="btn btn-lg btn-primary btn-block" value="Commander" type="submit">Commander</button>
    </fieldset>
</form>


<div class="row">
<c:forEach items="${listeCoffre}" varStatus="loopCounter"  var='c'>

    <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
            <img src="../Assets/img/coffre.jpg" alt="coffre-fort">
            <div class="caption">
                <h3>${c.getTypeCoffre()}</h3>
                <ul>
                    <li>Localisation: ${c.getLocalisation()}</li>
                    <li>Type de coffre: ${c.getTypeCoffre()}</li>
                    <li>Type de sécurité: ${c.getTypeSecurite()}</li>
                    <li>Frais/mois: ${c.getFrais()} €</li>
                </ul>
            </div>
        </div>
    </div>

</c:forEach>
</div>
<%@ include file="Footer.jsp" %>