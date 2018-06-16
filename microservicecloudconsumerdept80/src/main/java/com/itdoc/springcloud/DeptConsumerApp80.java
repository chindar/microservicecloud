/**
 * @filename: DeptConsumerApp80.java
 * @desc 部门微服务消费者启动类
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-12 13:53
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180612   Wang Chinda   create
 * 20180612   Wang Chinda   modify   method()
 */
package com.itdoc.springcloud;

import com.itdoc.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @desc 部门微服务消费者启动类
 * @author Wang Chinda
 * @create 2018-06-12 13:53
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)
public class DeptConsumerApp80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp80.class, args);
    }
}
