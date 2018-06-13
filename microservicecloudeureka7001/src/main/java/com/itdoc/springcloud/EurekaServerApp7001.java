/**
 * @filename: EurekaServerApp7001.java
 * @desc Eureka服务端7001
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-13 9:11
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180613   Wang Chinda   create
 * 20180613   Wang Chinda   modify   method()
 */
package com.itdoc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @desc Eureka服务端7001
 * @author Wang Chinda
 * @create 2018-06-13 9:11
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp7001.class, args);
    }
}
