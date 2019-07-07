<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>测试主页面</title>
</head>
<body>
       <table>
             <tr>
                 <th>用户名</th>
                 <th>密码</th>
             </tr>
             <c:forEach var="admin" items="${list }">
              <tr>
                 <td>${admin.account }</td>
                 <td>${admin.password }</td>
             </tr>
             </c:forEach>
       </table>
</body>
</html>