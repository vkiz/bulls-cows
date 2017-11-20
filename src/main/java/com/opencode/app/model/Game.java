/*
 * Copyright (C) 2017 Open Code.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "as is" basis,
 * without warranties or conditions of any kind, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.opencode.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс реализует логику игры "Быки и коровы".
 * Здесь генерируется четырёхзначное число, цифры которого не повторяются. Задача игрока - угадать загаданное число
 * за как можно меньшее количество попыток. Игрок вводит вариант числа, а приложение сообщает сколько цифр
 * угадано точно (бык) и сколько цифр угадано без учёта позиции (корова).
 *
 * @version 1.0
 * @author Vladimir Kizelbashev
 */
public class Game {

    private User user;              // пользователь игры
    private String secret;          // строка загаданного числа
    private boolean guessed;        // признак того, что число угадано
    private List<GameMove> moves;   // список ходов игры

    /**
     * Конструктор класса {@link Game}.
     */
    public Game() {
        startNew();
    }

    /**
     * Метод запускает новую игру.
     * Он инициализирует поля класса {@link Game} и генерирует "загадываемое" четырёхзначное число.
     * Результат хранится в виде строки в поле {@link Game#secret}.
     */
    public void startNew() {
        guessed = false;
        moves = new ArrayList<GameMove>();
        Random random = new Random();
        int rnd;
        while (!isNumberMatch(rnd = random.nextInt(9900) + 100));
        secret = String.format("%04d", rnd);
    }

    /**
     * Метод проверяет число на соответствие условию игры.
     * Число преобразуется в строку из четырёх символов и
     * выполняется проверка строки с помощью регулярного выражения.
     * @param num Число
     * @return {@code true} - если число соответствует условию,
     *         {@code false} - если не соответствует
     */
    private boolean isNumberMatch(int num) {
        String str = String.format("%04d", num);
        // если строка - только четыре неповторяющиеся цифры
        if (str.length() == 4 && str.matches("(?!.*(.).*\\1)\\d{4}")) {
            return true;
        }
        return false;
    }

    /**
     * Метод проверяет введённое пользователем число.
     * Если число совпадает с загаданным, то значение поля {@link Game#guessed} становится равным {@code true}.
     * @param guess Строка введённого пользователем числа
     */
    public void checkGuess(String guess) {
        if (guess.length() == 4 &&
            guess.matches("(?!.*(.).*\\1)\\d{4}")) {
            int bulls = 0;
            int cows = 0;
            for (int i = 0; i < 4; i++) {
                if (guess.charAt(i) == secret.charAt(i)) {
                    bulls++;
                } else if (secret.contains(String.valueOf(guess.charAt(i)))) {
                    cows++;
                }
            }
            if (bulls == 4) {
                guessed = true;
            }
            // Добавление хода игры в список ходов
            // для вывода последовательности на страницу
            GameMove move = new GameMove();
            move.setNumber(guess);
            move.setBulls(String.valueOf(bulls));
            move.setCows(String.valueOf(cows));
            moves.add(move);
        }
    }

    /**
     * Метод возвращает строку загаданного четырёхзначного числа.
     * @return Строка загаданного числа
     */
    public String getSecretNumber() {
        return secret;
    }

    /**
     * Метод возвращает флаг (статус) того, угадано число или нет.
     * @return {@code true} - если число угадано, {@code false} - если нет
     */
    public boolean isNumberGuessed() {
        return guessed;
    }

    /**
     * Метод возвращает список ходов игры.
     * Этот список в последующем выводится на страницу клиенту.
     * @return Список ходов игры
     */
    public List<GameMove> getMoves() {
        return moves;
    }

    /**
     * Метод возвращает пользователя игры.
     * @return Пользователь игры
     */
    public User getUser() {
        return user;
    }

    /**
     * Метод устанавливает пользователя игры.
     * @param user Пользователь игры
     */
    public void setUser(User user) {
        this.user = user;
    }
}
