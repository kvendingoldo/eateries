package com.kvendingoldo.yammy.service.dao.factory;

/**
 * @author Alexander Sharov
 * @email kvendingoldo@yandex.ru
 * @since 25/06/2017.
 */

import com.kvendingoldo.yammy.service.config.Config;
import com.kvendingoldo.yammy.service.exceptions.db.UnknownDatabaseException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {

    public DaoFactory() {
    }

    public Connection getConnection() {
        Config config = new Config();
        config.load();
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(config.getDbUrl(), config.getDbUsername(), config.getDbPassword());
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("SQLException message:" + ex.getMessage());
        }

        return connection;
    }
}