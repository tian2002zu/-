package cn.Management.service;


import cn.Management.entity.Edoccategory;

import java.util.List;

public interface EdoccategoryService {
    /**
     * 查询所有分类信息
     * @return 分类列表
     */
    public List<Edoccategory> edoceCategorylist();

}
