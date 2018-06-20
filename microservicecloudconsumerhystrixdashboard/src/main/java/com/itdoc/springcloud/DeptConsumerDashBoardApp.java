/**
 * @filename: DeptConsumerDashBoardApp.java
 * @desc 服务监控启动类
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-20 17:41
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180620   Wang Chinda   create
 * 20180620   Wang Chinda   modify   method()
 */
package com.itdoc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @desc 服务监控启动类
 * @author Wang Chinda
 * @create 2018-06-20 17:41
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashBoardApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashBoardApp.class, args);
    }
}
