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

public class UserTestCase {
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

/*
    @Test
    public void testAdd(){
        user = new User();
        user.setFirstName("Mateusz");
        user.setLastName("Grzybowski");
        user.setEmail("mateusz@gmail.com");
        user.setContactNumber("777888999");
        user.setRole("USER");
        user.setPassword("123");

        assertEquals("failed to add user",true,userDAO.addUser(user));

        address = new Address();
        address.setAddressLineOne("101/B Jadoo Society, Krissh Nagar");
        address.setAddressLineTwo("Near Kaabil Store");
        address.setCity("Warszawa");
        address.setState("Maharashtra");
        address.setCountry("Poland");
        address.setPostalCode("400001");
        address.setBilling(true);


        assertEquals("failed to add user",true,userDAO.addAddres(address));

            if(user.getRole().equals("USER")){
            cart = new Cart();
            cart.setUser(user);
            assertEquals("failed to add user",true,userDAO.addCart(cart));

        }

    }*/



    @Test
    public void testAdd(){
        user = new User();
        user.setFirstName("Tomasz");
        user.setLastName("Grzybowski");
        user.setEmail("tom@gmail.com");
        user.setContactNumber("777888999");
        user.setRole("USER");
        user.setPassword("123");

        if(user.getRole().equals("USER")){
            cart = new Cart();
            cart.setUser(user);
            user.setCart(cart);

        }
        assertEquals("failed to add user",true,userDAO.addUser(user));


    }

  @Test
    public void testUpdateCard(){
      user = userDAO.getByEmail("mat@gmail.com");
      cart = user.getCart();
      cart.setGrandTotal(5555);
      cart.setCartLines(2);
      assertEquals("Filed update",true, userDAO.updateCart(cart));
  }
}