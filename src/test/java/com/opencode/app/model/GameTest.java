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

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Класс представляет собой модульный тест
 * для тестирования методов класса {@link Game}.
 *
 * @version 1.0
 * @author Vladimir Kizelbashev
 */
public class GameTest {

    private static Game game; // объект игры

    /**
     * Метод создаёт объект игры перед вызовом тестовых методов.
     * Вызывается один раз при запуске теста.
     * @throws Exception
     */
    @BeforeClass
    public static void setUp() throws Exception {
        game = new Game();
    }

    /**
     * Метод вызывается после выполнения всех тестовых методов.
     * @throws Exception
     */
    @AfterClass
    public static void tearDown() throws Exception {
        game = null;
    }

    /**
     * Метод тестирует запуск новой игры.
     * @throws Exception
     */
    @Test
    public void testStartNew() throws Exception {
        game.startNew();
        assertFalse("Field 'game.guessed' must have 'false' value", game.isNumberGuessed());
        assertNotNull("Field 'game.moves' must be not null", game.getMoves());
        assertNotNull("Field 'game.secret' must be not null", game.getSecretNumber());
    }

    /**
     * Метод тестирует правильность проверки сгенерированного приложением числа
     * на соответствие условию игры.
     * @throws Exception
     */
    @Test
    public void testIsNumberMatch() throws Exception {
        assertFalse("Result must have 'false' value", game.isNumberMatch(100));
        assertTrue("Result must have 'true' value", game.isNumberMatch(123));
        assertTrue("Result must have 'true' value", game.isNumberMatch(1234));
    }

    /**
     * Метод тестирует правильность проверки введённого пользователем числа.
     * @throws Exception
     */
    @Test
    public void testCheckGuess() throws Exception {
        // установка загаданного числа
        game.startNew();
        game.setSecretNumber("1234");

        // проверка 1
        assertTrue("Result (bulls quantity) must have '0' value", game.checkGuess("0123") == 0);
        assertFalse("Result (is number guessed) must have 'false' value", game.isNumberGuessed());

        // проверка 2
        assertTrue("Result (bulls quantity) must have '3' value", game.checkGuess("1230") == 3);
        assertFalse("Result (is number guessed) must have 'false' value", game.isNumberGuessed());

        // проверка 3
        assertTrue("Result (bulls quantity) must have '4' value", game.checkGuess("1234") == 4);
        assertTrue("Result (is number guessed) must have 'true' value", game.isNumberGuessed());
    }
}
