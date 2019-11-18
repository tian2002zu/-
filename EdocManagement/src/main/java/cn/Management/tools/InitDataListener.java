package cn.Management.tools;

import cn.Management.entity.Edoccategory;
import cn.Management.entity.Edocentry;
import cn.Management.service.EdoccategoryServiceImpl;
import cn.Management.service.EdocentryServiceImpl;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;

/**
 * 初始加载查询数据
 */
public class InitDataListener implements InitializingBean, ServletContextAware {
    @Resource
    private EdocentryServiceImpl edocEntryService;
    @Resource
    private EdoccategoryServiceImpl categoryService;


    @Override
    public void afterPropertiesSet() throws Exception {
    }

    //查询页面
    @Override
    public void setServletContext(ServletContext arg0) {
        List<Edocentry> entryList = edocEntryService.centrylist(0);
        List<Edoccategory> categoryList = categoryService.edoceCategorylist();

        arg0.setAttribute("categoryList", categoryList);

        arg0.setAttribute("entryList", entryList);
    }

}