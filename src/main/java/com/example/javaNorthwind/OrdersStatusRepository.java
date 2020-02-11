package com.example.javaNorthwind;

import org.springframework.data.repository.CrudRepository;
public interface OrdersStatusRepository extends CrudRepository<OrdersStatus, Integer> {

}