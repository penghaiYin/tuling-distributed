package com.yph.compat.client;

import io.netty.handler.timeout.IdleStateHandler;

/**
 * @author ：yph
 * @description ：客户端检测自己的写空闲
 */
public class CheckWriteIdleHandler extends IdleStateHandler {

    /**
     * 如果超过8秒客户端没有向服务端发送写报文。就会触发 userEventTriggered()方法
     */
    public CheckWriteIdleHandler() {
        super(0, 8, 0);
    }
}
