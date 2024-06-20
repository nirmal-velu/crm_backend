package com.crm.service.Entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Login.java
@Entity
@Table(name = "login")
public class Login {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(name = "phone_number")
 private String phoneNumber;

 @Column(name = "password")
 private String password;

 @Column(name = "created_on")
 private LocalDateTime createdOn;

 @Column(name = "created_by")
 private String createdBy;

 // Getters and setters

 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getPhoneNumber() {
     return phoneNumber;
 }

 public void setPhoneNumber(String phoneNumber) {
     this.phoneNumber = phoneNumber;
 }

 public String getPassword() {
     return password;
 }

 public void setPassword(String password) {
     this.password = password;
 }

 public LocalDateTime getCreatedOn() {
     return createdOn;
 }

 public void setCreatedOn(LocalDateTime createdOn) {
     this.createdOn = createdOn;
 }

 public String getCreatedBy() {
     return createdBy;
 }

 public void setCreatedBy(String createdBy) {
     this.createdBy = createdBy;
 }
}
