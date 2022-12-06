package com.apiexample.project1.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.sql.DataSourceDefinition;

@Document(collection = "customers")
public class Customer {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    public Customer(){}
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setId(String newId){
        this.id = newId;
    }
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id='%s', firstName ='%s', lastName='%s']",
                id,firstName,lastName);
    }
}

