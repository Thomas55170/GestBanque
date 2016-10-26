<%--
  Created by IntelliJ IDEA.
  User: pcthomas
  Date: 24/10/2016
  Time: 09:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="Header.jsp" %>
<c:forEach var="Operation" items="${request}">
    <div style="border: 1px solid black;">
        <ul>
            <li><c:out value ='${Operation}' /></li>
        </ul>
    </div>
</c:forEach>


<tr>
    <td><INPUT TYPE='radio' NAME="choix" VALUE=<%= (String)request.getAttribute("choix") %>></td>
    <td><%= (String)request.getAttribute("dateDebut") %></td>
    <td><%= (String)request.getAttribute("prenom") %></td>
    <td><%= (String)request.getAttribute("telfixe") %></td>
    <td><%= (String)request.getAttribute("telport") %></td>
    <td><%= (String)request.getAttribute("mail") %></td>
    <td><%= (String)request.getAttribute("choix") %></td>
</tr>


<%@ include file="Footer.jsp" %>