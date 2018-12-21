package com.websystique.springmvc.controller;


import com.websystique.springmvc.dto.Category;
import com.websystique.springmvc.dao.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageControler {

    @Autowired
    private CategoryDAO categoryDAO;

    @RequestMapping(value = {"/", "home","index"})
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
    @RequestMapping(value ="/show/all/products")
    public ModelAndView showAllProducts() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "All Products");
        mv.addObject("categories",categoryDAO.list());//passing list
        mv.addObject("userClickAllProducts", true);
        return mv;
    }
    @RequestMapping(value ="/show/category/{id}/products")
    public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("page");
        //categoryDAO fetch single category
        Category category = null;
        category= categoryDAO.get(id);
        mv.addObject("title", category.getName());
        //passing single category
        mv.addObject("categories",categoryDAO.list());//passing list
        mv.addObject("category",category);
        mv.addObject("userClickCategoryProducts", true);
        return mv;
    }


}




