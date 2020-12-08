<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Equation</title>
</head> 
<body>
	<div ">
		<a href="http://localhost:8081/TPqMathematique/secondDegre">Résolution second dégré</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 
			<a href="http://localhost:8081/TPqMathematique/deuxEquation">Résolution deux équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/troisEquation">Résolution trois équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/quatreInconnue">Résolution quatre équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/decomposition">Décomposition nombre</a>
	</div>
	
		<h1 style="color:red;">Resolution d'équation du sécond dégré de la forme: ax<sup>2</sup> + bx + c</h1> 
	
	<form method="post" action="secondDegre">
		 <label><h3>Fonction: </h3></label>
		<input type="number" name="a" size="1" placeholder="a" value="${solution['a'] }" style="width: 35px; height: 20px;">x<sup>2</sup> +
		<input type="number" name="b" size="5" placeholder="b" value="${solution['b'] }" style="width: 35px; height: 20px;">x + 
		<input type="number" name="c" size="5" placeholder="c" value="${solution['c'] }" style="width: 35px; height: 20px;"><br/><br/>
		<input type="submit" value="résoluer"> <br/><br/>
		<span>${solution['firstSolution'] } </span> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;<span>${solution['secondSolution'] }</span> <br/>
		<span>${solution['solution'] }</span>
	</form>
		
</body>
</html>