<%--
  Created by IntelliJ IDEA.
  User: pcthomas
  Date: 24/10/2016
  Time: 09:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:f="http://java.sun.com/jsf/core"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:ui="http://java.sun.com/jsf/facelets"
      xmlns:c="http://java.sun.com/jstl/core">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>GestBanque</title>

    <link href="../Assets/css/bootstrap.css" rel="stylesheet">
    <link href="../Assets/css/bootstrap-custom-header.css" rel="stylesheet">
    <link href="../Assets/css/bootstrap-custom-footer.css" rel="stylesheet">
    <link href="../Assets/css/bootstrap-custom-profil.css" rel="stylesheet">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="../Assets/js/bootstrap.min.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<header>
    <div class="container">

        <!-- Static navbar -->
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">GestBanque</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <c:if test="${sessionScope['bool'] == true}">
                        <ul class="nav navbar-nav">
                            <li><a href="<%=request.getContextPath()%>/compte"><i class="glyphicon glyphicon-user"></i> Mon Compte</a></li>
                            <li><a href="<%=request.getContextPath()%>/boutique"><i class="glyphicon glyphicon-shopping-cart"></i> Boutique</a></li>
                            <li><a href="<%=request.getContextPath()%>/operation"><i class="glyphicon glyphicon-list-alt"></i> Liste des Opérations</a></li>
                        </ul>

                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="<%=request.getContextPath()%>/deconnexion"><i class="glyphicon glyphicon-log-out"></i> Déconnexion</a></li>
                        </ul>
                    </c:if>
                </div><!--/.nav-collapse -->
            </div><!--/.container-fluid -->
        </nav>
    </div>
</header>
<br /><br /><br /><br /><br />
<div class="container">
    <div id="alert_placeholder"></div>
