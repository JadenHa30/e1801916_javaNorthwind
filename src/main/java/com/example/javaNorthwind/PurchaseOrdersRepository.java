package com.example.javaNorthwind;

import org.springframework.data.repository.CrudRepository;
public interface PurchaseOrdersRepository extends CrudRepository<PurchaseOrders, Integer> {

}