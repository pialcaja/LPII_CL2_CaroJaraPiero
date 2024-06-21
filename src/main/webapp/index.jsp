<html>
	<body bgcolor="#c5dec9">
		<h1 align="center">Ingresar al Sistema</h1>
		<form action="ControladorUsuario" method="post">
			<table align="center" border="2">
				<tr>
					<td>Usuario</td>
					<td><input type="text" name="usuario" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center">
						<input type="submit" value="Validar">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
