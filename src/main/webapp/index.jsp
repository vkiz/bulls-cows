<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Игра «Быки и коровы»</title>
</head>
<body>
    <jsp:forward page="/jsp/login.jsp">
        <jsp:param name="loginErrorMessage" value=""/>
    </jsp:forward>
</body>
</html>
