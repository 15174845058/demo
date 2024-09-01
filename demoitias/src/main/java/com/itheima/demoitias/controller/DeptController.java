package com.itheima.demoitias.controller;

import com.itheima.demoitias.pojo.Dept;
import com.itheima.demoitias.pojo.Result;
import com.itheima.demoitias.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@RestController
@RequestMapping("/depts")
@Slf4j
public class DeptController {

    //注释@Slf4j之后就不用下面的创建对象了
    //private static Logger log = LoggerFactory.getLogger(DeptController.class);

    @Autowired
    private DeptService deptService;

    /**
     * 查询部门数据
     * @return
     */
    //@RequestMapping(value = "/depts",method = RequestMethod.GET)
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");

        //调用service查询部门数据
        List<Dept> deptList = deptService.list();

        return Result.success(deptList);
    }


    /**
     * 删除部门
     * @return
     */
    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}", id);
        //调用service删除部门
        deptService.delete(id);
        return Result.success();
    }


    /**
     * 添加部门
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("xim部门:{}",dept);
        //调用service方法
        deptService.add(dept);
        return Result.success();
    }


    /**
     * 修改部门
     */
//    @PutMapping("/dept")
//    public Result update(@PathVariable Integer id,String name){
//        log.info("根据id修改部门：{}",id);
//        log.info("输入修改后的部门名称：{}",name);
//
//        deptService.update(id,name);
//        return Result.success();
//    }
    @GetMapping("/{id}")
    public Result selectByDeptId(@PathVariable Integer id) {
        //日志记录
        log.info("根据id查询部门：{}", id);
        //调用service层功能
        Dept dept = deptService.selectByDeptId(id);
        //响应
        return Result.success(dept);
    }
    @PutMapping
    public Result update(@RequestBody Dept dept) {
        //日志记录
        log.info("修改部门：{}", dept);
        //调用service层功能
        deptService.update(dept);
        //响应
        return Result.success();
    }
}
