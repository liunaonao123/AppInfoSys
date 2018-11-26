package cn.appsys.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("sjlx")
public class IndexController {
    private Logger logger=Logger.getLogger(IndexController.class);
    @RequestMapping(value = "index")
    public String index(){
        //logger.info(userCode);
        return "index";
    }

    @RequestMapping(value = "test")
    public String success(@RequestParam String userCode, Model model){
        model.addAttribute(userCode);
        return "success";
    }
}
