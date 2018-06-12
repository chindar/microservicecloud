/**
 * @filename: DeptDao.java
 * @desc 员工数据层接口
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-06-12 10:19
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180612   Wang Chinda   create
 * 20180612   Wang Chinda   modify   method()
 */
package com.itdoc.springcloud.dao;

import com.itdoc.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @desc 员工数据层接口
 * @author Wang Chinda
 * @create 2018-06-12 10:19
 */
@Mapper
public interface DeptDao {

    /**
     * 添加员工信息
     * @param dept
     * @return
     */
    public boolean addDept(Dept dept);

    /**
     * 根据id查询员工信息
     * @param id
     * @return
     */
    public Dept findById(@Param("deptNo") Long id);

    /**
     * 查询全部员工信息
     * @return
     */
    public List<Dept> findAll();

}
