package com.ldf.sercurity.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @author lidefu
 * @date 2019/2/22 16:40
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("data")
    public String getData(){
        return "success";
    }

    @GetMapping("view")
    public ModelAndView getView(){
        return new ModelAndView("hello");
    }

    @GetMapping("redirect")
    public ModelAndView redirectRedirect(){
        return new ModelAndView(new RedirectView("https://www.baidu.com/"));
    }

}
