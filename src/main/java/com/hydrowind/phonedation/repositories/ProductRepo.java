package com.hydrowind.phonedation.repositories;

import java.util.List;

import com.hydrowind.phonedation.entities.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepo extends CrudRepository<Product, Long> {

  @Query("SELECT p FROM Product p WHERE p.name LIKE :name")
  public List<Product> findAllByName(@Param("name") String name);

}
