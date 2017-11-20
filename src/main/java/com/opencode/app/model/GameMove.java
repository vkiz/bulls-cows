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
 * Класс описывает ход (шаг) игры.
 * Последовательность таких ходов выводится в процессе игры на страницу клиенту.
 *
 * @version 1.0
 * @author Vladimir Kizelbashev
 */
public class GameMove {

    private String number;  // строка введённого пользователем числа
    private String bulls;   // строка количества точно угаданных цифр ("быков")
    private String cows;    // строка количества цифр угаданых без учёта позиции ("коров")

    /**
     * Метод возвращает строку введённого пользователем числа.
     * @return Строка введённого пользователем числа
     */
    public String getNumber() {
        return number;
    }

    /**
     * Метод устанавливает строку введённого пользователем числа.
     * @param number Строка введённого пользователем числа
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Метод возвращает строку количества "быков"
     * @return Строка количества "быков"
     */
    public String getBulls() {
        return bulls;
    }

    /**
     * Метод устанавливает строку количества "быков"
     * @param bulls Строка количества "быков"
     */
    public void setBulls(String bulls) {
        this.bulls = bulls;
    }

    /**
     * Метод возвращает строку количества "коров"
     * @return Строка количества "коров"
     */
    public String getCows() {
        return cows;
    }

    /**
     * Метод устанавливает количество "коров"
     * @param cows Строка количества "коров"
     */
    public void setCows(String cows) {
        this.cows = cows;
    }
}
