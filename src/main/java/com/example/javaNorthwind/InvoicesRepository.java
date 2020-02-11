package com.example.javaNorthwind;

import org.springframework.data.repository.CrudRepository;
public interface InvoicesRepository extends CrudRepository<Invoices, Integer> {

}