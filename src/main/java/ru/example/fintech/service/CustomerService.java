package ru.example.fintech.service;

import ru.example.fintech.dto.CustomerDto;

import java.util.List;


public interface CustomerService {

    List<CustomerDto> findAll();

    void create(CustomerDto customerDto);

    void update(int id, CustomerDto customerDto);

    void delete(int id);

    CustomerDto findById(int id);
}
