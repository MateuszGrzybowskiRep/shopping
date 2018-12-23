package com.websystique.springmvc.test;

import com.websystique.springmvc.dao.ProductDAO;

import com.websystique.springmvc.dto.Product;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class ProductTestCase {
    private static AnnotationConfigApplicationContext context;
    private static ProductDAO productDAO;
    private Product product;

    @BeforeClass
    public static void init() {
        context = new AnnotationConfigApplicationContext();
        context.scan("com.websystique.springmvc");
        context.refresh();
        productDAO = (ProductDAO) context.getBean("productDAO");
    }




    @Test
    public void testList(){

        product = productDAO.get(1);
        assertEquals("dziala", 6, productDAO.list().size());
    }


}