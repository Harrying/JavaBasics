<%--
  Created by IntelliJ IDEA.
  User: ht
  Date: 1/14/19
  Time: 7:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
  <form action="${ pageContext.request.contextPath }/loginAction.action" method="post">
    <input type="text" name="id" placeholder="用户名" required="required" style="width:300px"/><br/>
    <input type="password" name="password" placeholder="密码" required="required" style="width:300px"/><br/>
    <input type="text" name="type" placeholder="用户身份" required="required" style="width:300px"/><br/>
    <button type="submit" class="btn btn-primary btn-block btn-large" style="width:300px">登录</button>

  </form>
  </div>
  </body>
</html>
