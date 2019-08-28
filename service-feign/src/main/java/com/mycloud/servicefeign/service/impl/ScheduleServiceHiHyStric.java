package com.mycloud.servicefeign.service.impl;

import com.mycloud.servicefeign.service.ScheduleServiceHi;
import org.springframework.stereotype.Component;

/**
 * @create_by：Elvis
 * @create_desc:
 * @create_date: 21:09 2019/8/28
 * @update_by:
 * @update_date:
 * @update_desc:
 */
@Component
public class ScheduleServiceHiHyStric implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
