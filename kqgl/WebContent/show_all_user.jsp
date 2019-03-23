<%--
  Created by IntelliJ IDEA.
  User: ht
  Date: 1/14/19
  Time: 12:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
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
<table border="1">
    <tr>
        <td colspan="5">
            <form action="${pageContext.request.contextPath }/select_user.action" method="post">
                id:<input type="text" name="id"/><input type="submit" value="select"/>
                <s:fielderror>
                    <s:param>selectError</s:param>
                </s:fielderror>
            </form>
        </td>
        <td><a href="login/adduser.jsp">添加</a></td>
    </tr>
    <tr>
        <!-- <th>是否为偶数</th> -->
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>sex</th>
        <th>department</th>
        <th>salary</th>
        <th colspan="2">操作</th>
    </tr>
    <s:iterator var="user" value="list" status="l">
            <tr>
                <td><s:property value="id"/></td>
                <td><s:property value="name"/></td>
                <td><s:property value="age"/></td>
                <td><s:property value="sex"/></td>
                <td><s:property value="department"/></td>
                <td><s:property value="salary"/></td>
                        <td><a href="${ pageContext.request.contextPath }/update_select_user.action?id=${id}">修改</a></td>
                        <td><a href="${ pageContext.request.contextPath }/delete_user.action?id=${id}">删除</a></td>
                        <s:fielderror>
                            <s:param>deleteError</s:param>
                            <s:param>deleteSuccess</s:param>
                        </s:fielderror>
            </tr>
    </s:iterator>
</table>
</body>
</html>
