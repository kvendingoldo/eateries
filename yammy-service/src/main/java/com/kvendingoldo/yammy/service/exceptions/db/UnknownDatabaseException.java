package com.kvendingoldo.yammy.service.exceptions.db;

import com.kvendingoldo.yammy.service.exceptions.YammyException;

/**
 * @author Alexander Sharov
 * @email kvendingoldo@yandex.ru
 * @since 25/06/2017.
 */


public class UnknownDatabaseException extends YammyException {

    public UnknownDatabaseException() {
    }

    public UnknownDatabaseException(String msg) {
        super(msg);
    }
}