package com.example.javaNorthwind;

import org.springframework.data.repository.CrudRepository;
public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

}