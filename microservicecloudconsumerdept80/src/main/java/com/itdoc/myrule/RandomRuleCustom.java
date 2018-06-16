/**
 * @filename: RandomRuleCustom.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-16 16:22
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180616   Wang Chinda   create
 * 20180616   Wang Chinda   modify   method()
 */
package com.itdoc.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @author Wang Chinda
 * @desc
 * @create 2018-06-16 16:22
 */
public class RandomRuleCustom extends AbstractLoadBalancerRule {

    /**
     * 需求: 当一个服务器调用5次, 再调用下一服务。
     */

    /**
     * 总共被调用的此时, 目前要求为每个服务被调用5次
     */
    int total = 0;
    /**
     * 当前被调用的服务号
     */
    int currentIndex = 0;


    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {
        // TODO: 2018/6/16 待实现
    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    public Server choose(ILoadBalancer lb, Object key) {

        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == 0) {
                /*
                 * No servers. End regardless of pass, because subsequent passes
                 * only get more restrictive.
                 */
                return null;
            }

            // 当服务调用次数小于5次的话, 每次服务调用次数+1, 否则将服务调用次数重置为0, 当前被调用服务编号+1, 若当前服务号大于或等于服务总
            // 数, 将服务编号重置为0
            if (total < 5) {
                total++;
            } else {
                total = 0;
                currentIndex++;
                if (currentIndex >= allList.size()) {
                    currentIndex = 0;
                }
            }
            server = upList.get(currentIndex);


            if (server == null) {
                /*
                 * The only time this should happen is if the server list were
                 * somehow trimmed. This is a transient condition. Retry after
                 * yielding.
                 */
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            // Shouldn't actually happen.. but must be transient or a bug.
            server = null;
            Thread.yield();
        }

        return server;


    }

}
