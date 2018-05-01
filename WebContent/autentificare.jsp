<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page
	import="java.util.Date, java.text.SimpleDateFormat, java.text.ParseException"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Asociatia de proprietari Revolutiei 63 Arad</title>
</head>
<body>
	<div
		style="background-color: skyblue; id: header; position: absolute; top: 0px; bottom: 125px; left: 0px; right: 25px;">
		<h1 align="center">
			<strong>Asociatia de proprietari B-dul Revolutiei 63 Arad</strong>
		</h1>
		<h3>
			<%
					Date today = new Date();
					SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH/mm/ss");
					String ddMMyyyyToday = DATE_FORMAT.format(today);
				%>
			<%=ddMMyyyyToday%>
		</h3>

		<div style="position: absolute; top: -20px; right: 40px;">
			<h4>Acces online pentru proprietari</h4>

			<form method="post" action="autentificare">
				<table
					style="position: absolute; top: 45px; right: -30px; background-color: lightblue; margin-left: 150px; margin-left: 50px;">
					<tr>
						<td>Utilizator</td>
						<td><input type="text" name="Utilizator"></td>
					</tr>
					<tr align="left">
						<td>Parola</td>
						<td><input type="password" name="Parola"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" name="Autentificare"
							value="Autentificare" /></td>
					</tr>
				</table>
		</div>
		<center>
			<input
				style="background-color: lightblue; border: 0.3em solid #d4f7da; border-radius: 55%; font-size: 20px; width: 200px; height: 100px; font-weight: bold;"
				type="submit" name="InformatiiAsociatie"
				value="Informatii asociatie" />
		</center>
		<div>
			<div style="background-color: yellow; top: 350px; left: 0px;">
				<ul>
					<li><h2>
							<a href="ListaCheltuieliAprilie">Lista de plata aprilie</a>
						</h2></li>
					<li><h2>
							<a href="Situatia financiara">Situatia financiara</a>
						</h2></li>
				</ul>
			</div>
		</div>
		<img src="Revolutiei63.jpg" width="850" height="500">
		<div class="container">
			<div
				style="background-color: #dcddcd; width: 50%; padding: 30px 470px; text-align: center">
				<a href=""><img src="" width="250" height="100"></a>
			</div>
		</div>
		<div style="background-color: *222; text-align: center; padding: 0px;">
			<h4>Copyright &copy; Autor 2018</h4>
		</div>
</body>
</html>