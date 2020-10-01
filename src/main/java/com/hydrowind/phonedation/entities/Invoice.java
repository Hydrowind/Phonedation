package com.hydrowind.phonedation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invoices")
public class Invoice {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column
  private String transactionNo;

  @Column
  private String status;

  @ManyToOne
  private Address address;

  @ManyToOne
  private Payment payment;

  @ManyToOne
  private Shipment shipment;

  @OneToOne
  private OrderCart cart;
}
