package cn.Management.service;

import cn.Management.entity.Edocentry;

import java.util.List;

public interface EdocentryService {
    //通过分类查询
    List<Edocentry> centrylist(Integer categoryId);

    //新增
    Boolean addcentry(Edocentry edocentry);

    //删除
    Boolean delete(Integer id);

    //修改
    Boolean update(Edocentry edocentry);

    //修改頁面传值
    Edocentry edocentry(Integer id);
}
