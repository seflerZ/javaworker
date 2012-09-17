package com.alibaba.taobao.worker;

public interface LifeCycle {
    void start();

    void init();

    void stop();
}
