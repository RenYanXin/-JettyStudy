package com.ryx.server;

public class TimeServer {
    public static void main(String [] args){
        int port = 8080;
        AsyncTimeServerHandle timeServerHandle = new AsyncTimeServerHandle(port);
        new Thread(timeServerHandle, "AIO-AsyncTimeServerHandler-001").start();
    }
}
