package com.hydrowind.phonedation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column
  private String province;

  @Column
  private String city;

  @Column
  private String details;

  @Column(precision = 11, scale = 8)
  private double latitude;

  @Column(precision = 11, scale = 8)
  private double longitude;

  @OneToOne
  private User user;
}
