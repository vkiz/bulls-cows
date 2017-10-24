<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<html>
<head>
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
        <form name="login-form" method="POST" action="controller">
            <input type="text" name="login" maxlength="30" placeholder="Имя пользователя">
                <br>
            <input type="password" name="password" maxlength="30" placeholder="Пароль">
                <br>
            <button type="submit" name="action" value="login" class="btn">Войти</button>
                <br>
                <br>
            <label>Ещё не зарегистрированы?</label>
                <br>
            <button type="submit" name="action" value="register" class="btn-link">Зарегистрироваться</button>
        </form>
    </div>
    <div class="footer">Copyright &copy; 2017 «Открытый код»</div>
</body>
</html>
