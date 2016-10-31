<%--
  Created by IntelliJ IDEA.
  User: pcthomas
  Date: 24/10/2016
  Time: 09:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="Header.jsp" %>

<h1>Liste des opérations sur vos coffres: </h1>
<table class="table table-striped">
<th>Date de début</th>
<th>Date de fin</th>
<th>Type d'opération</th>
<th>Montant</th>
<c:forEach  items="${ListeOperation}" varStatus="loopCounter" var="Operation">
        <tr>
            <td><fmt:formatDate value="${Operation.getDateDebut()}" pattern="dd-MM-yyyy" /></td>
            <td><fmt:formatDate value="${Operation.getDateFin()}" pattern="dd-MM-yyyy" /></td>
            <td>${Operation.getTypeOperation()}</td>

            <c:if test="${Operation.getTypeOperation() == 'Dépot'}">
                <td style="color: green">+${Operation.getMontant()} €</td>
            </c:if>

            <c:if test="${Operation.getTypeOperation() == 'Retrait'}">
                <td style="color: red">-${Operation.getMontant()} €</td>
            </c:if>

        </tr>

</c:forEach>

</table>


<%@ include file="Footer.jsp" %>