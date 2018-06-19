/**
 * @filename: ConfigBean.java
 * @desc 配置部门微服务消费者
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-12 14:06
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180612   Wang Chinda   create
 * 20180612   Wang Chinda   modify   method()
 */
package com.itdoc.springcloud.configbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @desc 配置部门微服务消费者
 * @author Wang Chinda
 * @create 2018-06-12 14:06
 */
@Configuration
public class ConfigBean {

    /**
     * 声明RESTful API通讯模板
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 修改默认轮询算法, 获取随机算法
     * @return
     */
    @Bean
    public IRule getMyRule() {
        return new RandomRule();
    }
}
