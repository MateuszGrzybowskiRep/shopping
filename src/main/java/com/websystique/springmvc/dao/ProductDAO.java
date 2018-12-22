package com.websystique.springmvc.dao;

import com.websystique.springmvc.dto.Product;

import java.util.List;


public interface ProductDAO {

    Product get(int productId);
    List<Product> list();
    boolean add(Product product);
    boolean update(Product product);
    boolean delete(Product product);

    List<Product> getProductsByParam(String param, int count);


    List<Product> listActiveProducts();
    List<Product> listActiveProductsByCategory(int categoryId);
    List<Product> getLatestActiveProducts(int count);

}