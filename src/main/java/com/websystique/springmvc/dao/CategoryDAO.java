package com.websystique.springmvc.dao;


import com.websystique.springmvc.dto.Category;

import java.util.List;

public interface CategoryDAO {


    List<Category> list();
    Category get(int id);
    boolean add(Category category);
    boolean ubtate(Category category);
    boolean delate(Category category);
}
