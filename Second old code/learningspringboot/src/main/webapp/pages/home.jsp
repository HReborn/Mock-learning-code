<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learning spring boot</title>
</head>
<body>
	<form action=addStudent>
		<input type=text name=studentName /> 
		<input type=text name=studentId />
		<input type=submit/>
	</form>
	Welcome ${stud.aName} of id ${stud.id} from ${stud.school}. I wish you all the best!!!
</body>
</html>