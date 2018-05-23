package com.example.demo.controller;


import com.example.demo.websocket.WsPool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping(value = "/sendWs")
    public String sendWs(String message) {
        WsPool.sendMessageToAll(message);
        return message;
    }

    @RequestMapping(value = "/index")
    public String index() {
        System.out.println("111");
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/oo")
    public void oo() {

    }

    @ResponseBody
    @RequestMapping(value = "/mm")
    public void mm(String name) {
        WsPool.sendMessageToUser(WsPool.getWsByUser(name),"您有新的信息了！！！");
    }

}
