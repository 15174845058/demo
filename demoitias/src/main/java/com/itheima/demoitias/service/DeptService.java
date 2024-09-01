package com.itheima.demoitias.service;

import com.itheima.demoitias.pojo.Dept;

import java.util.List;

/**
 * 部门管理
 */
public interface DeptService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Dept> list();


    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id);


    /**
     * 添加部门
     *
     */
    void add(Dept dept);

    //void update(Integer id, String name);
    /**
     * 根据ID查询部门
     * @param id
     */
    Dept selectByDeptId(Integer id);

    /**
     * 修改部门
     * @param dept
     */
    void update(Dept dept);
}
