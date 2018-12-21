package com.websystique.springmvc.dto;


import com.websystique.springmvc.dao.Category;

import java.util.List;

public interface CategoryDAO {

   /* boolean add(Category category);*/

    List<Category> list();
    Category get(int id);
}
