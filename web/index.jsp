<%--
  Created by IntelliJ IDEA.
  User: qaz
  Date: 09/04/2021
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Lab3 V6</title>
    <meta charset="utf-8">
  </head>
  <body>
  <div>
    <p>Choose your town:</p>
    <form action="nation" method="post">
      <p>
        <select name="towns">
          <option value="Kiev">Kiev</option>
          <option value="Moscow">Moscow</option>
          <option value="Berlin">Berlin</option>
          <option value="London">London</option>
        </select>
      </p>
      <p>Choose your sex:</p>
      <p>
      <p><input name="sex" type="radio" value="male" checked="checked"/>Male</p>
      <p><input name="sex" type="radio" value="female"/>Female</p>
      </p>
      <p>
        <input type="submit" value="Say nation"/>
      </p>
    </form>
  </div>
  </body>
</html>
