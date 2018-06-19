/**
 * @filename: DeptController.java
 * @desc 部门控制层
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-12 10:30
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180612   Wang Chinda   create
 * 20180612   Wang Chinda   modify   method()
 */
package com.itdoc.springcloud.controller;

import com.itdoc.springcloud.entities.Dept;
import com.itdoc.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc 部门控制层
 * @author Wang Chinda
 * @create 2018-06-12 10:30
 */
@RestController
@RequestMapping("/dept/")
public class DeptController {

    @Autowired
    private DeptService deptService;


    /**
     * 根据id获取部门信息
     * @param id
     * @return
     */
    @GetMapping("get/{id}")
    @HystrixCommand(fallbackMethod = "getProcessHystrix")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.get(id);

        if (dept == null) {
            throw new NullPointerException("该ID：" + id + "没有没有对应的信息");
        }

        return dept;
    }

    /**
     * 触发熔断器调用方法, 对应@HystrixCommand修饰并fallbackMethod属性为此方法名的的类, 只要方法出现调用异常, 熔断器就会被触发
     * @param id
     * @return
     */
    public Dept getProcessHystrix(@PathVariable("id") Long id) {
        Dept dept = new Dept();
        dept.setDeptNo(id);
        dept.setdName("该ID：" + id + " 在数据库中没有对应的信息, null--@HystrixCommand");
        dept.setDbSource("no this database in MySQL");
        return dept;
    }

}
