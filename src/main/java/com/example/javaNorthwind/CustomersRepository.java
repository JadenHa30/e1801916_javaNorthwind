package com.example.javaNorthwind;

import org.springframework.data.repository.CrudRepository;
public interface CustomersRepository extends CrudRepository<Customers, Integer> {

}