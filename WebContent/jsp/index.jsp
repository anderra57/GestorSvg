<!DOCTYPE html>
<html>
<head>
<title>Gestor SVG</title>
<link href="/GestorSvg/css/styleSheet.css" rel="stylesheet" />
<meta charset="utf-8">
</head>

<body>
	<header>
		<h1>Gestor Im�genes SVG en eXist</h1>
		<h3>SW 2020</h3>
	</header>

	<section>
		<font>Informaci�n: <%=request.getAttribute("informacion")%>
		</font>
	</section>

	<section>
		<form id="LeerRecursos" method="GET" action="/GestorSvg/apiLR">
			<table>
				<tr>
					<td>Nombre Colecci�n:</td>
					<td><input id="collection" required name="collection" /></td>
				</tr>
			</table>
		</form>
		<hr />
		<button type="submit" id="index" form="LeerRecursos">Ver
			Imagenes</button>
	</section>


	<section>
		<form id="ImagenNueva" method="GET" action="/GestorSvg/apiNI">
			<table>
				<tr>
					<td>Nombre:</td>
					<td><input id="resource" required name="svgName" /></td>
					<td>Colecci�n:</td>
					<td><input id="collection" required name="collection" /></td>
				</tr>
			</table>
		</form>
		<hr />
		<button id="index" form="ImagenNueva">Nueva Imagen</button>
	</section>

	<section>
		<form id="CrearColeccion" method="GET" action="/GestorSvg/apiCC">
			<table>
				<tr>
					<td>Nombre Nueva Colecci�n:</td>
					<td><input id="collection" required name="collection" /></td>
				</tr>
			</table>
		</form>
		<hr />
		<button type="submit" id="index" form="CrearColeccion">Crear
			coleccion</button>
		</section>

	<section>
		<form id="BorrarColeccion" method="GET" action="/GestorSvg/apiDC">
			<table>
				<tr>
					<td>Nombre Colecci�n:</td>
					<td><input id="collection" required name="collection" /></td>
				</tr>
			</table>
		</form>
		<hr />
		<button id="index" form="BorrarColeccion">Borrar coleccion</button>
	</section>

	<footer>Sistemas Web - Escuela Ingenier�a de Bilbao</footer>
</body>
</html>