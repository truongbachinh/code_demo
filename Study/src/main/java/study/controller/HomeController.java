package study.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import study.model.Company;

@Controller

public class HomeController {

    @Autowired
    @Qualifier("company")
    Company company;

    @RequestMapping("/home")
    public String getHome()
    {
        return "home";
    }
    @RequestMapping("/")
    public String getIndex()
    {
        return "index";
    }


    @RequestMapping(value = "/greenwich", method = RequestMethod.GET)
    public String getGreenwich(ModelMap modelMap){
        modelMap.addAttribute("company", company);
        return "greenwich";
    }
}
