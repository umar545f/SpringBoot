package com.in28minutes.myfirstwebapp.helloApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/view-html")
    public String viewPage()
    {
        return "sayHello";
    }
}
