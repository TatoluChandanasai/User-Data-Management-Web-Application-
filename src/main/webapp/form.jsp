<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <h2>User Details</h2>

<form action="InsertServlet" method="post">
    Name: <input type="text" name="name"><br><br>
    Age: <input type="number" name="age"><br><br>
    Profession: <input type="text" name="profession"><br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>