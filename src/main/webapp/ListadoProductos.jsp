<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
<%@page import="model.TblProductocl2" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>CL2 - Listado de Productos</title>
	</head>
	<body bgcolor="#c5dec9">
		<h1 align="center">Listado de productos</h1>
		<h2 align="center"><a href="RegistrarProducto.jsp" style="text-decoration:none">Registrar producto</a></h2>
		<table align="center" border="2">
			<tr>
				<td>Código</td>
				<td>Nombre</td>
				<td>Precio de Compra</td>
				<td>Precio de Venta</td>
				<td>Estado</td>
				<td>Descripción</td>
			</tr>
			<%List<TblProductocl2> listadoProducto = (List<TblProductocl2>)request.getAttribute("listadoProductos");
				if(listadoProducto != null){
					for(TblProductocl2 lis:listadoProducto){
						%>
						<tr>
							<td><%=lis.getIdproductocl2()%></td>
							<td><%=lis.getNombrecl2()%></td>
							<td><%=lis.getPreciocompcl2()%></td>
							<td><%=lis.getPrecioventacl2()%></td>
							<td><%=lis.getEstadocl2()%></td>
							<td><%=lis.getDescripcl2()%></td>
						</tr>
						<%
					}
				}
			%>
		</table>
	</body>
</html>