package com.yph.nio.writeable;

import static com.yph.Const.DEFAULT_PORT;

/**
 * @author yph
 * 类说明：nio通信服务端
 */
public class NioServerWritable {
    private static NioServerHandleWriteable nioServerHandle;

    public static void start(){

    }
    public static void main(String[] args){
        nioServerHandle = new NioServerHandleWriteable(DEFAULT_PORT);
        new Thread(nioServerHandle,"Server").start();
    }

}
