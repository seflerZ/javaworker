package com.alibaba.taobao.worker;

public interface TaskProcessor {
    void process(WorkerTask<?> task);
}
