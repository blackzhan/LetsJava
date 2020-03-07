package com.geekbang.exception;

import java.io.IOException;

public class MyAutoClosableResource implements AutoCloseable {

    private String resName;
    private int counter;

    public MyAutoClosableResource(String resName) {
        this.resName = resName;
    }

    public String read() throws IOException {
        counter++;
        if (Math.random() > 0.1) {
            return "You got lucky to read from " + resName + " for " + counter + " times...";
        } else {
            throw new IOException("resource不存在哦");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("资源释放了:" + resName);
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
