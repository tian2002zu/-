package cn.Management.service;

import cn.Management.dao.edocentryMapper;
import java.util.List;

public interface edocentryService {
    //通过分类查询
    List<edocentryMapper> centrylist(Integer categoryId);

    //新增
    Boolean addcentry(edocentryMapper edocentryMapper);

    //删除
    Boolean delete(Integer id);

    //修改
    Boolean update(edocentryMapper edocentryMapper);
}
