<%@ page language="java" contentType="text/html; charset=UTF-8" isErrorPage="true" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Erro</title>
</head>
<body>
	<h2 align="center">Ocorreu um erro</h2>
	
	<p align="left">
		<c:out value="${exception.message}"></c:out>
	</p>
	
	<p align="center"><a href="javascript:history.go(-1)">voltar</a></p>
</body>
</html>