<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Авторизация</title>
    <style>
        <%@include file="/css/styles.css"%>
    </style>
</head>
<body>
    <%@ include file="header.jsp" %>
    <div align="center">
        <form name="login-form" class="login-form" method="POST" action="controller">
            <input type="text" name="username" maxlength="20" placeholder="Имя пользователя" required>
                <br>
            <input type="password" name="password" maxlength="20" placeholder="Пароль" required>
            <div class="error-message">
                <%
                    String msg = request.getParameter("loginErrorMessage");
                    if (msg == null || msg.trim().isEmpty()) msg = "<br>";
                %>
                <%= msg %>
            </div>
            <button type="submit" name="action" value="login" class="btn">Войти</button>
                <br>
            <label>Ещё не зарегистрированы?</label>
                <br>
            <button type="submit" name="action" value="show-register" class="btn-link" formnovalidate>Зарегистрироваться</button>
        </form>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
