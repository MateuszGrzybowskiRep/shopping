package com.websystique.springmvc.doimpl;


import com.websystique.springmvc.dao.UserDAO;
import com.websystique.springmvc.dto.Address;
import com.websystique.springmvc.dto.Cart;
import com.websystique.springmvc.dto.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addUser(User user) {
        try{
            sessionFactory.getCurrentSession().persist(user);
            return true;
        }
        catch (Exception ex){
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean addAddres(Address addres) {
        try{
            sessionFactory.getCurrentSession().persist(addres);
            return true;
        }
        catch (Exception ex){
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean addCart(Cart cart) {
        try{
            sessionFactory.getCurrentSession().persist(cart);
            return true;
        }
        catch (Exception ex){
            ex.printStackTrace();
            return false;
        }

    }

}
