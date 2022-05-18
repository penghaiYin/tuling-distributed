package com.yph.introduction.outread;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author ：yph
 * @description ：TODO
 */
public class ServerOutReadHandler extends ChannelOutboundHandlerAdapter {
    private static final Logger LOG = LoggerFactory.getLogger(ServerOutReadHandler.class);
    private int count;

    @Override
    public void read(ChannelHandlerContext ctx) throws Exception {
        LOG.info("请求读更多的数据，但是我要休息一下");
        TimeUnit.SECONDS.sleep(5);
        super.read(ctx);
//        LOG.info("想读数据，我不同意，我不把请求往前传递");

    }
}
