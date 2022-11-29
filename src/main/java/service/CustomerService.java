package service;

import model.Customer;

import java.util.ArrayList;

public interface CustomerService {
    ArrayList<Customer> findAll();
    void save (Customer customer);
    Customer findById(int id);
    void update (int id,Customer customer);
    void remove (int id);
}
