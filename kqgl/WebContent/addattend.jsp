<%--
  Created by IntelliJ IDEA.
  User: whr
  Date: 19-1-15
  Time: 下午4:32
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
<form action="${pageContext.request.contextPath }/add_attend.action" method="post">
    员工编号:<input type="text" name="id"/><br>
    考勤时间:<input type="text" name="kq_time"/><br>
    早晨:<input type="text" name="kq_1"/><br>
    中午:<input type="text" name="kq_2"/><br>
    下午:<input type="text" name="kq_3"/><br>
    晚上:<input type="text" name="kq_4"/><br>
    考勤类型:<input type="text" name="kq_type"/><br>
    出差开始时间:<input type="text" name="start_time"/><br>
    出差结束时间:<input type="text" name="stop_time"><br>
    薪酬状况:<input type="text" name="kq_salary"><br>
     <input type="submit" value="添加"/>
</form>

</body>
</html>
