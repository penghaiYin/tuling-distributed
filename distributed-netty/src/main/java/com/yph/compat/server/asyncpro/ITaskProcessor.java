package com.yph.compat.server.asyncpro;

import com.yph.compat.vo.MyMessage;

/**
 * @author ：yph
 * @description ：消息转任务处理器
 */
public interface ITaskProcessor {

    Runnable execAsyncTask(MyMessage msg);

}
