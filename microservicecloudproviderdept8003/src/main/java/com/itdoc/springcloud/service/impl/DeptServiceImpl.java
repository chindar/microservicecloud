/**
 * @filename: DeptServiceImpl.java
 * @desc 部门业务层实现
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-12 10:27
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180612   Wang Chinda   create
 * 20180612   Wang Chinda   modify   method()
 */
package com.itdoc.springcloud.service.impl;

import com.itdoc.springcloud.dao.DeptDao;
import com.itdoc.springcloud.entities.Dept;
import com.itdoc.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wang Chinda
 * @desc 部门业务层实现
 * @create 2018-06-12 10:27
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    /**
     * 添加部门信息
     *
     * @param dept
     * @return
     */
    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    /**
     * 根据id获取部门信息
     *
     * @param id
     * @return
     */
    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    /**
     * 获取全部部门信息
     *
     * @return
     */
    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
