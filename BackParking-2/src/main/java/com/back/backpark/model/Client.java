package com.back.backpark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name= "first_name")
    private String firstName;
    
    @Column(name= "last_name") // Changed to lowercase for consistency
    private String lastName;
    
    @Column(name= "email_id") // Changed to lowercase and underscored for consistency
    private String emailId;
    
    public Client() {}

    public Client(String firstName, String lastName, String emailId) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }
    
    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
