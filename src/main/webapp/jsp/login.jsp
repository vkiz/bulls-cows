<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Игра «Быки и коровы» - Авторизация</title>
    <style>
        <%@include file="/css/style.css"%>
    </style>
</head>
<body>
    <div class="header">
        <div class="image"></div>
        <div class="text">Игра «Быки и коровы»</div>
    </div>
    <div align="center">
        <form name="login-form" class="login-form" method="POST" action="controller">
            <input type="text" name="login" maxlength="20" placeholder="Имя пользователя" required>
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
            <button type="submit" name="action" value="register" class="btn-link" formnovalidate>Зарегистрироваться</button>
        </form>
    </div>
    <div class="footer">Copyright &copy; 2017 «Открытый код»</div>
</body>
</html>
