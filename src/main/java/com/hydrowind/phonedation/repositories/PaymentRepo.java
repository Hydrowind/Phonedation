package com.hydrowind.phonedation.repositories;

import com.hydrowind.phonedation.entities.Payment;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment, Long> {

}
