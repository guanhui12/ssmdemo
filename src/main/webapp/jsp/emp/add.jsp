<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/7
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <form action="/emp/add.do" method="post">
        <h3>用户添加</h3>
        <table border="1">
            <tr>
                <td>编号:<input type="text" name="empno"></td>
            </tr>
            <tr>
                <td>用户名:<input type="text" name="ename"></td>
            </tr>
            <tr>
                <td>职位:<input type="text" name="job"></td>
            </tr>
            <tr>
                <td>薪酬:<input type="text" name="sal"></td>
            </tr>
        </table>
            <input type="submit" value="确认添加">
        </form>
    </center>
</body>
</html>
