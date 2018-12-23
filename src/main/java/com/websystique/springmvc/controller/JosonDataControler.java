package com.websystique.springmvc.controller;


import com.websystique.springmvc.dao.ProductDAO;
import com.websystique.springmvc.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/json/data")

public class JosonDataControler {
    @Autowired
    private ProductDAO productDAO;


    @RequestMapping("/all/products")
    @ResponseBody
    public List<Product> getAllProducts() {
        //return productDAO.list();
       return productDAO.listActiveProducts();

    }

    @RequestMapping("/category/{id}/products")
    @ResponseBody
    public List<Product> getProductsByCategory(@PathVariable int id) {

        return productDAO.listActiveProductsByCategory(id);

    }



}

