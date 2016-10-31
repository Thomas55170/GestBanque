<%--
  Created by IntelliJ IDEA.
  User: pcthomas
  Date: 24/10/2016
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="Header.jsp" %>
<script>
    $(document).ready(function() {
        $(".btn-pref .btn").click(function () {
            $(".btn-pref .btn").removeClass("btn-primary").addClass("btn-default");
            // $(".tab").addClass("active"); // instead of this do the below
            $(this).removeClass("btn-default").addClass("btn-primary");
        });
    });
</script>
<div class="col-md-offset-1 col-lg-10 col-sm-10">
    <div class="card hovercard">
        <div class="card-background">
            <img class="card-bkimg" alt="" src="http://lorempixel.com/100/100/people/3/">
            <!-- http://lorempixel.com/850/280/people/9/ -->
        </div>
        <div class="useravatar">
            <img alt="" src="http://lorempixel.com/100/100/people/3/">
        </div>
        <div class="card-info"> <span class="card-title">${nom} ${prenom}</span>

        </div>
    </div>
    <div class="btn-pref btn-group btn-group-justified btn-group-lg" role="group" aria-label="...">
        <div class="btn-group" role="group">
            <button type="button" id="stars" class="btn btn-primary" href="#tab1" data-toggle="tab"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                <div class="hidden-xs">Informations</div>
            </button>
        </div>
        <div class="btn-group" role="group">
            <button type="button" id="favorites" class="btn btn-default" href="#tab2" data-toggle="tab"><span class="glyphicon glyphicon-lock" aria-hidden="true"></span>
                <div class="hidden-xs">Mes coffres</div>
            </button>
        </div>
        <div class="btn-group" role="group">
            <button type="button" id="following" class="btn btn-default" href="#tab3" data-toggle="tab"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <div class="hidden-xs">Mes opérations</div>
            </button>
        </div>
    </div>

    <div class="well">
        <div class="tab-content">
            <div class="tab-pane fade in active" id="tab1">
                <h3>Information</h3>
                <div class="row">
                    <div class="col-md-4">Nom</div>
                    <div class="col-md-8">${nom}</div>
                </div>
                <div class="row">
                    <div class="col-md-4">Prenom</div>
                    <div class="col-md-8">${prenom}</div>
                </div>
            </div>
            <div class="tab-pane fade in" id="tab2">
                <h3>Mes coffres</h3>

                <div class="row">
                    <div class="col-md-11">
                        <table class="table table-striped">
                            <th>Localisation</th>
                            <th>Type de Coffre</th>
                            <th>Type de sécurité</th>
                            <th>Frais de garde/mois</th>
                            <c:forEach  items="${ListeCoffre}" varStatus="loopCounter" var="c">
                                <tr>
                                    <td>${c.getLocalisation()}</td>
                                    <td>${c.getTypeCoffre()}</td>
                                    <td>${c.getTypeSecurite()}</td>
                                    <td style="color: red">-${c.getFrais()} €</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>

            </div>
            <div class="tab-pane fade in" id="tab3">
                <h3>Mes opérations</h3>
                <div class="row">
                    <div class="col-md-11">
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
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>




<%@ include file="Footer.jsp" %>