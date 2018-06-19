/**
 * @filename: DeptClientService.java
 * @desc 部门业务业务层接口, 根据Feign实现负载均衡
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-18 19:34
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180618   Wang Chinda   create
 * 20180618   Wang Chinda   modify   method()
 */
package com.itdoc.springcloud.service;

import com.itdoc.springcloud.entities.Dept;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @desc 部门业务业务层接口, 根据Feign实现负载均衡
 * @author Wang Chinda
 * @create 2018-06-18 19:34
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
@RequestMapping("/dept/")
public interface DeptClientService {

    /**
     * 添加部门信息
     * @param dept
     * @return
     */
    @PostMapping("add")
    public boolean add(@RequestBody Dept dept);

    /**
     * 根据id获取部门信息
     * @param id
     * @return
     */
    @GetMapping("get/{id}")
    public Dept get(@PathVariable("id") Long id);

    /**
     * 获取全部部门信息
     * @return
     */
    @GetMapping("list")
    public List<Dept> list();

    /**
     * 获取服务发现列表
     * @return
     */
    @GetMapping("discovery")
    public DiscoveryClient getDiscoveryClient();

}
