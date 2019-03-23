<%--
  Created by IntelliJ IDEA.
  User: ht
  Date: 1/14/19
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
  <title>$Title$</title>
  <link href="main.css" rel="stylesheet" style="text/css"/>
</head>
<body>
<s:fielderror></s:fielderror>
<s:actionerror cssStyle="color:red"/>
<div class="login">
  <h1>员工考勤系统</h1>
<s:fielderror>
    <s:param>updateError</s:param>
</s:fielderror>
<form action="${ pageContext.request.contextPath }/update_user.action" method="post">
    password：<input type="text" name="password" value="<s:property value='updatelist[0].id'/>"/><br>
    department：<input type="text" name="department" value="<s:property value='updatelist[0].department'/>"/><br>
    <input type="submit" value="update"/>
</form>
</div>
</body>
</html>

