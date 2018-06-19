/**
 * @filename: DeptClientServiceFallbackFactory.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-19 15:15
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180619   Wang Chinda   create
 * 20180619   Wang Chinda   modify   method()
 */
package com.itdoc.springcloud.service;

import com.itdoc.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @desc
 * @author Wang Chinda
 * @create 2018-06-19 15:15
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                Dept dept = new Dept();
                dept.setDeptNo(id);
                dept.setdName("该ID：" + id + "没有对应的信息, Consumer客户端提供的降级信息, 此刻服务Provider已经关闭");
                dept.setDbSource("no this database in MySQL");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public DiscoveryClient getDiscoveryClient() {
                return null;
            }
        };
    }
}
