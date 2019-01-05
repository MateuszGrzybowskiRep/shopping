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
    private Category category;

    @BeforeClass
    public static void init(){
        context = new AnnotationConfigApplicationContext();
        context.scan("com.websystique.springmvc");
        context.refresh();
        categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
    }



  @Test
    public void testGet(){

        category = categoryDAO.get(1);
        assertEquals("dziala", "tel", category.getName());
    }


  @Test
    public void testUbtate(){

        category = categoryDAO.get(1);
        category.setName("TV");
        assertEquals("dziala", true, categoryDAO.ubtate(category));
    }


    @Test
    public void testDelate(){

        category = categoryDAO.get(1);
        assertEquals("dziala", true, categoryDAO.delate(category));
    }


    @Test
    public void testList(){

        category = categoryDAO.get(1);
        assertEquals("dziala", 3, categoryDAO.list().size());
    }

}
