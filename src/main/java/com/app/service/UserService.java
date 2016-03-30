package com.app.service;

import com.app.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/30 0030.
 */
@Service
public class UserService {
    public List<Map<String,String>> getDefaultUserList(){
        List<Map<String,String>> userList = new ArrayList<>();

        //Initialize the list with some data for index screen
        Map singleUser = new HashMap();
        singleUser.put("firstname","Bill");
        singleUser.put("lastname","Gates");
        Map u1 = new HashMap();
        u1.put("firstname","Steve");
        u1.put("lastname","Jobs");
        Map u2 = new HashMap();
        u2.put("firstname", "Sergey");
        u2.put("lastname", "Brin");
        userList.add(singleUser);
        userList.add(u1);
        userList.add(u2);
        return userList;
    }

    public User getSystemUser(){
        User aUser = new User();

        aUser.setName("LiuWill");
        aUser.setAge(30);
        aUser.setJob("Full-Stack Engineering");
        aUser.setMobile("18608776684");
        aUser.setEmail("liuwei_will@qq.com");
        aUser.setWebSite("www.liuwill.com");
        aUser.setGithub("https://github.com/liuwill");
        return aUser;
    }
}
