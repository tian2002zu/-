package cn.Management.controll;

import cn.Management.service.EdoccategoryService;
import cn.Management.service.EdocentryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import cn.Management.entity.*;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/edocentry")
public class EdocentryControll {
    @Resource
    private EdocentryService edocentryService;

    @Resource
    private EdoccategoryService edoccategoryService;

    //查询所有
    @RequestMapping(value = "/edoclist"/*, method = RequestMethod.POST*/)
    public String edoclist(@RequestParam(value = "categoryId", required = false) String id, Model model) {
        System.out.println("进来查询");
       Integer _id = 0;
        if (id == "" || id == null) {
            _id = 0;
        } else {
            _id = Integer.parseInt(id);
        }

        List<Edocentry> entryList = edocentryService.centrylist(_id);
        List<Edoccategory> categoryList = edoccategoryService.edoceCategorylist();
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("entryList", entryList);
        return "index";
    }

/*打開添加頁面*/


    //打开添加
    @RequestMapping(value = "/openAddList")
    public String openaddList(Model model) {
        //查询下拉框
        List<Edoccategory> categoryList = edoccategoryService.edoceCategorylist();
        //数据返回到添加頁面
        model.addAttribute("categoryList", categoryList);

        return "addedo";
    }

    //新增
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String Add(Edocentry edo) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = "2011-07-09 ";
        Date date = null;
        try {
            date = formatter.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
          edo.setCreatedate(date);
        if (edocentryService.addcentry(edo)) {
            System.out.println("新增成功");
            return "redirect:/edocentry/edoclist";
        }
        System.out.println("新增失败");
        return "addedo";
    }
    /*打開修改頁面 根据id查询单条记录的對象 并且返回到修改页面*/

    //執行修改操作 成功返回列表頁面  失败 则不返回
    //打开修改
   /* @RequestMapping(value = "/openupdate")
    public String openupdate(@RequestParam(value = "id", required = false) Integer id, Model model) {
        //查询单个值
        Edocentry edocEntry = edocentryService.edocentry(id);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //日期转换为字符串格式

        edocEntry.setTime(simpleDateFormat.format(edocEntry.getCreateDate()));
        //查询对象的值
        model.addAttribute("edocEntry", edocEntry);
        //下拉框的值
        List<EdocCategory> categoryList = categoryService.edoceCategorylist();
        model.addAttribute("categoryList", categoryList);
        return "update";
    }*/

    @RequestMapping(value = "/update.html", method = RequestMethod.GET)
    public String update(Edocentry edo) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = "2011-07-09 ";
        Date date = null;
        try {
            date = formatter.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
         edo.setCreatedate(date);
        if (edocentryService.update(edo)) {
            System.out.println("修改成功");
            return "index";
        }
        System.out.println("修改失败");
        return "info";
    }

    //删除
    @RequestMapping(value = "/delete.html", method = RequestMethod.GET)
    public String delete(@RequestParam("id") Integer id) {
        System.out.println(id + "---------id");
        if (edocentryService.delete(id)) {
            System.out.println("刪除成功");
            return "redirect:/edocEntry/edoclist";
        }
        System.out.println("删除失败");
        return "delete";
    }
}
