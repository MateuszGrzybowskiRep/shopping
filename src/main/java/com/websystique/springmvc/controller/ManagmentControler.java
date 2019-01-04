package com.websystique.springmvc.controller;


import com.websystique.springmvc.dao.CategoryDAO;
import com.websystique.springmvc.dao.ProductDAO;
import com.websystique.springmvc.dto.Category;
import com.websystique.springmvc.dto.Product;
import com.websystique.springmvc.util.FileUploadUtility;
import com.websystique.springmvc.validation.ProductValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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
            else if (operation.equals("category")){
                mv.addObject("message", "Category Submitted Successfuly");
            }
        }

        return mv;
    }


    @RequestMapping(value = "/{id}/product", method = RequestMethod.GET)
    public ModelAndView showEditProducts(@PathVariable int id) {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("userClickManageProducts",true);
        mv.addObject("title","Manage Product");
        Product nProduct = productDAO.get(id);

        mv.addObject("product",nProduct);

        return mv;
    }

    @RequestMapping(value = "/products",method = RequestMethod.POST)
    public String handleProductSubmission(@Valid @ModelAttribute("product")Product mProduct, BindingResult result, Model model, HttpServletRequest request){
       if (mProduct.getId()==0){
           new ProductValidator().validate(mProduct,result);
       }else {
           if(!mProduct.getFile().getOriginalFilename().equals("")){
               new ProductValidator().validate(mProduct,result);
           }
       }

        if(result.hasErrors()){
            model.addAttribute("userClickManageProducts",true);
            model.addAttribute("title","Manage Product");
            model.addAttribute("massage","Validation failed for Product Submission!");
            return "page";
        }
        logger.info(mProduct.toString());

        if(mProduct.getId() == 0){
            productDAO.add(mProduct);
        }
        else {
            productDAO.update(mProduct);

        }
        if(!mProduct.getFile().getOriginalFilename().equals("")){
            FileUploadUtility.uploadFile(request, mProduct.getFile(),mProduct.getCode());
        }

        return "redirect:/manage/products?operation=product";
    }
    @RequestMapping(value = "/product/{id}/activation",method = RequestMethod.POST)
    @ResponseBody
    public String handleProductActivation(@PathVariable int id){
        Product product = productDAO.get(id);
        boolean isActive = product.isActive();
        product.setActive(!product.isActive());
        productDAO.update(product);
        return (isActive)? "You have succesfully deactived the product with id" + product.getId()
                            : "You have succesfully deactived the product with id" + product.getId();
    }
    @RequestMapping(value = "/category",method = RequestMethod.POST)
    public String handleCategorySubmission(@ModelAttribute Category category){
        categoryDAO.add(category);

        return "redirect:/manage/products?operation=category";

    }


    @ModelAttribute("categories")
    public List<Category> getCategories(){
        return categoryDAO.list();
    }
    @ModelAttribute("category")
    public Category getCategory(){
        return new Category();
    }

}