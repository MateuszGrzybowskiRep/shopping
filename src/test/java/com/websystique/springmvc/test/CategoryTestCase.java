package com.websystique.springmvc.test;

import com.websystique.springmvc.dto.Category;
import com.websystique.springmvc.dao.CategoryDAO;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class CategoryTestCase {
    private static AnnotationConfigApplicationContext context;
    private static CategoryDAO categoryDAO;
    private Category category0;

    @BeforeClass
    public static void init(){
        context = new AnnotationConfigApplicationContext();
        context.scan("com.websystique.springmvc");
        context.refresh();

        categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
    }

    @Test
    public void testAddCategory(){

         category0 = new Category();


        category0.setName("Television");
        category0.setDescription("description");
        category0.setImageURL("CAT_0.png");

        assertEquals("dziala", true, categoryDAO.add(category0));
    }


}
