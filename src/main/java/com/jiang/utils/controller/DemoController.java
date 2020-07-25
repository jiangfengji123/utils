package com.jiang.utils.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @RequestMapping(path = "/demo",method = RequestMethod.GET)
    public String Demo(){
        log.info("test");
        return "Test Demo Success";
    }

}
