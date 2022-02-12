<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
	<form action="commande" method="post">
		<input type="radio" value="false" name="AEMPORTER"><label>Sur
			place</label> <input type="radio" value="true" name="AEMPORTER"><label>à
			emporter</label> <br>
		<label for="burger">Votre Burger</label>
		<select name="burger">
			<c:forEach var="burger" items="${burgerLists}">
				<option value="${burger.getId()}">${burger.getNom()}</option>
			</c:forEach>
		</select> <br>
		<label>Votre accompagnement</label>
		<select name="accompagnement">
			<c:forEach var="accompagnement" items="${accompagnements}">
				<option value="${accompagnement.getId()}">${accompagnement.getNom()}</option>
			</c:forEach>
		</select> <br>
		<label>Votre boisson</label>
		<select name="boisson">
			<c:forEach var="boisson" items="${boissons}">
				<option value="${boisson.getId()}">${boisson.getNom()}</option>
			</c:forEach>
		</select> <br>
		<label>Remarques sur votre commande</label>
		<textarea rows="5" name="remarques"></textarea>
		<br> <label>Sauce(s)</label>
		<c:forEach var="sauce" items="${sauces}">
			<input type="checkbox" value="${sauce.getNom()}">${sauce.getNom()}
		</c:forEach> <br>
		<label>Numéro de CB</label> <input type="text" name="numCb"><br>

		<label>Mois</label> <select name="mois">
		<% for (int i = 1; i <= 12; ++i) { %>
			<option value="<%=i%>"><%=i%></option>
		<%} %>
			<!-- list value mois -->

		</select> <br>
		<label>Année</label> <select name="annee">
		<% for (int i = LocalDate.now().getYear(); i < LocalDate.now().getYear()+ 4; ++i) { %>
			<option value="<%=i%>"><%=i%></option>
		<%} %>
		</select> <br>
		<!-- List déroulante -->

		<label>Cryptogramme</label> <input type="text"><br> <input
			type="submit" value="Commander">

	</form>
</body>
</html>