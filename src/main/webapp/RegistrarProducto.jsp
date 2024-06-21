<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>CL2 - Registrar Producto</title>
	</head>
	<body bgcolor="#c5dec9">
		<h1 align="center">Registrar Producto</h1>
		<form action="ControladorProducto" method="post">
			<table align="center">
				<tr>
					<td>Nombre:</td>
					<td><input type="text" name="nombre" required></td>
				</tr>
				<tr>
					<td>Precio compra:</td>
					<td><input type="number" step="0.01" name="pCompra" required></td>
				</tr>
				<tr>
					<td>Precio venta:</td>
					<td><input type="number" step="0.01" name="pVenta" required></td>
				</tr>
				<tr>
					<td>Estado:</td>
					<td><input type="text" name="estado" required></td>
				</tr>
				<tr>
					<td>Descripción:</td>
					<td><input type="text" name="descr" required></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center">
						<input type="submit" value="Registrar">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>