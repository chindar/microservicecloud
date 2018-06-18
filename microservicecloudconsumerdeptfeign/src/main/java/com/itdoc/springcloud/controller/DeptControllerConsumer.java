/**
 * @filename: DeptControllerConsumer.java
 * @desc 部门微服务消费者控制层
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-12 14:03
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180612   Wang Chinda   create
 * 20180612   Wang Chinda   modify   method()
 */
package com.itdoc.springcloud.controller;

import com.itdoc.springcloud.entities.Dept;
import com.itdoc.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @desc 部门微服务消费者控制层
 * @author Wang Chinda
 * @create 2018-06-12 14:03
 */
@RestController
@RequestMapping("/consumer/dept/")
public class DeptControllerConsumer {

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.service.get(id);
    }

    @RequestMapping(value = "list")
    public List<Dept> list()
    {
        return this.service.list();
    }

    @RequestMapping(value = "add")
    public Object add(Dept dept)
    {
        return this.service.add(dept);
    }
}
