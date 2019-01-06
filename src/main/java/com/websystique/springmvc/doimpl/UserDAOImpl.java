package com.websystique.springmvc.doimpl;


import com.websystique.springmvc.dao.UserDAO;
import com.websystique.springmvc.dto.Address;
import com.websystique.springmvc.dto.Cart;
import com.websystique.springmvc.dto.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("userDAO")
@Transactional
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
    public Address getBillingAddress(User user) {
            String selectQuery = "FROM Address WHERE user = :user AND billing =:billing";
            try{
                return sessionFactory.getCurrentSession()
                        .createQuery( selectQuery, Address.class)
                        .setParameter("user",user)
                        .getSingleResult();
            }
            catch (Exception ex){
                ex.printStackTrace();
                return null;
            }
    }
    @Override
    public List<Address> listShippingAddress(User user) {
        String selectQuery = "FROM Address WHERE user = :user AND shipping =:shipping";
        try{
            return sessionFactory.getCurrentSession()
                    .createQuery( selectQuery, Address.class)
                    .setParameter("shipping",true)
                    .getResultList();
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }



    @Override
    public boolean updateCart(Cart cart) {
        try{
            sessionFactory.getCurrentSession().update(cart);
            return true;
        }
        catch (Exception ex){
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public User getByEmail(String email) {
        String selectQuery = "FROM User WHERE email =:email";
        try{
           return sessionFactory.getCurrentSession()
                     .createQuery( selectQuery, User.class)
                     .setParameter("email",email)
                     .getSingleResult();

        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

}
