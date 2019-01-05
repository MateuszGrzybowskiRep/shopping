package com.websystique.springmvc.test;

import com.websystique.springmvc.dao.UserDAO;

import com.websystique.springmvc.dao.UserDAO;
import com.websystique.springmvc.dto.Address;
import com.websystique.springmvc.dto.Cart;
import com.websystique.springmvc.dto.Product;
import com.websystique.springmvc.dto.User;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class ProductTestCase2 {
    private static AnnotationConfigApplicationContext context;
    private static UserDAO userDAO;
    private User user = null;
    private Cart cart = null;
    private Address address = null;

    @BeforeClass
    public static void init() {
        context = new AnnotationConfigApplicationContext();
        context.scan("com.websystique.springmvc");
        context.refresh();
        userDAO = (UserDAO) context.getBean("userDAO");
    }




    @Test
    public void testList(){


    }


}