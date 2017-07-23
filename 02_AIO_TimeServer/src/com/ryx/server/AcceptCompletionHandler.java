package com.ryx.server;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class AcceptCompletionHandler implements CompletionHandler<AsynchronousSocketChannel, AsyncTimeServerHandle> {

    @Override
    public void completed(AsynchronousSocketChannel result, AsyncTimeServerHandle attachment) {
        attachment.asynchronousServerSocketChannel.accept(attachment, this);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        result.read(byteBuffer, byteBuffer, new ReadCompletionHandler());
    }

    @Override
    public void failed(Throwable exc, AsyncTimeServerHandle attachment) {

    }
}
