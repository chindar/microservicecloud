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

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
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
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
