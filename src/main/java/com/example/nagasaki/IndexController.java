package com.example.nagasaki;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String indexGet(Model model) {
        model.addAttribute("name", "長崎通信です！");
        return "index";
    }
    @RequestMapping(value="/nagasaki", method= RequestMethod.GET)
    @ResponseBody
    public String nagasakiGet() {

        return "nagasaki";
    }
}
