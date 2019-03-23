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
<div class="body">
<s:fielderror></s:fielderror>
<s:actionerror cssStyle="color:red"/>
  <h1>员工考勤系统</h1>
<table border="1">
	<tr>
		<td colspan="5">
			<form action="${pageContext.request.contextPath }/select_attend.action" method="post">
				id:<input type="text" name="id"/><input type="submit" value="select"/>
				<s:fielderror>
					<s:param>selectError</s:param>
				</s:fielderror>
			</form>
		</td>
		<td><a href="login/addattend.jsp">添加</a></td>
	</tr>
	<tr>
		<th>员工编号</th>
		<th>员工姓名</th>
		<th>员工部门</th>
		<th>考勤编号</th>
		<th>考勤时间</th>
		<th>上午</th>
		<th>中午</th>
		<th>下午</th>
		<th>晚上</th>
		<th>考勤类型</th>
		<th>出差开始时间</th>
		<th>出差结束时间</th>
		<th>薪酬状况</th>
		<th colspan="2">操作</th>
	</tr>
	<s:iterator var="attend" value="list" status="l">
		<tr>
				<td><s:property value="id"/></td>
			    <td><s:property value="name"/></td>
			    <td><s:property value="department"/></td>
				<td><s:property value="kq_id"/></td>
				<td><s:property value="kq_time"/></td>
				<td><s:property value="kq_1"/></td>
				<td><s:property value="kq_2"/></td>
			    <td><s:property value="kq_3"/></td>
			    <td><s:property value="kq_4"/></td>
			    <td><s:property value="kq_type"/></td>
			    <td><s:property value="start_time"/></td>
			    <td><s:property value="stop_time"/></td>
			    <td><s:property value="kq_salary"/></td>
				<td><a href="${ pageContext.request.contextPath }/update_select_attend.action?id=${id}">修改</a></td>
				<td><a href="${ pageContext.request.contextPath }/delete_attend.action?id=${id}">删除</a></td>				<s:fielderror>
					<s:param>deleteError</s:param>
					<s:param>deleteSuccess</s:param>
				</s:fielderror>
			</tr>
	</s:iterator>
</table>
</div>
</body>
</html>
