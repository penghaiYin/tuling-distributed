package com.yph.compat.server.asyncpro;

import com.yph.compat.vo.MyMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：yph
 * @description ：消息转任务处理器的缺省实现
 */
public class DefaultTaskProcessor implements ITaskProcessor{

    private static final Logger LOG = LoggerFactory.getLogger(DefaultTaskProcessor.class);
    @Override
    public Runnable execAsyncTask(MyMessage msg) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                LOG.info("DefaultTaskProcessor模拟任务处理："+msg.getBody());
            }
        };
        return task;
    }
}
