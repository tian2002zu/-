package cn.Management.service;

import cn.Management.dao.EdoccategoryMapper;
import cn.Management.entity.Edoccategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EdoccategoryServiceImpl implements EdoccategoryService {

    @Resource
    private EdoccategoryMapper edocCategoryMapper;

    @Override
    public List<Edoccategory> edoceCategorylist() {
        return edocCategoryMapper.edoceCategorylist();
    }
}
