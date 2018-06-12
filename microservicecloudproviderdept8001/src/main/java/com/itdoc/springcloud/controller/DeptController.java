/**
 * @filename: DeptController.java
 * @desc 员工控制层
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @desc 员工控制层
 * @author Wang Chinda
 * @create 2018-06-12 10:30
 */
@RestController
@RequestMapping("/dept/")
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 添加员工信息
     * @param dept
     * @return
     */
    @PostMapping("add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    /**
     * 根据id获取员工信息
     * @param id
     * @return
     */
    @GetMapping("get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    /**
     * 获取全部员工信息
     * @return
     */
    @GetMapping("list")
    public List<Dept> list() {
        return deptService.list();
    }
}
