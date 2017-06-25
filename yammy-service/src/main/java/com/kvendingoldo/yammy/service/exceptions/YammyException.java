package com.kvendingoldo.yammy.service.exceptions;

/**
 * @author Alexander Sharov
 * @email kvendingoldo@yandex.ru
 * @since 24.02.17
 */

public class YammyException extends RuntimeException {

    public YammyException() {
    }

    public YammyException(String msg) {
        super(msg);
    }
}