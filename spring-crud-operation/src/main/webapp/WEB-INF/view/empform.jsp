<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add employee</title>
</head>
<body>
<h1>Add New Employee</h1>
<form method="post" action="save">
<table>
<tr>
<td>Name:</td>
<td>
<input type="text" name="name"/>
</td>
</tr>
<tr>
<td> Salary: </td>
<td> <input type="number" name="salary"/> </td>
</tr>
<tr>
<td>Designation: </td>
<td> <input type="text" name="designation"/></td>
</tr>
<tr>
<td></td>
<td> <input type="submit" value="Save" /></td>
</tr>

</table>
</form>

</body>
</html>