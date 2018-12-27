package com.websystique.springmvc.controller;


import com.websystique.springmvc.dao.ProductDAO;
import com.websystique.springmvc.dto.Category;
import com.websystique.springmvc.dao.CategoryDAO;
import com.websystique.springmvc.dto.Product;
import com.websystique.springmvc.exception.ProductNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageControler {

    @Autowired
    private CategoryDAO categoryDAO;

    @Autowired
    private ProductDAO productDAO;

    private static final Logger logger = LoggerFactory.getLogger(PageControler.class);

    @RequestMapping(value = {"/", "home","index"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Home");
        logger.info("inside page");
        logger.debug("inside page");
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
    //widok na pojedynczy produkt
    @RequestMapping(value = "/show/{id}/product")
        public ModelAndView showSingleProduct(@PathVariable ("id")int id) throws ProductNotFoundException {
        ModelAndView mv =new ModelAndView("page");
        Product product=productDAO.get(id);

        if (product== null) throw new ProductNotFoundException();

        product.setViews(product.getViews()+1);
        mv.addObject("title",product.getName());
        mv.addObject("product",product);
        mv.addObject("userClickShowProduct",true);


        return mv;
    }


}




