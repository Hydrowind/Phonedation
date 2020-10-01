package com.hydrowind.phonedation.services;

import javax.transaction.Transactional;

import com.hydrowind.phonedation.entities.Product;
import com.hydrowind.phonedation.repositories.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {

  @Autowired
  private ProductRepo productRepo;

  public Product save(Product data) {
    return productRepo.save(data);
  }

  public Iterable<Product> findAll() {
    return productRepo.findAll();
  }

  public Iterable<Product> findAllByName(String name) {
    return productRepo.findAllByName(name);
  }
}
