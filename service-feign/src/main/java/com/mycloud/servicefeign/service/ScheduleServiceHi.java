package com.mycloud.servicefeign.service;

import com.mycloud.servicefeign.service.impl.ScheduleServiceHiHyStric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @create_by：Elvis
 * @create_desc:
 * @create_date: 20:51 2019/8/28
 * @update_by:
 * @update_date:
 * @update_desc:
 */
@FeignClient(value = "service-hi", fallback = ScheduleServiceHiHyStric.class)
public interface ScheduleServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
