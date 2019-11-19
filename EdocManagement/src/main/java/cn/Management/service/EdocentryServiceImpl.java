package cn.Management.service;

import cn.Management.dao.EdocentryMapper;
import org.springframework.stereotype.Service;
import cn.Management.entity.Edocentry;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EdocentryServiceImpl implements EdocentryService {

    @Resource
    private EdocentryMapper edocentrymapper;

    @Override
    public List<Edocentry> centrylist(Integer categoryId) {
        List<Edocentry> centrylist = edocentrymapper.centrylist(categoryId);
        return centrylist;
    }


    @Override
    public Boolean addcentry(Edocentry edocentry) {
        boolean flag = false;
        Integer check= edocentrymapper.addcentry(edocentry);
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
    public Boolean update(Edocentry edocentry) {
        if (edocentrymapper.update(edocentry)>0){
            return true;
        }
        return false;
    }

}
