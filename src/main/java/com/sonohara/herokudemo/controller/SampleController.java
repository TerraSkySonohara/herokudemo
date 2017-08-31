package com.sonohara.herokudemo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
public class SampleController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<String> testService(HttpServletRequest req) throws Exception {
        System.out.println("testService execute");
        return Arrays.<String>asList("result1");
    }
}
