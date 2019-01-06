package com.websystique.springmvc.test;

import com.websystique.springmvc.dao.UserDAO;

import com.websystique.springmvc.dto.Address;
import com.websystique.springmvc.dto.Cart;
import com.websystique.springmvc.dto.User;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class AddressTestCase {
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
    public void testAddress(){
/*        user = new User();
        user.setFirstName("Mateusz");
        user.setLastName("Grzybowski");
        user.setEmail("mateusz@gmail.com");
        user.setContactNumber("777888999");
        user.setRole("USER");
        user.setPassword("123");*/

        user = userDAO.getByEmail("tom@gmail.com");

      //  assertEquals("failed to add user",true,userDAO.addUser(user));

        address = new Address();
        address.setAddressLineOne("srebn 1");
        address.setAddressLineTwo("Krakowskie");
        address.setCity("Krakow");
        address.setState("K");
        address.setCountry("Poland");
        address.setPostalCode("1111");
        address.setBilling(true);

        address.setUser(user);

        assertEquals("failed to add addres",true,userDAO.addAddres(address));

    }


}