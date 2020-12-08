<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>quatre équation</title>
</head>
<body>
		<a href="http://localhost:8081/TPqMathematique/secondDegre">Résolution second dégré</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp; 
		<a href="http://localhost:8081/TPqMathematique/deuxEquation">Résolution deux équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/troisEquation">Résolution trois équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/quatreInconnue">Résolution quatre équations</a>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		<a href="http://localhost:8081/TPqMathematique/decomposition">Décomposition nombre</a>
	
	
		<h1 style="color: red;">Résolution de quatres équations à quatres inconnues</h1>
	<form method="post" action="quatreInconnue">
		<input type="number" name="a" size="1" placeholder="a" value="${resolution['a'] }" style="width: 35px; height: 20px;"> x +
		<input type="number" name="b" size="5" placeholder="b" value="${resolution['b'] }" style="width: 35px; height: 20px;"> y + 
		<input type="number" name="c" size="5" placeholder="c" value="${resolution['c'] }" style="width: 35px; height: 20px;"> z +
		<input type="number" name="d" size="5" placeholder="d" value="${resolution['d'] }" style="width: 35px; height: 20px;"> w =
		<input type="number" name="q" size="5" placeholder="q" value="${resolution['q'] }" style="width: 35px; height: 20px;"> <span>${resolution['erreur1'] }</span><br/>
		
		<input type="number" name="e" size="1" placeholder="e" value="${resolution['e'] }" style="width: 35px; height: 20px;"> x +
		<input type="number" name="f" size="5" placeholder="f" value="${resolution['f'] }" style="width: 35px; height: 20px;"> y + 
		<input type="number" name="g" size="5" placeholder="g" value="${resolution['g'] }" style="width: 35px; height: 20px;"> z +
		<input type="number" name="h" size="5" placeholder="h" value="${resolution['h'] }" style="width: 35px; height: 20px;"> w =
		<input type="number" name="r" size="5" placeholder="r" value="${resolution['r'] }" style="width: 35px; height: 20px;"> <span>${resolution['erreur2'] }</span><br/>
		
		<input type="number" name="i" size="1" placeholder="i" value="${resolution['i'] }" style="width: 35px; height: 20px;"> x +
		<input type="number" name="j" size="5" placeholder="j" value="${resolution['j'] }" style="width: 35px; height: 20px;"> y + 
		<input type="number" name="k" size="5" placeholder="k" value="${resolution['k'] }" style="width: 35px; height: 20px;"> z +
		<input type="number" name="l" size="5" placeholder="l" value="${resolution['l'] }" style="width: 35px; height: 20px;"> w =
		<input type="number" name="s" size="5" placeholder="s" value="${resolution['s'] }" style="width: 35px; height: 20px;"> <span>${resolution['erreur3'] }</span><br/>
		
		<input type="number" name="m" size="1" placeholder="m" value="${resolution['m'] }" style="width: 35px; height: 20px;"> x +
		<input type="number" name="n" size="5" placeholder="n" value="${resolution['n'] }" style="width: 35px; height: 20px;"> y + 
		<input type="number" name="o" size="5" placeholder="o" value="${resolution['o'] }" style="width: 35px; height: 20px;"> z +
		<input type="number" name="p" size="5" placeholder="p" value="${resolution['p'] }" style="width: 35px; height: 20px;"> w =
		<input type="number" name="t" size="5" placeholder="t" value="${resolution['t'] }" style="width: 35px; height: 20px;"> <span>${resolution['erreur4'] }</span><br/><br/>
		<input type="submit" value="résoluer"> <br/><br/>
		<span><b>${resolution['valX'] } </b></span> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;<span><b>${resolution['valY'] }</b></span>
		&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;<span><b>${resolution['valZ'] }</b></span> 
		&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;<span><b>${resolution['valW'] }</b></span> <br/>
		
	</form>
</body>
</html>