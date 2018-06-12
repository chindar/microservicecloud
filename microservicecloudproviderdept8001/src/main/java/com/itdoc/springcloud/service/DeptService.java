/**
 * @filename: DeptService.java
 * @desc 员工业务层
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-12 10:24
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180612   Wang Chinda   create
 * 20180612   Wang Chinda   modify   method()
 */
package com.itdoc.springcloud.service;

import com.itdoc.springcloud.entities.Dept;

import java.util.List;

/**
 * @desc 员工业务层
 * @author Wang Chinda
 * @create 2018-06-12 10:24
 */
public interface DeptService {

    /**
     * 添加员工信息
     * @param dept
     * @return
     */
    public boolean add(Dept dept);

    /**
     * 根据id获取员工信息
     * @param id
     * @return
     */
    public Dept get(Long id);

    /**
     * 获取全部员工信息
     * @return
     */
    public List<Dept> list();

}
