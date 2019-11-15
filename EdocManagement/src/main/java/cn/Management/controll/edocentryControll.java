package cn.Management.controll;

import cn.Management.service.edocentryService;
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
@RequestMapping("edocentry")
public class edocentryControll {
    @Resource
    private edocentryService edocentryService;

    //新增
    @RequestMapping(value = "/add.html",method = RequestMethod.POST)
    public String Add(edocentry edo){
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
        String s= "2011-07-09 ";
        Date date=null;
        try {
             date =  formatter.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        edo.setCreatedate(date);
        if(edocentryService.addcentry(edo)){
            return "redirect:/edocentry/edolist";
        }
        return "add";
    }

    //修改
    @RequestMapping(value = "/update.html",method = RequestMethod.POST)
    public String update(edocentry edo){
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
        String s= "2011-07-09 ";
        Date date=null;
        try {
            date =  formatter.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        edo.setCreatedate(date);
        if(edocentryService.update(edo)){
            return "redirect:/edocentry/edolist";
        }
        return "info";
    }

    //删除
    @RequestMapping(value = "/delete.html",method = RequestMethod.POST)
    public String delete(@RequestParam("id")Integer id){
        System.out.println(id+"---------id");
        if(edocentryService.delete(id)){
            return "redirect:/edocentry/edolist";
        }
        return "delete";
    }
}
