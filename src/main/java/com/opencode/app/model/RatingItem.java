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

/**
 * Класс описывает строку рейтинга пользователей приложения.
 * Строки рейтинга выводятся на страницу клиенту в порядке возрастания
 * среднего количества попыток до угадывания числа.
 *
 * @version 1.0
 * @author Vladimir Kizelbashev
 */
public class RatingItem {

    private String userName;    // имя пользователя
    private double avgAttempts; // среднее количество попыток до угадывания числа
    private int gamesCount;     // количество сыгранных пользователем игр

    /**
     * Метод возвращает имя пользователя.
     * @return Имя пользователя
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Метод устанавливает имя пользователя.
     * @param userName Имя пользователя
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Метод возвращает среднее количество попыток до угадывания числа.
     * @return Среднее количество попыток до угадывания числа
     */
    public double getAvgAttempts() {
        return avgAttempts;
    }

    /**
     * Метод устанавливает среднее количество попыток до угадывания числа.
     * @param avgAttempts Среднее количество попыток до угадывания числа
     */
    public void setAvgAttempts(double avgAttempts) {
        this.avgAttempts = avgAttempts;
    }

    /**
     * Метод возвращает количество сыгранных пользователем игр.
     * @return Количество сыгранных пользователем игр
     */
    public int getGamesCount() {
        return gamesCount;
    }

    /**
     * Метод устанавливает количество сыгранных пользователем игр.
     * @param gamesCount Количество сыгранных пользователем игр
     */
    public void setGamesCount(int gamesCount) {
        this.gamesCount = gamesCount;
    }
}
