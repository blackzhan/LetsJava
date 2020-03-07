package com.geekbang.game.aotp.util;

import static com.geekbang.game.aotp.util.Constants.*;

public class OutputText {
    private String[] textLines;
    private volatile long interval;

    public OutputText(String... textLines) {
        this(textLines, NORMAL_INTERVAL);
    }

    public OutputText(String[] textLines, long interval) {
        this.textLines = textLines;
        this.interval = interval;
    }

    public void setSlow() {
        this.interval = SLOW_INTERVAL;
    }

    public void setNormal() {
        this.interval = NORMAL_INTERVAL;
    }

    public void setQuick() {
        this.interval = QUICK_INTERVAL;
    }

    public String[] getTextLines() {
        return textLines;
    }

    public void setTextLines(String[] textLines) {
        this.textLines = textLines;
    }

    public long getInterval() {
        return interval;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
