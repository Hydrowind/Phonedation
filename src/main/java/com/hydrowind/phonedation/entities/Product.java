package com.hydrowind.phonedation.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column
  private String name;

  @Column
  private String brand;

  @Column
  private String description;

  @Column
  private String color;

  @Column(precision = 12, scale = 2)
  private double weight;

  @Column(name = "\"condition\"")
  private int condition;

  @Column
  private String imgUrl;

  @Column
  private int stock;

  @Column(precision = 12, scale = 2)
  private double price;

  @Column
  @Temporal(TemporalType.TIMESTAMP)
  private Date dateCreated;

  @Column
  @Temporal(TemporalType.TIMESTAMP)
  private Date dateModified;

  @Column
  @Temporal(TemporalType.TIMESTAMP)
  private Date dateDeleted;

  @OneToOne
  private Product modifiedFrom;

  @PrePersist
  private void setDateCreated() {
    this.dateCreated = new Date();
  }
}
