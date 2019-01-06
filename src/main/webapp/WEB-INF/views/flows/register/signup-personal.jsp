<%@page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css/"/>
<spring:url var="js" value="/resources/js/"/>
<spring:url var="images" value="/resources/images/"/>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shop - ${title}</title>

    <script>
        window.menu = '${title}';
        window.contextRoot = '${contextRoot}'
    </script>
    <!-- Bootstrap Core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
    <!-- cos nie czyta-->
    <link href="${css}/assets/css/bootstrap-readable-theme.css" rel="stylesheet">
    <!-- cos nie czyta-->
    <link href="${css}/assets/css/bootstrap-theme.css" rel="stylesheet">
    <!-- cos nie czyta-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Custom CSS -->
    <link href="${css}/myapp.css" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

    <nav class="navbar navbar-inverse navbar-fixed-top " role="navigation">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="">Home</a>
            </div>
        </div>
    </nav>

    <div class="content">
        <div class="container">

            <h3>Tr</h3>

        </div>
    </div>

<!--footer-->
<%@include file="../../shared/footer.jsp" %>
<!-- jQuery -->
<script src="${js}/jquery.js"></script>
<script src="${js}/jquery.validate.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="${js}/bootstrap.min.js"></script>
<!--Database plugin-->
<script src="${js}/jquery.dataTables.js"></script>
<script src="${js}/dataTables.bootstrap.js"></script>
<!--moj js-->
<script src="${js}/myapp.js"></script>
<!--Bootbox-->
<script src="${js}/bootboxx.min.js"></script>
<script src="${js}/bootbox.min.js"></script>



</body>

</html>
