<%--
  Created by IntelliJ IDEA.
  User: whr
  Date: 19-1-15
  Time: 下午4:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
  <title>$Title$</title>
  <link href="main.css" rel="stylesheet" style="text/css"/>
</head>
<body>
<s:fielderror></s:fielderror>
<s:actionerror cssStyle="color:red"/>
  <h1>员工考勤系统</h1>
<s:fielderror>
    <s:param>updateError</s:param>
</s:fielderror>
<form action="${ pageContext.request.contextPath }/update_attend.action" method="post">
    考勤时间：<input type="text" name="kq_time" value="<s:property value='updatelist[0].kq_time'/>"/><br>
    早晨：<input type="text" name="kq_1" value="<s:property value='updatelist[0].kq_1'/>"/><br>
    中午：<input type="text" name="kq_2" value="<s:property value='updatelist[0].kq_2'/>"/><br>
    下午：<input type="text" name="kq_3" value="<s:property value='updatelist[0].kq_3'/>"/><br>
    晚上：<input type="text" name="kq_4" value="<s:property value='updatelist[0].kq_4'/>"/><br>
    考勤类型：<input type="text" name="kq_type" value="<s:property value='updatelist[0].kq_type'/>"/><br>
    出差开始时间：<input type="text" name="start_time" value="<s:property value='updatelist[0].start_time'/>"/><br>
    出差结束时间：<input type="text" name="stop_time" value="<s:property value='updatelist[0].stop_time'/>"/><br>
    薪酬状况：<input type="text" name="kq_salary" value="<s:property value='updatelist[0].kq_salary'/>"/><br>
    <input type="submit" value="update"/>
</form>
</body>
</html>

