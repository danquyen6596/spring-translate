<%--
  Created by IntelliJ IDEA.
  User: danqu
  Date: 11/01/2019
  Time: 8:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Dictionary</title>
</head>
<body>
<div>
  <h1>Vietnamese Dictionaty</h1>
  <form method="post" action="/translate">
    <input type="text" size="50" name="word" placeholder="Enter your word:"/>
    <input type="submit" value="Search" name="search"/>

  </form

</div>
</body>
</html>
