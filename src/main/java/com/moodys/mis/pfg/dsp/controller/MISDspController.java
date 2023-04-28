package com.moodys.mis.pfg.dsp.controller;

import com.moodys.mis.pfg.dsp.service.MIsService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MISDspController {

private final Logger logger = LoggerFactory.getLogger(MISDspController.class);
    private final MIsService mIsService;

    @GetMapping("/hello")
    public String getData(){

        logger.trace("Log level: TRACE");
        logger.info("Log level: INFO");
        logger.debug("Log level: DEBUG");
        logger.error("Log level: ERROR");
        logger.warn("Log level: WARN");

        return "hello data";
    }
}
