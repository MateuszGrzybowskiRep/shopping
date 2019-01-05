package com.websystique.springmvc.dao;

import com.websystique.springmvc.dto.Address;
import com.websystique.springmvc.dto.Cart;
import com.websystique.springmvc.dto.User;

public interface UserDAO {


    boolean addUser(User user);

    boolean addAddres(Address addres);

    boolean addCart(Cart cart);

}
