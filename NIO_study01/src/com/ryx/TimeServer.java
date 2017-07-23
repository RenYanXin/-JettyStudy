package com.ryx;

import java.io.IOException;

public class TimeServer {
    public static void main(String[] args) throws IOException{
        int port = 8080;
        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
        new Thread(timeServer, "NIO-MultiplexerTimeServer-001").start();
    }
}
