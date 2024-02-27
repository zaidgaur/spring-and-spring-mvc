<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>

<h1>Edit Employee Details</h1>
<form action="/crudwebmaven/editsave" method="post">
<table>
<tr>
<td></td> 
<td><input type="hidden" name="id" value="${employee.getId() }"/></td>
</tr>

<tr>
<td>Name:</td> 
<td><input type="text" name="name" value="${employee.getName() }"/></td>
</tr>/></td>
</tr>

<td>Salary:</td> 
<td><input type="number" name="salary" value="${employee.getSalary() }"/></td>
</tr>/></td>
</tr>

<td>Designation:</td> 
<td><input type="text" name="designation" value="${employee.getDesignation() }"/></td>
</tr>/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Edit&Save"></td>
</tr>
</table>

</form>
</body>
</html>