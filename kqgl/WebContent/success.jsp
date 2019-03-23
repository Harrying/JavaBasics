<%--
  Created by IntelliJ IDEA.
  User: ht
  Date: 1/14/19
  Time: 3:35 PM
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
<div class="login">
  <h1>员工考勤系统</h1>
<a href="login/adduser.jsp" target="frame">添加员工信息</a>
<a href="${pageContext.request.contextPath }/select_user.action" target="frame">删除员工信息</a>
<a href="${pageContext.request.contextPath }/select_user.action" target="frame">修改员工信息</a>
<a href="${pageContext.request.contextPath }/select_user.action" target="frame">查询员工信息</a><br/>
<iframe name="frame" style="height:100%;width:50%">
    <s:fielderror>
        <s:param>error1</s:param>
    </s:fielderror>
</iframe>
</div>
</body>
</html>
