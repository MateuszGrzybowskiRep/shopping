package com.websystique.springmvc.controller;


import com.websystique.springmvc.dao.CategoryDAO;
import com.websystique.springmvc.dao.ProductDAO;
import com.websystique.springmvc.dto.Category;
import com.websystique.springmvc.dto.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/manage")
public class ManagmentControler {

    @Autowired
    private CategoryDAO categoryDAO;

    @Autowired
    private ProductDAO productDAO;

    private static final Logger logger = LoggerFactory.getLogger(ManagmentControler.class);

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public ModelAndView showManageProducts(@RequestParam(name="operation",required = false)String operation) {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("userClickManageProducts",true);
        mv.addObject("title","Manage Product");
        Product nProduct = new Product();
        nProduct.setSupplierId(1);
        nProduct.setActive(true);
        mv.addObject("product",nProduct);
        if(operation!=null){
            if(operation.equals("product")){
                mv.addObject("message", "Product Submitted Successfuly");
            }
        }

        return mv;
    }

    @ModelAttribute("categories")
    public List<Category> getCategories(){
        return categoryDAO.list();
    }

    @RequestMapping(value = "/products",method = RequestMethod.POST)
    public String handleProductSubmission(@Valid @ModelAttribute("product")Product mProduct, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("userClickManageProducts",true);
            model.addAttribute("title","Manage Product");

            return "page";
        }

        logger.info(mProduct.toString());
        productDAO.add(mProduct);
        return "redirect:/manage/products?operation=product";
    }

}
