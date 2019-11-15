package cn.Management.service;

import cn.Management.entity.edocentry;

import java.util.List;

public interface edocentryService {
    //通过分类查询
    List<edocentry> centrylist(Integer categoryId);

    //新增
    Boolean addcentry(edocentry edocentry);

    //删除
    Boolean delete(Integer id);

    //修改
    Boolean update(edocentry edocentry);
}
