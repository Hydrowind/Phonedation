package com.hydrowind.phonedation.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column
  private String email;

  @Column
  private String password;

  @Column
  private String fullname;

  @Column
  @Temporal(TemporalType.DATE)
  private Date dob;

  @Column
  private int gender;

  @Column
  private String phoneNumber;

  @Column
  private String photoUrl;

  @Column
  @Temporal(TemporalType.TIMESTAMP)
  private Date dateJoined;

  @Column
  private int role;

  @PrePersist
  private void setDateJoined() {
    this.dateJoined = new Date();
  }
}
