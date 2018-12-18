package com.websystique.springmvc.controller;


import com.websystique.springmvc.dto.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageControler {

    @Autowired
    private CategoryDAO categoryDAO;

    @RequestMapping(value = {"/", "home"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Home");
        mv.addObject("categories",categoryDAO.list());//passing list
        mv.addObject("userClickHome", true);
        return mv;
    }

    @RequestMapping(value = "/about")
    public ModelAndView acout() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "About Us");
        mv.addObject("userClickAbout", true);
        return mv;
    }

    @RequestMapping(value = "/contact")
    public ModelAndView contact() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Conctact Us");
        mv.addObject("userClickContact", true);
        return mv;
    }


}




