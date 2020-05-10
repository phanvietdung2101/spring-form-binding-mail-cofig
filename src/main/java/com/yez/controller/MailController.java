package com.yez.controller;

import com.yez.model.MailConfig;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {
    private static MailConfig mailConfig;

    static {
        mailConfig = new MailConfig();
    }

    @GetMapping(value = "/mail-config" )
    public ModelAndView getConfigForm(@RequestParam(value = "msg",required = false) String msg){
        ModelAndView modelAndView = new ModelAndView("mail-config");
        MailConfig mailConfig = MailController.mailConfig;
        MethodParameter parameter;
        modelAndView.addObject("mailConfig",mailConfig);
        if(msg != null)
            modelAndView.addObject("msg",msg);

        return modelAndView;
    }

    @RequestMapping(value = "/mail-config-save",method = RequestMethod.POST)
    public ModelAndView setConfigForm(@ModelAttribute("mailConfig") MailConfig mailConfig){
        MailController.mailConfig = mailConfig;
        ModelAndView modelAndView = new ModelAndView("redirect:/mail-config");
        String  msg = mailConfig.getLanguages() + " yyy ";
        modelAndView.addObject("msg",msg);
        return modelAndView;
    }
}
