<%--
  Created by IntelliJ IDEA.
  User: pcthomas
  Date: 24/10/2016
  Time: 09:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="Header.jsp" %>

<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="glyphicon glyphicon-log-in"></i> Se connecter</h3>
                </div>
                <div class="panel-body">
                    <form accept-charset="UTF-8" method="post" role="form" action="connexion">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="Nom de l'agent" autofocus name="login" type="text">
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Prénom de l'agent" required name="password" type="password" value="">
                            </div>
                            <button class="btn btn-lg btn-primary btn-block" value="Connexion" type="submit">Connexion</button>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="Footer.jsp" %>
<script>
    $(document).ready(function(){
        ShowAlert("Vous êtes déconnecter de l'application, veuillez vous identifier.", "alert-info");
    })

</script>