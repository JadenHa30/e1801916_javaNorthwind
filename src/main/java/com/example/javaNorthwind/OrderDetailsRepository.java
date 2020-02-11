package com.example.javaNorthwind;

import org.springframework.data.repository.CrudRepository;
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer> {

}