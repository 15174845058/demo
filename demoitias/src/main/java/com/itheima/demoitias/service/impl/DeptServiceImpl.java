package com.itheima.demoitias.service.impl;

import com.itheima.demoitias.mapper.DeptMapper;
import com.itheima.demoitias.pojo.Dept;
import com.itheima.demoitias.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    public void delete(Integer id) {
        deptMapper.deleteByid(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        deptMapper.insert(dept);
    }

    @Override
    public Dept selectByDeptId(Integer id) {
        return deptMapper.selectByDeptId(id);
    }

    @Override
    public void update(Dept dept) {
        deptMapper.update(dept);
    }

//    @Override
//    public void update(Integer id, String name) {
//        deptMapper.update(id,name);
//    }

}
