package cn.Management.dao;

import cn.Management.entity.Edoccategory;

import java.util.List;

public interface EdoccategoryMapper {
    /**
     * 查询所有分类信息
     * +@return 分类列表
     */
    public List<Edoccategory> edoceCategorylist();
}
