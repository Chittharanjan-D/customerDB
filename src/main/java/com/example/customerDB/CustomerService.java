package com.example.customerDB;

import java.util.List;

public interface CustomerService {

    List<CustomerEntity> getAllCustomers();

    CustomerEntity getCustomerById(Long customerId);

    CustomerEntity createCustomer(CustomerEntity customer);

    CustomerEntity updateCustomer(Long customerId, CustomerEntity customer);

    void deleteCustomer(Long customerId);
}
