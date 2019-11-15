package cn.Management.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface edocentryMapper {
    //通过分类查询
    List<edocentryMapper> centrylist(@Param("categoryId") Integer categoryId);

    //新增
    Integer addcentry(edocentryMapper edocentryMapper);

    //删除
    Integer delete(@Param("id")Integer id);

    //修改
    Integer update(edocentryMapper edocentryMapper);
}
