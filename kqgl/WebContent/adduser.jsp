<%--
  Created by IntelliJ IDEA.
  User: ht
  Date: 1/14/19
  Time: 11:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>$Title$</title>
  <link href="main.css" rel="stylesheet" style="text/css"/>
</head>
<body>
<s:fielderror></s:fielderror>
<s:actionerror cssStyle="color:red"/>
  <h1>员工考勤系统</h1>
<form action="${pageContext.request.contextPath }/add_user.action" method="post">
    id:<input type="text" name="id"/><br>
    password:<input type="text" name="password"/><br>
    type:<input type="text" name="type"/><br>
    name:<input type="text" name="name"/><br>
    age:<input type="text" name="age"><br>
    sex:<input type="text" name="sex"/><br>
    department:<input type="text" name="department"/><br>
    salary:<input type="text" name="salary"/><br>
    <input type="submit" value="添加"/>
</form>
</body>
</html>
