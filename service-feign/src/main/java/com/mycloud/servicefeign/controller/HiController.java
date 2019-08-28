package com.mycloud.servicefeign.controller;

import com.mycloud.servicefeign.service.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create_by：Elvis
 * @create_desc:
 * @create_date: 20:52 2019/8/28
 * @update_by:
 * @update_date:
 * @update_desc:
 */
@RestController
public class HiController {

    @Autowired
    ScheduleServiceHi scheduleServiceHi;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name") String name) {
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
