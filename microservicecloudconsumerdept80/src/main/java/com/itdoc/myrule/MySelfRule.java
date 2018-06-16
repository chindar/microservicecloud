/**
 * @filename: MySelfRule.java
 * @desc 自定义负载均衡算法
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-16 16:17
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180616   Wang Chinda   create
 * 20180616   Wang Chinda   modify   method()
 */
package com.itdoc.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @desc 自定义负载均衡算法
 * @author Wang Chinda
 * @create 2018-06-16 16:17
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule getMySelfRule() {
        return new RandomRuleCustom();
    }

}
