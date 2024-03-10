package com.in28minutes.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String viewPage(Model model)
    {
        model.addAttribute("name",getLoggedInUsername());
        return "welcome";
    }
    public String getLoggedInUsername()
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

}
