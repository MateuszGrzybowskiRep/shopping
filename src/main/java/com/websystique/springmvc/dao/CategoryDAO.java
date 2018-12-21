package com.websystique.springmvc.dao;


import com.websystique.springmvc.dto.Category;

import java.util.List;

public interface CategoryDAO {

   boolean add(Category category);

    List<Category> list();
    Category get(int id);
}
