<%--
  Created by IntelliJ IDEA.
  User: ht
  Date: 1/14/19
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<table>
    <tr>
        <td colspan="2">功能选择</td>
    </tr>
    <tr>
        <th><a href="${pageContext.request.contextPath}/select_user.action">员工目录</a></th>
        <th><a href="adduser.jsp">添加员工</a></th>
        <th><a href="${pageContext.request.contextPath}/select_attend.action">考勤目录</a></th>
        <th><a href="addattend.jsp">添加考勤</a></th>
    </tr>
</table>
  </div>
  </body>
</html>
