<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/8
  Time: 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="/emp/update.do" METHOD="post">
        <h3>用户修改</h3>
        <table class="eTable" border="1" width="400px" cellspacing="0">
            <%--<c:forEach items="empListBysId" var="emp">--%>
            <tr style="display: none">
                <td>员工编号:</td>
                <td>
                    <input type="text" name="empNo" id="empNo" value="${empList.EMPNO}">
                </td>
            </tr>
            <tr>
                <td>员工名字:</td>
                <td>
                    <input type="text" name="ename" id="ename" value="${empList.ENAME}">
                </td>
            </tr>
            <tr>
                <td>员工职务:</td>
                <td>
                    <input type="text" name="job" id="job" value="${empList.JOB}">
                </td>
            </tr>
            <tr align="center">
                <td>员工薪资:</td>
                <td>
                    <input type="text" name="sal" id="sal" value="${empList.SAL}">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="确认">
                </td>
            </tr>
            <%--</c:forEach>--%>
        </table>
    </form>
</center>
</body>
</html>
