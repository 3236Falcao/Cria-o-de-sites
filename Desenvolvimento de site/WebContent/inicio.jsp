<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="">
	
		<label>Nome:</label>
		<input type="text" name="nome">
		<label>E-mail:</label>
		<input type="email" name="email">
		<br>
		<label>Cidade:</label>
		<input type="text" name="cidade">
		<label>Telefone:</label>
		<input type="text" name="telefone">
		<br>
		<label>Departamento:</label>
		<br>
		<input type="radio" id="comercial" name="departamento" value="Comercial">
		<label for="comercial">Comercial</label><br>	
		<input type="radio" id="financeiro" name="departamento" value="Financeiro">
		<label for="financeiro">Financeiro</label><br>
		<input type="radio" id="juridico" name="departamento" value="Jurídico">
		<label for="juridico">Jurídico</label>
		<br>
		<label>Mensagem:</label>
		<input type="text" name="mensagem">
	
	</form>

</body>
</html>