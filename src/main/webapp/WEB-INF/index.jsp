<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<title>TheCode</title>
</head>
<body>
<p><c:out value="${error}"/></p>
<form method="POST" action="/code">
    <label>What is the code <input type="text" name="code"></label>
  	<button type="submit" class="btn btn-primary">Try Code</button>
</form>

</body>
</html>