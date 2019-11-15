package cn.Management.service;

import cn.Management.dao.edocentryMapper;
import org.springframework.stereotype.Service;
import cn.Management.entity.edocentry;

import javax.annotation.Resource;
import java.util.List;

@Service
public class edocentryServiceImpl implements edocentryService{

    @Resource
    private edocentryMapper edocentrymapper;

    @Override
    public List<edocentryMapper> centrylist(Integer categoryId) {
        List<edocentryMapper> centrylist = edocentrymapper.centrylist(categoryId);
        return centrylist;
    }

    @Override
    public Boolean addcentry(edocentryMapper edocentryMapper1) {
        boolean flag = false;
        Integer check= edocentrymapper.addcentry(edocentryMapper1);
        if(check>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public Boolean delete(Integer id) {
        boolean flag = false;
        Integer check= edocentrymapper.delete(id);
        if(check>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public Boolean update(edocentryMapper edocentryMapper1) {
        boolean flag = false;
        Integer check= edocentrymapper.update(edocentryMapper1);
        if(check>0){
            flag=true;
        }
        return flag;
    }

}
