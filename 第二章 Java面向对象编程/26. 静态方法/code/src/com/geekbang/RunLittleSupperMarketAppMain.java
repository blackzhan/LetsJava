package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;

public class RunLittleSupperMarketAppMain {
    public static void main(String[] args) {
        // 创建一个小超市类
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket(
            "有家小超市", "浦东新区世纪大道666号",
            100, 200, 200);

        System.out.println("VIP的折上折折扣最终为：" + MerchandiseV2.getDiscountOnDiscount(littleSuperMarket));

    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
