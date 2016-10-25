<%--
  Created by IntelliJ IDEA.
  User: pcthomas
  Date: 24/10/2016
  Time: 09:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="Header.jsp" %>
<form method="post" class="form-signin col-lg-3 col-lg-offset-4" action="connexion" >
    <h2 class="form-signin-heading">Se connecter</h2>

    <label for="inputLogin" class="sr-only">Login</label>
    <input type="login" name="login" id="inputLogin" class="form-control" placeholder="Login" required autofocus>

    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required>

    <button class="btn btn-lg btn-primary btn-block" value="Connexion" type="submit">Valider</button>
</form>
<%@ include file="Footer.jsp" %>