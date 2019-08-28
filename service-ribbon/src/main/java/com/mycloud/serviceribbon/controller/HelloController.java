package com.mycloud.serviceribbon.controller;

import com.mycloud.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create_by：Elvis
 * @create_desc:
 * @create_date: 20:26 2019/8/28
 * @update_by:
 * @update_date:
 * @update_desc:
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name") String name) {
        return helloService.hiService(name);
    }
}
