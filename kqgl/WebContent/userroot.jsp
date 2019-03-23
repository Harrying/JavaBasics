<%--
  Created by IntelliJ IDEA.
  User: whr
  Date: 19-1-16
  Time: 上午12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <th><a href="${pageContext.request.contextPath}/select_one_attend.action">考勤查询</a></th>

    </tr>
</table>
</div>
</body>
</html>
