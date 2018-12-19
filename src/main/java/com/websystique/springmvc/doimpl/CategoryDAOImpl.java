package com.websystique.springmvc.doimpl;

import com.websystique.springmvc.dao.Category;
import com.websystique.springmvc.dto.CategoryDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {


    private static List<Category> categories = new ArrayList<Category>();

    static {
        Category category0 = new Category();
        category0.setId(1);
        category0.setName("Television");
        category0.setDescription("description");
        category0.setImageURL("CAT_0.png");
        categories.add(category0);


        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Mobile");
        category1.setDescription("description");
        category1.setImageURL("CAT_1.png");
        categories.add(category1);


        Category category2 = new Category();
        category2.setId(1);
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
        for (Category category : categories){
            if (category.getId()==id)
                return category;
        }
        return null;
    }


}
