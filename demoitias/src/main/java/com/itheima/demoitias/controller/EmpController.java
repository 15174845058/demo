package com.itheima.demoitias.controller;

import com.itheima.demoitias.pojo.PageBean;
import com.itheima.demoitias.pojo.Result;
import com.itheima.demoitias.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 员工管理Controller
 */
@Slf4j
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/emps")
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize){
//        if (page==null) page=1;
//        if (pageSize==null) pageSize=10;
        log.info("分页查询，参数：{}，{}",page,pageSize);
        //调用Service分页查询
        PageBean pageBean = empService.page(page,pageSize);
        return Result.success(pageBean);
    }

}
