package com.websystique.springmvc.dao;

import com.websystique.springmvc.dto.Address;
import com.websystique.springmvc.dto.Cart;
import com.websystique.springmvc.dto.User;

import java.util.List;

public interface UserDAO {



    boolean addUser(User user);

    User getByEmail(String email);

    boolean addAddres(Address addres);

    Address getBillingAddress(User user);

    List<Address> listShippingAddress(User user);

    boolean updateCart(Cart cart);

}
