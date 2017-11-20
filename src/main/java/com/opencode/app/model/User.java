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
 * Класс описывает пользователя приложения.
 *
 * @version 1.0
 * @author Vladimir Kizelbashev
 */
public class User {

    private Long id;            // идентификатор
    private String firstName;   // имя
    private String lastName;    // фамилия
    private String userName;    // имя пользователя
    private String password;    // пароль

    /**
     * Метод возвращает идентификатор пользователя.
     * @return Идентификатор пользователя
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Метод устанавливает идентификатор пользователя.
     * @param id Идентификатор пользователя
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Метод возвращает имя.
     * @return Имя
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Метод устанавливает имя.
     * @param firstName Имя
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Метод возвращает фамилию.
     * @return Фамилия
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Метод устанавливает фамилию.
     * @param lastName Фамилия
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Метод возвращает имя пользователя (логин).
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
     * Метод возвращает пароль пользователя.
     * @return Пароль
     */
    public String getPassword() {
        return password;
    }

    /**
     * Метод устанавливает пароль пользователя.
     * @param password Пароль
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
