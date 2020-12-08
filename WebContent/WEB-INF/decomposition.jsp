<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>decomposition</title>
</head>
<body>
	<div >
		<a href="http://localhost:8081/TPqMathematique/secondDegre">Résolution second dégré</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 
			<a href="http://localhost:8081/TPqMathematique/deuxEquation">Résolution deux équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/troisEquation">Résolution trois équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/quatreInconnue">Résolution quatre équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/decomposition">Décomposition nombre</a>
	</div>
	
		<h1 style="color:red;">Décomposition d'un nombre</h1> 
	
	<form method="post" action="decomposition">
		<label><h3>Fonction: </h3></label>
		<input type="number" name="nombre" size="1" placeholder="a" value="${iteration['nombre'] }" style="width: 50px; height: 20px;">
		<input type="submit" value="decomposer"> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;<span>${ modele.erreur['nombre'] }</span>
		
		
			<span><b>${iteration['resultat'] }</b></span></br>
		
	</form>	
	
	<h1 style="color:red;">génerer ppcm de deux nombre</h1> 
	
	<form method="post" action="ppcm">
		<label><h3>Nombre1: </h3></label>
		<input type="number" name="nombre1" size="1" placeholder="a" value="${resultat['valB'] }" style="width: 50px; height: 20px;">
		<input type="number" name="nombre2" size="1" placeholder="b" value="${resultat['valC'] }" style="width: 50px; height: 20px;">
		<input type="submit" value="génerer ppcm"> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;<span><!-- ${ modele.erreur['nombre'] } --></span>
		
		<span> ${resultat['resultat1']}</span></br>
	</form>
	
	<h1 style="color:red;">génerer PGCD de deux nombre</h1> 
	
	<form method="post" action="pgcd">
		<label><h3>Nombre1: </h3></label>
		<input type="number" name="nombre1" size="1" placeholder="a" value="${resultat['valD'] }" style="width: 50px; height: 20px;">
		<input type="number" name="nombre2" size="1" placeholder="b" value="${resultat['valF'] }" style="width: 50px; height: 20px;">
		<input type="submit" value="génerer pgcd"> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;<span>
		
		<span style="color: captiontext;">${resultat['resultat']}</span></br>		
	</form>
	
</body>
</html>