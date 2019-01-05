package com.websystique.springmvc.dao;

import com.websystique.springmvc.dto.Address;
import com.websystique.springmvc.dto.Cart;
import com.websystique.springmvc.dto.User;

public interface UserDAO {



    boolean addUser(User user);

    User getByEmail(String email);

    boolean addAddres(Address addres);

    boolean updateCart(Cart cart);

}
