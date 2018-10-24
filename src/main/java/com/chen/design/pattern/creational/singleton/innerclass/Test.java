package com.chen.design.pattern.creational.singleton.innerclass;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 静态内部类单例-线程安全测试类
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Test {

    public static void main(String[] args) {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("ThreadPool-%d").build();
        ExecutorService singleThreadPool = new ThreadPoolExecutor(2, 2,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

        singleThreadPool.execute(new Task());
        singleThreadPool.execute(new Task());

        singleThreadPool.shutdown();
    }
}
