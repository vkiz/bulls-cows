<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Игра</title>
    <style>
        <%@include file="/css/styles.css"%>
    </style>
</head>
<body>
<%@ include file="header.jsp" %>
<p align="center">
    <form name="game-form" class="game-form" method="POST" action="controller">
        <div class="game-message">
            <b>Игрок</b>, добро пожаловать в игру!&nbsp;
            <button type="submit" name="action" value="logout" class="btn-link" formnovalidate>Выйти</button>
        </div>
        <br>
        <div class="tab">
            <button type="button" class="tablink" id="game-tablink" onclick="openTab(event, 'game-tab')">Игра</button>
            <button type="button" class="tablink" id="rating-tablink" onclick="openTab(event, 'rating-tab')">Рейтинг</button>
        </div>
        <div id="game-tab" class="tabcontent">
            <p class="game-message">Угадайте загаданное компьютером число</p>
            <table class="game-table">
                <tr>
                    <td width="305">
                        <table class="game-moves">
                            <caption class="game-label">Предыдущие попытки</caption>
                            <thead>
                                <tr>
                                    <th>№</th>
                                    <th>Число</th>
                                    <th>Быков</th>
                                    <th>Коров</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    for (int i = 0; i < 10; i++) {
                                %>
                                    <tr>
                                        <td>1</td>
                                        <td>1234</td>
                                        <td>4</td>
                                        <td>0</td>
                                    </tr>
                                <%
                                    }
                                %>
                            </tbody>
                        </table>
                    </td>
                    <td width="180">
                        <table class="game-controls">
                            <caption class="game-label">Введите число</caption>
                            <tr>
                                <td colspan="5">
                                    <input type="text" id="guess-text" name="guess-text" class="guess-text" maxlength="4"
                                           required onkeydown="keyDown(event)" onkeypress="keyPress(event)">
                                </td>
                            </tr>
                            <tr>
                                <td colspan="5"></td>
                            </tr>
                            <tr>
                                <td><button type="button" class="table-button" onclick="btnClick('0')">0</button></td>
                                <td><button type="button" class="table-button" onclick="btnClick('1')">1</button></td>
                                <td><button type="button" class="table-button" onclick="btnClick('2')">2</button></td>
                                <td><button type="button" class="table-button" onclick="btnClick('3')">3</button></td>
                                <td><button type="button" class="table-button" onclick="btnClick('4')">4</button></td>
                            </tr>
                            <tr>
                                <td><button type="button" class="table-button" onclick="btnClick('5')">5</button></td>
                                <td><button type="button" class="table-button" onclick="btnClick('6')">6</button></td>
                                <td><button type="button" class="table-button" onclick="btnClick('7')">7</button></td>
                                <td><button type="button" class="table-button" onclick="btnClick('8')">8</button></td>
                                <td><button type="button" class="table-button" onclick="btnClick('9')">9</button></td>
                            </tr>
                            <tr>
                                <td colspan="5">&nbsp;</td>
                            </tr>
                            <tr>
                                <td colspan="5">
                                    <button type="submit" name="action" value="check-number" class="table-button">Угадать</button>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="5">&nbsp;</td>
                            </tr>
                            <tr>
                                <td colspan="5">
                                    <button type="submit" name="action" value="new-game" class="table-button" formnovalidate>Новая игра</button>
                                </td>
                            </tr>
                        </table>
                    </td>
                <tr>
            </table>
        </div>
        <div id="rating-tab" class="tabcontent">
            <p class="game-message">Рейтинг игроков на основе среднего количества попыток до угадывания числа</p>
            <table class="game-rating">
                <thead>
                <tr>
                    <th width="60">Место</th>
                    <th width="165">Игрок</th>
                    <th width="100">Количество попыток</th>
                    <th width="100">Всего игр сыграно</th>
                </tr>
                </thead>
                <tbody>
                <%
                    for (int i = 0; i < 10; i++) {
                %>
                <tr>
                    <td width="60">1</td>
                    <td width="165">Player 1</td>
                    <td width="100">7.5</td>
                    <td width="100">100</td>
                </tr>
                <%
                    }
                %>
                </tbody>
            </table>
        </div>
    </form>
</div>
<%@ include file="footer.jsp" %>
<script type="text/javascript">
    <%@include file="/js/scripts.js"%>
    document.getElementById("game-tablink").click();
</script>
</body>
</html>
