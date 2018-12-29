package com.websystique.springmvc.controller;


import com.websystique.springmvc.dao.CategoryDAO;
import com.websystique.springmvc.dto.Category;
import com.websystique.springmvc.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/manage")
public class ManagmentControler {

    @Autowired
    CategoryDAO categoryDAO;


    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public ModelAndView showManageProducts() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("userClickManageProducts",true);
        mv.addObject("title","Manage Product");
        Product nProduct = new Product();
        nProduct.setSupplierId(1);
        nProduct.setActive(true);
        mv.addObject("product",nProduct);
        return mv;
    }
    @ModelAttribute("categories")
    public List<Category> getCategories(){
        return categoryDAO.list();
    }
}
