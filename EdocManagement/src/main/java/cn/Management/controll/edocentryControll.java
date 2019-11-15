package cn.Management.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping
public class edocentryControll {
    @Resource
    private edocentryControll edocentryControll;

    @RequestMapping("/add.html")
    public String Add(Model model,
                      @RequestParam(value="id",required = false)Integer id){

        return "add";
    }
}
