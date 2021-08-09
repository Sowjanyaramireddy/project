package com.example.demo1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {



}
