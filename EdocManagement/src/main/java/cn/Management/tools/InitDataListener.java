package cn.Management.tools;


import org.springframework.beans.factory.InitializingBean;

import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;

/**
 * 初始加载数据
 */
public class InitDataListener implements InitializingBean, ServletContextAware {
    @Resource
    private edoc_categoryService airQualityIndexService;
    @Resource
    private edoc_entryService districtService;

    @Override
    public void afterPropertiesSet() throws Exception {
    }
    @Override
    public void setServletContext(ServletContext arg0) {
        //当前页
        int currentPageNo=1;
        Integer totalCount = airQualityIndexService.getAirCount(0);
        PageSupport pages = new PageSupport();
        pages.setCurrentPageNo(1);//页的下标
        pages.setPageSize(5);//页面容量
        pages.setTotalCount(totalCount);//总条数
        //查询总数量
        int totalPageCount = pages.getTotalPageCount();
        List<AirQualityIndex> airQualityIndices = airQualityIndexService.getAirList(0, 1, 5);
        //查询区域
        List<District> districtList = districtService.getDistrictList(0);
        arg0.setAttribute("list", airQualityIndices);
        arg0.setAttribute("districtList", districtList);
        arg0.setAttribute("totalCount", totalCount);
        arg0.setAttribute("totalPageCount",totalPageCount);
        arg0.setAttribute("currentPageNo",currentPageNo);
    }


}