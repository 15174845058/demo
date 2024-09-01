package com.itheima.demoitias.mapper;

import com.itheima.demoitias.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {

    /**
     * 根据ID删除部门
     * @param id
     */
    @Delete("delete from dept where id = #{id}")
     void deleteByid(Integer id) ;

    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from dept")
    List<Dept> list();


    /**
     * 新增部门
     * @param dept
     */
    @Insert(
            "insert into dept(name,create_time,update_time) " +
                    "values(#{name},#{createTime},#{updateTime})"
    )
    void insert(Dept dept);


//    /**
//     * 修改部门
//     * @param id
//     * @param name
//     */
//    @Update(
//            "update dep set name = #{name} where id = #{id}"
//    )
//    void update(Integer id, String name);

    @Select("select * from dept where id=#{id}")
    Dept selectByDeptId(Integer id);
    @Update("update dept set name = #{name},update_time=now() where id =#{id}")
    void update(Dept dept);
}
