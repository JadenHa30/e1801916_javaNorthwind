package com.example.javaNorthwind;

import org.springframework.data.repository.CrudRepository;
public interface PurchaseOrderStatusRepository extends CrudRepository<PurchaseOrderStatus, Integer> {

}