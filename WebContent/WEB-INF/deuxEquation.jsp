<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deux équations</title>
</head>
<body>
	<a href="http://localhost:8081/TPqMathematique/secondDegre">Résolution second dégré</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 
			<a href="http://localhost:8081/TPqMathematique/deuxEquation">Résolution deux équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/troisEquation">Résolution trois équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/quatreInconnue">Résolution quatre équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/decomposition">Décomposition nombre</a>
	<h1 style="color: red;">Résolution de deux équations à deux inconnues</h1>
	<form method="post" action="deuxEquation">
		 <label><h3>Fonction: </h3></label>
		<input type="number" name="a" size="1" placeholder="a" value="${solution['a'] }" style="width: 35px; height: 20px;"> x +
		<input type="number" name="b" size="5" placeholder="b" value="${solution['b'] }" style="width: 35px; height: 20px;"> y = 
		<input type="number" name="c" size="5" placeholder="c" value="${solution['c'] }" style="width: 35px; height: 20px;"> <br/><br/>
		
		<input type="number" name="d" size="1" placeholder="d" value="${solution['d'] }" style="width: 35px; height: 20px;"> x +
		<input type="number" name="e" size="5" placeholder="e" value="${solution['e'] }" style="width: 35px; height: 20px;"> y = 
		<input type="number" name="f" size="5" placeholder="f" value="${solution['f'] }" style="width: 35px; height: 20px;"> <br/><br/>
		<input type="submit" value="résoluer"> <br/><br/>
		<span>${solution['x'] } </span> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;<span>${solution['y'] }</span> <br/>
	</form>
</body>
</html>