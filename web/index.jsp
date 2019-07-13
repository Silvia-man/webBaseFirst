<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JSP</title>
  </head>
  <body>

    <form name="bimForm" action="bmi" method="post">
      <table>
        <tr>
          <td>Your Weight(KG):</td>
          <td><input type="text" name="weight"/> </td>
        </tr>
        <tr>
          <td>Your Height(M):</td>
          <td><input type="text" name="height"/> </td>
        </tr>
        <th>
          <input type="submit" value="Submit" name="BMI">
        </th>
        <th>
          <input type="reset" value="Reset" name="reset">
        </th>
      </table>
      <h2>${result}</h2>
    </form>
  </body>
</html>