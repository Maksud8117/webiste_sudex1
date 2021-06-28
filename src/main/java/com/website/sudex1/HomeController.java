package com.website.sudex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){ return "index";}

    @RequestMapping("/contacts")
    public String contacts() { return "contacts";}
}
