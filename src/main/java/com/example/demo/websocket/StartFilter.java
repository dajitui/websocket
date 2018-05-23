package com.example.demo.websocket;

import org.java_websocket.WebSocketImpl;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

public class StartFilter implements Filter {

    @Override
    public void destroy() {

    }
    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1,
                         FilterChain arg2) throws IOException, ServletException {

    }
    @Override
    public void init(FilterConfig arg0) throws ServletException {
        this.startWebsocketInstantMsg();
    }

    /**
     * 启动即时聊天服务
     */
    public void startWebsocketInstantMsg() {
        WebSocketImpl.DEBUG = false;
        WsServer s;
        s = new WsServer(8887);
        s.start();
    }

}
