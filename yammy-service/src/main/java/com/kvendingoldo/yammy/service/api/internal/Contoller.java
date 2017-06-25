package com.kvendingoldo.yammy.service.api.internal;


import java.sql.Connection;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Alexander Sharov
 * @email kvendingoldo@yandex.ru
 * @since 25/06/2017.
 */

@RestController
public class Contoller {

    private static final Logger userLogger = LogManager.getLogger();

    @RequestMapping(value = "/health_check", method = RequestMethod.GET)
    public String healthCheck() {
        userLogger.info("try GET /health_check");
        return "Up";
    }
}