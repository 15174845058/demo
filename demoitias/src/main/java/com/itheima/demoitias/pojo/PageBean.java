package com.itheima.demoitias.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页查询结果分装类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PageBean {
    private Long total;//总记录数
    private List rows;//当前页数据列表
}
