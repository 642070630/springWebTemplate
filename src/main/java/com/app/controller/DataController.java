package com.app.controller;

import com.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/30 0030.
 */
@RestController
@RequestMapping(value = "data")
public class DataController {
    private final Logger logger = LoggerFactory.getLogger(DataController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "sys")//, method = RequestMethod.GET
    public Map getSysUser() {
        logger.debug("DataController.getSysUser[/services/string]");

        HashMap resultMap = new HashMap();
        resultMap.put("status",true);
        resultMap.put("code","success");
        resultMap.put("content","数据获取成功");
        resultMap.put("data",userService.getSystemUser());
        return resultMap;
    }

    @RequestMapping(value = "success")//, method = RequestMethod.GET
    public Map success() {
        logger.debug("DataController.success[/data/success]");

        HashMap resultMap = new HashMap();
        resultMap.put("status",true);
        resultMap.put("code","success");
        resultMap.put("content","数据获取成功");
        return resultMap;
    }
}
