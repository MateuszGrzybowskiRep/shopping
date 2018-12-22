package com.websystique.springmvc.doimpl;

import com.websystique.springmvc.dto.Category;
import com.websystique.springmvc.dao.CategoryDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
//nie dziala autowire

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean add(Category category) {
        try {
            sessionFactory.getCurrentSession().persist(category);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Category> list() {
        return null;
    }

    @Override
    public Category get(int id) {
        return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
    }

    @Override
    public boolean ubtate(Category category) {
        try {
            sessionFactory.getCurrentSession().update(category);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delate(Category category) {
        category.setActive(false);
        try {
            sessionFactory.getCurrentSession().update(category);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }




/*

   private static List<Category> categories = new ArrayList<Category>();

      static {
        Category category0 = new Category();
        category0.setId(1);
        category0.setName("Television");
        category0.setDescription("description");
        category0.setImageURL("CAT_0.png");
        categories.add(category0);


        Category category1 = new Category();
        category1.setId(2);
        category1.setName("Mobile");
        category1.setDescription("description");
        category1.setImageURL("CAT_1.png");
        categories.add(category1);


        Category category2 = new Category();
        category2.setId(3);
        category2.setName("Laptop");
        category2.setDescription("description");
        category2.setImageURL("CAT_2.png");
        categories.add(category2);
    }

    @Override
    public List<Category> list() {
        return categories;
    }
    @Override
    public Category get(int id) {
        for (Category category : categories) {
            if (category.getId() == id)
                return category;
        }
        return null;
    }
    @Override
    @Transactional
    public boolean add(Category category) {
        try {
            sessionFactory.getCurrentSession().persist(category);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    */
}
