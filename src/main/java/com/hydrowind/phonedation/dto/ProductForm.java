package com.hydrowind.phonedation.dto;

import java.util.Date;

public class ProductForm {

  private long id;
  private String name;
  private String brand;
  private String description;
  private String color;
  private double weight;
  private int condition;
  private String imgUrl;
  private int stock;
  private double price;
  private Date dateCreated;
  private Date dateModified;
  private Date dateDeleted;
  private Long modifiedFrom;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public int getCondition() {
    return condition;
  }

  public void setCondition(int condition) {
    this.condition = condition;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Date getDateModified() {
    return dateModified;
  }

  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  public Date getDateDeleted() {
    return dateDeleted;
  }

  public void setDateDeleted(Date dateDeleted) {
    this.dateDeleted = dateDeleted;
  }

  public Long getModifiedFrom() {
    return modifiedFrom;
  }

  public void setModifiedFrom(Long modifiedFrom) {
    this.modifiedFrom = modifiedFrom;
  }
}
