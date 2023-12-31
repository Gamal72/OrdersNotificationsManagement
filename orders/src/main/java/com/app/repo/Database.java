package com.app.repo;

import com.app.model.*;

import java.util.ArrayList;
import java.util.Map;

public interface Database {
    Boolean addOrder(Order order);

    Boolean addProduct(Product product);

    Order getOrder(int id);

    Product getProduct(String serialNo);


    int getNextOrderId();

    int getProductStock(String serialNo);

    ArrayList<Product> getAllProducts();

    Map<String, Integer>getStatistics();

    static Database getInstance() {
        return null;
    }

    Boolean userExists(String username);


    void addUser(User user);


    User getUser(String username);

    Boolean updateUser(String username, User user);



}
