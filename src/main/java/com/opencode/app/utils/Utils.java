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

package com.opencode.app.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Класс с вспомогательными методами.
 *
 * @version 1.0
 * @author Vladimir Kizelbashev
 */
public class Utils {

    /**
     * Метод возвращает MD5 в виде строки из 32 шестнадцатеричных символов.
     * @param str Исходная строка
     * @return Строка MD5 на основе исходной
     * @throws Exception
     */
    public static String getMD5Hash(String str) throws Exception {
        MessageDigest msgDigest = MessageDigest.getInstance("MD5");
        msgDigest.reset();
        msgDigest.update(str.getBytes("UTF-8"));
        byte[] digest = msgDigest.digest();
        BigInteger bigInt = new BigInteger(1, digest);
        String md5hash = bigInt.toString(16);
        while (md5hash.length() < 32) {
            md5hash = "0" + md5hash;
        }
        return md5hash;
    }
}
