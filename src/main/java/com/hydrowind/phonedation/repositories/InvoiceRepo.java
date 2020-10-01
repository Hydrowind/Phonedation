package com.hydrowind.phonedation.repositories;

import com.hydrowind.phonedation.entities.Invoice;

import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepo extends CrudRepository<Invoice, Long> {

}
