package com.SpringCrud.SpringAngular.CustomerRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.SpringCrud.SpringAngular.Entity.Customer;

@EnableJpaRepositories //adding records in database
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
