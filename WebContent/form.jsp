<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BeerSel</title>
</head>
<body>
<h1 align="center">Beer Selection Page</h1>
<form method="POST" action="SelectBeer.do">
  Select beer charateristics<p>
  Color:
  <select name="color" size="1">
      <option value="light">light</option>
      <option value="amber">amber</option>
      <option value="brown">brown</option>
      <option value="dark">dark</option>
  </select>
  <br><br>
  <center>
     <input type="submit">
  </center>
</form>
</body>
</html>