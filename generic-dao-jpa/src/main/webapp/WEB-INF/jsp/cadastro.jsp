<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Cadastro</title>	
	<link rel="stylesheet" type="text/css" href="<c:url value="css/style.css" />">
</head>
<body>
	<div class="box">
		<h2>Cadastro de Cliente</h2>

		<form action="salvar.html" method="post">
			<div>
				<label>Nome: </label> 
				<input type="text" name="name" size="50" maxlength="50" />
			</div>
			<div>
				<label>Sexo: </label> 
				<select name="sex">
					<option value="M">Masculino</option>
					<option value="F">Feminino</option>
				</select>
			</div>
			<div>
				<label>Data de Nascimento: </label> 
				<input type="text" name="birth" size="10" maxlength="10" />
			</div>
			<div>
				<input type="submit" value="Enviar" /> <input type="reset" value="Limpar" />
			</div>
		</form>
	</div>
</body>
</html>