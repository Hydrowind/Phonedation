package com.hydrowind.phonedation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ewallets")
public class EWallet {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(precision = 12, scale = 2)
  private double balance;

  @Column
  private int pin;

  @OneToOne
  private User user;
}
