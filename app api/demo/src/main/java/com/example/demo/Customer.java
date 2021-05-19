package com.example.demo;

import org.springframework.data.annotation.Id;


public class Customer {

  @Id
  public String id;

  public String firstName;
  public String lastName;
  public int contactno;

  public Customer() {}

  public Customer( String firstName, String lastName,int contactno) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.contactno = contactno;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%s, firstName='%s', lastName='%s',contact no = %d ]",
        id, firstName, lastName, contactno);
  }

}