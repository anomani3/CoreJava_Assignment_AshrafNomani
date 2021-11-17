package com.ashraf.mvc_firstass;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldControlller {
 @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String index(ModelMap model){
	 System.out.println("Index method working");
        model.addAttribute("message", "cargaGeneracion");
        return "helloworld";
    }
}