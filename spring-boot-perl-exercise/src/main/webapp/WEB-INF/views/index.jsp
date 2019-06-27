<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>PROC EXERCISE</title>
</head>
<body>
  <h1>Spring Boot - MVC PROC Exercise</h1>
  <hr>

  <div class="form">
    <form action="getProcDetails" method="post" onsubmit="return validate()">
      <table>
        <tr>
          <td>Enter PROC Reference</td>
          <td><input id="name" name="name"></td>
          <td><input type="submit" name="button1" value="Get PROC"></td>
           <td><input type="submit" name="button2" value="Get PROC Summary"></td>
        </tr>
      </table>
    </form>
  </div>
  
  <h2>${name}</h2>

</body>
</html>