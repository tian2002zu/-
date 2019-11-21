package cn.Management.dao;

import org.apache.ibatis.annotations.Param;
import cn.Management.entity.*;
import java.util.List;

public interface EdocentryMapper {
    //通过分类查询
    List<Edocentry> centrylist(@Param("categoryId") Integer categoryId);

    //新增
    Integer addcentry(Edocentry edocentry);

    //删除
    Integer delete(@Param("id")Integer id);

    //修改
    Integer update(Edocentry edocentry);

    //修改頁面传值
    Edocentry edocentry(@Param("id")Integer id);
}
