<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<p>Bonjour ${ auteur.prenom } ${ auteur.nom }</p>
	<p>${auteur.actif  ? "Vous êtes actif !" : "Vous êtes inactif"}
	<p><c:out value="Bonjour !" /></p>
	
	
</body>
</html>